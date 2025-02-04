package Bibliotheque;

public class Livre {
	private String name;
	private double price;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Livre() {
		this.name = "Harry Potter";
		this.price = 29.99;
		this.quantity = 20;
	}
	
	public String toString() {
		return ("Livre[name=" + this.name + ", price=" + this.price + ", quentite" + this.quantity + "]");
	}
}
