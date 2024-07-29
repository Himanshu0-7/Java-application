package api;


public class getData {
	private int invoice_no;
	private String invoice_date ;
	private String customer_name;
	private String Billing_address;
	private String Email;
	private String Mobile_no;
	private String Shipping_name;
	private String Shipping_address;
	private String Discription;
	private int Quantity;
	private float Price;
	private float Amount;

	public int getInvoice_no() {
		return invoice_no;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public String getBilling_address() {
		return Billing_address;
	}
	public String getEmail() {
		return Email;
	}
	public String getMobile_no() {
		return Mobile_no;
	}
	public String getShipping_name() {
		return Shipping_name;
	}
	public String getShipping_address() {
		return Shipping_address;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public void setBilling_address(String billing_address) {
		Billing_address = billing_address;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}
	public void setShipping_name(String shipping_name) {
		Shipping_name = shipping_name;
	}
	public void setShipping_address(String shipping_address) {
		Shipping_address = shipping_address;
	}
	public void setDiscription(String discription) {
		Discription = discription;
	}
	public int getQuantity() {
		return Quantity;
	}
	public float getPrice() {
		return Price;
	}
	public float getAmount() {
		return Amount;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	
		
	
		
}
