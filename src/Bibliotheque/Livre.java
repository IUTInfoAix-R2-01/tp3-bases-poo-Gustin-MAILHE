package Bibliotheque;

public class Livre {
	private String name;
	private double price;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
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
