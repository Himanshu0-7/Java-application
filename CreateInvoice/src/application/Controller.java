package application;

import java.io.File;



import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;



import invoice.create;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import api.Jdbc;

public class Controller implements Initializable{
	@FXML
	private Button cancel;
	@FXML
	private Label inv_no;
	@FXML
	private DatePicker inv_date;
	@FXML
	private TextField customer_name;
	@FXML
	private TextField mobile;
	@FXML
	private TextArea billing_address;
	@FXML
	private TextField shipping_name;
	@FXML
	private TextField email;
	@FXML
	private Button delete_btn;
	@FXML
	private Button add_btn;
	@FXML
	private Button save_btn;
	@FXML
	private TextField emailInput;
	//TableView//
	
	float total =0;
	int arrayIndex = 1;
	@FXML
	public TableView<Product> tableview;
	@FXML
	private TableColumn<Product, String> discription;
	@FXML
	private TableColumn<Product, Integer> quantity;
	@FXML
	private TableColumn<Product, Float> price;
	@FXML
	private TableColumn<Product, Float> amount;
	@FXML
	private TextField itemInput;
	@FXML
	private TextField quantityInput;
	@FXML
	private TextField priceInput;
	@FXML
	private TextField Get_Invoie_no;
	@FXML
	private Label totalamount;
	//getter-setter variables//
	@FXML
	private TextArea shipping_address;
	public int innum;
	public String indate;
	public String cus_name;
	public String mobile_no;
	public String bill_add;
	public String Email;
	public String ship_name;
	public String ship_add;
	
	
	boolean isEmpty = false;
	
	public String item;
	public int quantity1;
	public float price1;
	public float amount1;
	
	private String grandtotal;
	//path
	public String path;
	
	//getinvoice no
	int getinovice_no;
	
