package invoice;

import java.util.ArrayList;
import java.util.List;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import application.Controller;
import application.Product;

public class create {
	public static void pdf(Controller con) throws Exception {     
		
	      // Creating a PdfWriter
			String item = "";
			int quantity = 0;
			float price = 0;
			float amount = 0;

		  String grandtotal = con.getGrandtotal();
		  int invoice_num = con.getInnum();
		  String invoice_date = con.getIndate();
		  String cus_name = con.getCus_name();
		  String mobile = con.getMobile_no();
		  String bill_add = con.getBill_add();
		  String Email = con.getEmail();
		  String ship_name = con.getShip_name();
		  String ship_add = con.getShip_add();
		  
		  //path
		  String path = con.path;
		  
	      String dest = path+".pdf";   //pdf-path//
	      String cusFont = "C:\\Users\\himan\\eclipse-workspace\\javafx1\\src\\resources\\fonts\\ariblk.ttf"; //fontfamily-path//
	      PdfWriter writer = new PdfWriter(dest); 
	   
	      // Creating a PdfDocument       
	      PdfDocument pdfDoc = new PdfDocument(writer);              
	   
	      // Adding a new page 
	      pdfDoc.setDefaultPageSize(PageSize.A4);               
	      
	      // Creating a Document        
	      Document document = new Document(pdfDoc);               
	      
	      // Closing the document 
	      
	      float threecol = 190;
	      float twocol150 =285f ;
	      float twocol = twocol150+150f;
	      float twocolumnWidth[] = {twocol,twocol150};
	      float fullwidth[] = {threecol * 3}; 
	      float fourcolumnwidth[] = {316f,62f, 86f,106f}; 
	      Paragraph onesp = new Paragraph("\n");
	      Table table = new Table(twocolumnWidth);
	      PdfFont font = PdfFontFactory.createFont(cusFont,true);
	      table.addCell(new Cell().add("Invoice").setFontSize(28f).setBorder(Border.NO_BORDER ).setFont(font));
	      Table nestedtable = new Table(new float[]{twocol150/2,twocol150/2});
	      
	      nestedtable.addCell(getHeaderTextCell("Invoice no. "));
	      nestedtable.addCell(getHeaderTextCellvalue(""+invoice_num));
	      nestedtable.addCell(getHeaderTextCell("Invoice Date"));
	      nestedtable.addCell(getHeaderTextCellvalue(""+invoice_date));
	      
	      
	      
	      table.addCell(new Cell().add(nestedtable).setBorder(Border.NO_BORDER ));
	      Border border = new SolidBorder(Color.GRAY, 0.7f);
	      Table divider = new Table(fullwidth);
	      divider.setBorder(border);
	      
	      
	      document.add(table);
	      document.add(onesp);
	      document.add(divider.setMarginBottom(10f));
	      
	      
	      Table twocoltable= new Table(twocolumnWidth);
	      twocoltable.addCell(getBillingShippingCell("Billing Information"));
	      twocoltable.addCell(getBillingShippingCell("Shipping Information")); 
	      document.add(twocoltable.setMarginBottom(10f));
	      
	      Table twocoltable2= new Table(twocolumnWidth);
	      twocoltable2.addCell(getCell10fLeft("Customer name", true));
	      twocoltable2.addCell(getCell10fLeft("Name", true));
	      twocoltable2.addCell(getCell10fLeft(""+cus_name, false));
	      twocoltable2.addCell(getCell10fLeft(""+ship_name, false));
	      document.add(twocoltable2);
	      
	      Table twocoltable3= new Table(twocolumnWidth);
	      twocoltable3.addCell(getCell10fLeft("Address", true));
	      twocoltable3.addCell(getCell10fLeft("Address", true));
	      twocoltable3.addCell(getCell10fLeft(""+bill_add, false));
	      twocoltable3.addCell(getCell10fLeft(""+ship_add, false));
	      document.add(twocoltable3);
	      document.add(onesp);
	      
	      
	      float onecolwidth[] = {twocol150};
	      Table onecolTable= new Table(onecolwidth);
	      onecolTable.addCell(getCell10fLeft("", false));
	      onecolTable.addCell(getCell10fLeft("Email", true));
	      onecolTable.addCell(getCell10fLeft(""+Email, false));
	      document.add(onecolTable.setMarginBottom(10f));
	      
	      
	      Table onecolTabel2 = new Table(fullwidth);
	      onecolTabel2.addCell(getCell10fLeft("Mobile No.", true));
	      onecolTabel2.addCell(getCell10fLeft(""+mobile, false));
	      document.add(onecolTabel2);
	
	      Table tableDivider2 = new Table(fullwidth);
	      Border dgb = new DashedBorder(Color.GRAY,0.5f);
	      document.add(tableDivider2.setBorder(dgb));
	      Paragraph productPara = new Paragraph("Products");
	      document.add(productPara.setBold().setFontSize(18f));
	      
	      Table threecoltable1 = new Table(fourcolumnwidth);
	      threecoltable1.setBackgroundColor(Color.BLACK,0.7f);
	      threecoltable1.addCell(new Cell().add("Description").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
	      threecoltable1.addCell(new Cell().add("Quantity").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
	      threecoltable1.addCell(new Cell().add("Price").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
	      threecoltable1.addCell(new Cell().add("Total").setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER));
	      document.add(threecoltable1);
	     
	      List<product> productList = new ArrayList<>();
	      for(Product pd: con.tableview.getItems()) {
				 item = pd.getItem();
				 quantity = pd.getQuantity();
				 price = pd.getPrice();
				 amount = pd.getAmount();
				 productList.add(new product(item,quantity,price,amount));
		    	  
		      }
	      
	      Table threeColTabel2 = new Table(fourcolumnwidth).setBorder(border);
	      for(product pd : productList) {
	    	 
	    	 threeColTabel2.addCell(new Cell().add(pd.getPname()).setBorder(border).setMarginLeft(10f));
	    	 threeColTabel2.addCell(new Cell().add(String.valueOf(pd.getPquantity())).setTextAlignment(TextAlignment.CENTER).setBorder(border));
	    	 threeColTabel2.addCell(new Cell().add(String.valueOf(pd.getPprice())).setTextAlignment(TextAlignment.CENTER).setBorder(border));
	    	 threeColTabel2.addCell(new Cell().add(String.valueOf(pd.getPtotal())).setTextAlignment(TextAlignment.CENTER).setBorder(border));
	    	
	    	 
	     }
	      document.add(threeColTabel2);
	      
	     
	      float[] tables2= {350f,80f, 99.4f}; 
	      Table threecolTable3 = new Table(tables2);
	      threecolTable3.addCell(new Cell().add("").setBorder(Border.NO_BORDER).setMarginLeft(10f));
	      threecolTable3.addCell(new Cell().add("Total").setTextAlignment(TextAlignment.CENTER).setBorder(border));
	      threecolTable3.addCell(new Cell().add(String.valueOf(grandtotal)).setTextAlignment(TextAlignment.CENTER).setBorder(border));
	      document.add(threecolTable3.setMarginBottom(2f));
	      

	      float []tables = {98f};
	      Table grandTotal = new Table(tables);
	      grandTotal.setBorder(new SolidBorder(Color.BLACK,.7f));
	      document.add(grandTotal.setHorizontalAlignment(HorizontalAlignment.RIGHT));
	      document.add(onesp);
	      document.add(onesp);
	      document.add(onesp);
	      document.add(onesp);
	 

	  
	 
	      Table footerTable = new Table(fullwidth);
	      footerTable.addCell(new Cell().add("TERMS AND CONDITION").setBold().setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setFontSize(12f));
	      Table tb = new Table(fullwidth);
	      tb.addCell(new Cell().add("The Seller shall not be liable to  the Buyer directly or indirectly for any loss or damage suffered by the Buyer.").setMarginLeft(5f).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setFontSize(9f));
	      document.add(footerTable.setMarginTop(20f));
	      document.add(tb);
	      document.close();              
	          
	   } 
	      static Cell getHeaderTextCell(String textvalue) {
	    	  return new Cell().add(textvalue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT);
	}
	      static Cell getHeaderTextCellvalue(String textvalue) {
	    	  return new Cell().add(textvalue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
	}
	      static Cell getBillingShippingCell(String textvalue) {
	    	  return new Cell().add(textvalue).setFontSize(14f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
	}
	      static Cell getCell10fLeft(String textvalue,Boolean isBold) {
	    	 Cell mycell= new Cell().add(textvalue).setFontSize(12f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
	    	 return  isBold? mycell.setBold():mycell; 
	}
	
	      public static class product{	
	    	  private String pname;
	    	  private int pquantity;
	    	  private float pprice;
	    	  private double ptotal;
		
		
		
	      public  product(String pname, int pquantity, float pprice ,float ptotal) {
			this.pname = pname;
			this.pquantity = pquantity;
			this.pprice = pprice;
			this.ptotal = ptotal;
			
		}
		
	      public String getPname() {
			return pname;
		}
	      public void setPname(String pname) {
			this.pname = pname;
		}
	      public int getPquantity() {
			return pquantity;
		}
	      public void setPquantity(int pquantity) {
			this.pquantity = pquantity;
		}
		  public float getPprice() {
			return pprice;
		}
		  public void setPprice(float pprice) {
			this.pprice = pprice;
		}

		public double getPtotal() {
			return ptotal;
		}

		public void setPtotal(double ptotal) {
			this.ptotal = ptotal;
		}
		
		
	}

	     

}

