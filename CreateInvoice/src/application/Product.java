package application;

public class Product {
	protected String item;
	protected int quantity;
	protected float price;
	protected float amount;
	public Product(String item) {
		this.item = item;
	}
	public Product(int quantity) {	
		this.quantity = quantity;
	}
	public Product(float price) {	
		this.price = price;
	}
	
	public Product(String item, int quantity, float price,float amount) {
		
		this.item = item;
		this.quantity = quantity;
		this.price = price;
		this.amount = amount;
	}
	public String getItem() {
		return item;
	}
	public int getQuantity() {
		return quantity;
	}
	public float getPrice() {
		return price;
	}
	public float getAmount(){
		return amount;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	

}
