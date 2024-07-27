package api;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import application.Product;
import application.Controller;


public class Jdbc {
	static String discription =null;
	static int quantity = 0;
	static float price = 0;
	static float amount =0;
	static float total_amount = 0;
	private static String url = "jdbc:mysql://localhost:3306/invoice";
	private static String username = "root";
	private static String password = "1506";
		public static void insert(Controller control) {
			
			int invoice_num = control.getInnum();
			String invoice_date = control.getIndate();
			  String cus_name = control.getCus_name();
			  String mobile = control.getMobile_no();
			  String bill_add = control.getBill_add();
			  String Email = control.getEmail();
			  String ship_name = control.getShip_name();
			  String ship_add = control.getShip_add();
			  String Items = null; 
			  String Quantities = null;
			  String Prices = null;
			  String Amounts = null;
			  
			  
			  for(Product pd : control.tableview.getItems()) {
			  total_amount += pd.getAmount() ;
			  }
			  
			  JsonArray jsonarray1 = new JsonArray();
			  JsonArray jsonarray2 = new JsonArray();
			  JsonArray jsonarray3 = new JsonArray();
			  JsonArray jsonarray4 = new JsonArray();

			
			  for(Product pd:control.tableview.getItems()) {
				  discription =pd.getItem();
				  quantity = pd.getQuantity();
				  price = pd.getPrice();
				  amount = pd.getAmount();
				  
				  JsonObject jsonobject1 = new JsonObject();
				  JsonObject jsonobject2 = new JsonObject();
				  JsonObject jsonobject3 = new JsonObject();
				  JsonObject jsonobject4 = new JsonObject();
				  
				  jsonobject1.addProperty("discription",discription );
				  jsonobject2.addProperty("quantity",quantity );
				  jsonobject3.addProperty("price",price );
				  jsonobject4.addProperty("amount",amount );
				  jsonarray1.add(jsonobject1);
				  jsonarray2.add(jsonobject2);
				  jsonarray3.add(jsonobject3);
				  jsonarray4.add(jsonobject4);
				  
			  }
			  
			  Gson gson = new GsonBuilder().setPrettyPrinting().create();
			  Items =gson.toJson(jsonarray1);
			  Quantities =gson.toJson(jsonarray2);
			  Prices =gson.toJson(jsonarray3);
			  Amounts =gson.toJson(jsonarray4);
			  
			  
			  
			try {
				Connection con = DriverManager.getConnection(url, username, password);
				String sql = "insert into InvoiceDetail(Invoice_no,Invoice_date,Customer_name,Billing_address,Email,Mobile_no,Shipping_name,Shipping_address)Values(?, ?, ?, ?, ?, ?, ?, ?);";
				String sql2 = "insert into ProductDetail(Invoice_id,Discription,Quantity,Price,Amount,Total_amount)Values(?, ?, ?, ?, ?, ?);";
				PreparedStatement ps = con.prepareStatement(sql);
				PreparedStatement ps2 = con.prepareStatement(sql2);
				//table InvoiceDetail//
				ps.setInt(1, invoice_num);
				ps.setString(2, invoice_date);
				ps.setString(3, cus_name);
				ps.setString(4, bill_add);
				ps.setString(5, Email);
				ps.setString(6, mobile);
				ps.setString(7, ship_name);
				ps.setString(8, ship_add);
				
				//table ProductDetail//
				ps2.setInt(1, invoice_num );
				ps2.setString(2, Items);
				ps2.setString(3, Quantities);
				ps2.setString(4, Prices);
				ps2.setString(5, Amounts);
				ps2.setFloat(6, total_amount);
				
				ps.executeUpdate();
				ps2.executeUpdate();
				
				
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
		}
		public static void read(Controller control) {
			
			
			
			getData gd = new getData();
			try {
				Connection con = DriverManager.getConnection(url, username, password);
				String sql = "select * from InvoiceDetail where Invoice_no = ?;";
				String sql2 = "select * from ProductDetail where Invoice_id= ?;";
				
				int invoiceno = control.getGetinovice_no();
				PreparedStatement ps = con.prepareStatement(sql);
				PreparedStatement ps2 = con.prepareStatement(sql2);
				ps.setInt(1, invoiceno);
				ps2.setInt(1, invoiceno);
				
				ResultSet rs = ps.executeQuery();
				ResultSet rs2 = ps2.executeQuery();
				
				while(rs.next()) {
					//setting value
					gd.setInvoice_no(rs.getInt("Invoice_no"));
					gd.setInvoice_date(rs.getString("Invoice_date"));
					gd.setCustomer_name(rs.getString("Customer_name"));
					gd.setBilling_address(rs.getString("Billing_address"));
					gd.setEmail(rs.getString("Email"));
					gd.setMobile_no(rs.getString("Mobile_no"));
					gd.setShipping_name(rs.getString("Shipping_name"));
					gd.setShipping_address(rs.getString("Shipping_name"));
					
//			
					//getting value
					control.innum = gd.getInvoice_no();
					control.indate = gd.getInvoice_date();
					control.cus_name = gd.getCustomer_name();
					control.bill_add = gd.getBilling_address();
					control.Email = gd.getEmail();
					control.mobile_no = gd.getMobile_no();
					control.ship_name = gd.getShipping_name();
					control.ship_add = gd.getShipping_address();
					
				
					}
				
				while(rs2.next()) {
					
				Gson gson = new Gson();
				String var = rs2.getString("Discription");
				String var2 = rs2.getString("Quantity");
				String var3 = rs2.getString("Price");
				String var4 = rs2.getString("Amount");
				
				JsonArray js = gson.fromJson(var,JsonArray.class);
				JsonArray js2 = gson.fromJson(var2,JsonArray.class);
				JsonArray js3 = gson.fromJson(var3,JsonArray.class);
				JsonArray js4 = gson.fromJson(var4,JsonArray.class);
			
		        for (int i = 0; i < js.size(); i++) {
		            String description = js.get(i).getAsJsonObject().get("discription").getAsString();
		            int quantity = js2.get(i).getAsJsonObject().get("quantity").getAsInt();
		            float price = js3.get(i).getAsJsonObject().get("price").getAsFloat();
		            float amount = js4.get(i).getAsJsonObject().get("amount").getAsFloat();

		            control.pd.add(new Product(description, quantity, price, amount));
		            }
		        
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public static void  delete(Controller control) {
			int invoice_no = control.getGetinovice_no();
			Connection con;
			try {
				con = DriverManager.getConnection(url, username, password);
				String sql = "delete from InvoiceDetail where Invoice_no = ?;";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, invoice_no);
				
				ps.executeUpdate();
				
				
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public static int getInvoiceNO(Controller control) {
			String querry = "select max(Invoice_no)as max_id from InvoiceDetail";
			int id = 0;
			try {
				Connection con = DriverManager.getConnection(url, username, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(querry);
				
				if(rs.next()) {
					
					id = rs.getInt("max_id");
					id++;
					control.innum =id;
				}else {
					control.innum = 1;
				}
				con.close();
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return id;
		}
}