	public List<Product> pd = new ArrayList<>();
	
	
	public int getInnum() {
		return innum;
	}
	public String getIndate() {
		return indate;
	}
	public String getCus_name() {
		return cus_name;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public String getBill_add() {
		return bill_add;
	}
	public String getEmail() {
		return Email;
	}
	public String getShip_name() {
		return ship_name;
	}
	public String getShip_add() {
		return ship_add;
	}
	public void setInnum(int innum) {
		this.innum = innum;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public void setBill_add(String bill_add) {
		this.bill_add = bill_add;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}
	public void setShip_add(String ship_add) {
		this.ship_add = ship_add;
	}
	
	public String getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(String grandtotal) {
		this.grandtotal = grandtotal;
	}
	
	
	public String getItem() {
		return item;
	}
	public int getQuantity1() {
		return quantity1;
	}
	public float getPrice1() {
		return price1;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setQuantity1(int quantity1) {
		this.quantity1 = quantity1;
	}
	public void setPrice1(float price1) {
		this.price1 = price1;
	}
	public void getdate(ActionEvent event) {
		try {
		LocalDate date = inv_date.getValue();
		indate = date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
		}catch(NullPointerException e) {
			
		}
		
		this.setIndate(indate.toString());
	}
	Stage stage;
	
	
	
	public int getGetinovice_no() {
		return getinovice_no;
	}
	public void setGetinovice_no(int getinovice_no) {
		this.getinovice_no = getinovice_no;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		Jdbc.getInvoiceNO(this);
		inv_no.setText(""+getInnum());
		discription.setCellValueFactory(new PropertyValueFactory<Product, String>("item"));
		quantity.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
		price.setCellValueFactory(new PropertyValueFactory<Product, Float>("price"));
		amount.setCellValueFactory(new PropertyValueFactory<Product, Float>("amount"));	
		
	}
	@FXML
	public void save(ActionEvent event) {
		
		try {
		this.setCus_name(customer_name.getText());
		this.setEmail(email.getText());
		this.setBill_add(billing_address.getText());
		this.setShip_name(shipping_name.getText());
		this.setShip_add(shipping_address.getText());
		}catch (NullPointerException e) {
			
		}
		try {
		totalamount.setText(""+total);
		this.setInnum(Integer.parseInt(inv_no.getText()));
		
		if(mobile.getText()!=null&&inv_date.getValue()!=null) {
		this.setMobile_no(mobile.getText());
		try {
			Jdbc.insert(this); // Call the pdf function from Create class
			clearData();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		}else {
			
		}
		
		}catch (NumberFormatException e) {
			
		}
		
    }
	@FXML
	public void addRow(ActionEvent event) {
		try {
		String curr_itemList = itemInput.getText();
		int curr_quantityList = Integer.parseInt(quantityInput.getText());
		float curr_priceList =Float.parseFloat(priceInput.getText());

		updateorAddon(curr_itemList,curr_quantityList,curr_priceList);
		}catch (Exception e) {
			
		}
	}				
	
	@FXML
	public void deleteRow(ActionEvent event) {
		
		int selecteditem = tableview.getSelectionModel().getSelectedIndex();
		if(selecteditem>-1) {
		tableview.getItems().remove(selecteditem);
		
		float amountList = Float.parseFloat(priceInput.getText())*Integer.parseInt(quantityInput.getText());
		total = total - amountList;
		totalamount.setText(""+total);
		}
	}
	
	public void cancelButton(ActionEvent event) {
		javafx.application.Platform.exit();	
	}
	private void updateorAddon(String discription, int quantity,float price) {
	
		ObservableList<Product> products = tableview.getItems();
		boolean itemExits = false;
		for(Product product : products) {
			if(product.getItem().equals(discription)) {
				itemExits = true;
				
				break;
			}
		}
		if(!itemExits) {
			float amount = quantity*price;
			Product newproduct = new Product(discription,quantity,price,amount);
			products.add(newproduct);
		}
		tableview.setItems(products);
		updateTotalAmount();
	}
	private void updateTotalAmount() {
		
	    ObservableList<Product> products = tableview.getItems();
	    total = 0;

	    for (Product product : products) {
	        total += product.getAmount();
	    }
	    totalamount.setText(String.valueOf(total));
	}
	
	@FXML
	private void downloadPdf() throws NullPointerException {
		try {
		this.setCus_name(customer_name.getText());
		this.setEmail(email.getText());
		this.setBill_add(billing_address.getText());
		this.setShip_name(shipping_name.getText());
		this.setShip_add(shipping_address.getText());
		this.setGrandtotal(totalamount.getText());
		}catch (NullPointerException e) {
			
		}
		
		try {
		totalamount.setText(""+total);
		this.setInnum(Integer.parseInt(inv_no.getText()));
		this.setMobile_no(mobile.getText());
		}catch (NumberFormatException e) {
			
		}
		
		try {
			
			FileChooser fileOpen = new FileChooser();
			File file = fileOpen.showSaveDialog(stage);
			if(file!=null) {
			String path = file.getPath();
			this.path = path;
			
			try {
				create.pdf(this);
			} catch (Exception e) {
				
				e.printStackTrace();
			} // Call the pdf function from Create class
			}else {
				
			}
		}catch (Exception e) {
		}
	}
	private void updatetable(String discription, int quantity,float price) {
		ObservableList<Product> products = tableview.getItems();
		boolean itemExits = false;
		for(Product product : products) {
			if(product.getItem().equals(discription)) {
				itemExits = true;
				break;
			}
			
		}
		if(!itemExits) {
			float amount = quantity*price;
			Product newproduct = new Product(discription,quantity,price,amount);
			products.add(newproduct);
		}
		
        updateTotalAmount();
        
	}
	@FXML
	private void Get() {
		clearData();
		try {
			
		this.setGetinovice_no(Integer.parseInt(Get_Invoie_no.getText()));
//		System.out.println(Integer.parseInt(Get_Invoie_no.getText()));

		Jdbc.read(this);
		
		setdata();
		if(indate!=null) {
		nonEditdable();
		}
		else {
			return;
		}
		
		}catch (NumberFormatException e) {
			
		}
		
	}
	
	private void setdata() {
		
		
		try {
			inv_no.setText(""+innum);
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.parse(indate,format);
			inv_date.setValue(date);
			customer_name.setText(cus_name);
			billing_address.setText(bill_add);
			email.setText(Email);
			mobile.setText(""+mobile_no);
			shipping_name.setText(ship_name);
			shipping_address.setText(ship_add);

			int quantity=0;
			float price =0;	
			String discription = null;
			
			for(Product items:pd) {
				discription=items.getItem();
				quantity=items.getQuantity();
				price = items.getPrice();
				items.getAmount();
				
				updatetable(discription,quantity,price);
			}
			
			
		}catch (Exception e) {
			
		}
	}
	@FXML
	private void delete() {
		
		try {
		this.setGetinovice_no(Integer.parseInt(Get_Invoie_no.getText()));
		}catch (NumberFormatException e) {
			
		}
		Jdbc.delete(this);
		clearData();
		clearVariables();
	}
	@FXML
	private void clearData() {
		Editable();
		try {
		int increment = Jdbc.getInvoiceNO(this);
		tableview.getItems().clear();
		pd.clear();
		inv_no.setText(""+increment);
		inv_date.setValue(null);
		customer_name.setText("");
		billing_address.setText("");
		email.setText("");
		mobile.setText("");
		shipping_name.setText("");
		shipping_address.setText("");
		priceInput.setText("");
		itemInput.setText("");
		quantityInput.setText("");
		totalamount.setText("");
//		Get_Invoie_no.setText("");
//		getinovice_no =0;	
		}catch (NullPointerException e) {
			
		}
			
		
	}
	private void nonEditdable() {
		try {		
		tableview.setEditable(false);
		customer_name.setMouseTransparent(true);
		billing_address.setMouseTransparent(true);
		email.setMouseTransparent(true);
		mobile.setMouseTransparent(true);
		shipping_name.setMouseTransparent(true);
		shipping_address.setMouseTransparent(true);
		priceInput.setMouseTransparent(true);
		itemInput.setMouseTransparent(true);
		quantityInput.setMouseTransparent(true);
		inv_date.setMouseTransparent(true);
		save_btn.setMouseTransparent(true);
		add_btn.setMouseTransparent(true);
		delete_btn.setMouseTransparent(true);
		}catch (NullPointerException e) {
			
		}
	}
	private void Editable() {
		try {
			
			tableview.setEditable(true);
			customer_name.setMouseTransparent(false);
			billing_address.setMouseTransparent(false);
			email.setMouseTransparent(false);
			mobile.setMouseTransparent(false);
			shipping_name.setMouseTransparent(false);
			shipping_address.setMouseTransparent(false);
			priceInput.setMouseTransparent(false);
			itemInput.setMouseTransparent(false);
			quantityInput.setMouseTransparent(false);
			tableview.setMouseTransparent(false);
			inv_date.setMouseTransparent(false);
			save_btn.setMouseTransparent(false);
			add_btn.setMouseTransparent(false);
			delete_btn.setMouseTransparent(false);
			
		}catch (NullPointerException e) {
			
		}
	}
	private void clearVariables() {
		innum =0;
		 indate = null;
		 cus_name= null;
		 mobile_no=null;
		 bill_add =null;
		 Email = null;
		 ship_name=null;
		 ship_add=null;
		 total = 0;
	}
//	private void Email(){
//		String email_inp = emailInput.getText();
//        System.out.println("preparing to send message ...");
//        String message = "Hello , Dear, this is message for security check . ";
//        String subject = "CodersArea : Confirmation";
//
//
//        List<String> recipients =new ArrayList<>();
//        recipients.add(email_inp);
//        
//        
//        String from = "himanshu260404@gmail.com";
//        
//
//        sendEmail(message,subject,recipients,from);
//    }
//
//    //this is responsible to send email..
//    private static void sendEmail(String message, String subject, List<String> recipients, String from) {
//
//        //Variable for gmail//
//        String host="smtp.gmail.com";
//
//        //get the system properties
//        Properties properties = System.getProperties();
////        System.out.println("PROPERTIES "+properties);
//
//        //setting important information to properties object
//
//        //host set
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port","465");
//        properties.put("mail.smtp.ssl.enable","true");
//        properties.put("mail.smtp.auth","true");
//
//        //Step 1: to get the session object..
//        Session session=Session.getInstance(properties, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("himanshu260404@gmail.com", "kyka qbze dmcr nvcb");
//            }
//
//
//
//        });
//
////        session.setDebug(true);
//
//        //Step 2 : compose the message [text,multi media]
//
//        try {
//        	MimeMessage m = new MimeMessage(session);
//        	
//
//            //from email
//            m.setFrom(from);
//
//            //adding recipient to message
//            for(String recipient:recipients) {
//                m.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
//            }
//
//            //adding subject to message
//            m.setSubject(subject);
//
//
//            //adding text to message
//           
//            MimeMultipart multipart = new MimeMultipart();
//            MimeBodyPart messageBodyPart = new MimeBodyPart();
//            messageBodyPart.setText(message);
//            //attachment
//            MimeBodyPart pdfattachfile = new MimeBodyPart();
//            pdfattachfile.attachFile("D:\\Generate.pdf\\sample.pdf");
//            multipart.addBodyPart(messageBodyPart);
//            multipart.addBodyPart(pdfattachfile);
//            
//            m.setContent(multipart);
//            
//            
//            
//
//            //send
//
//            //Step 3 : send the message using Transport class
//            Transport.send(m);
//
//            System.out.println("Sent success...................");
//
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
	
}
	
