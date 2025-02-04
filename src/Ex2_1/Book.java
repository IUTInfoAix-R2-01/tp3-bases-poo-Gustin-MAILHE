package Ex2_1;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.setPrice(price);
		this.setQty(0);
	}
	
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.setPrice(price);
		this.setQty(qty);
	}

	public Author getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString () {
		return ("Book[name=" + this.name + ",author=" + this.author.toString() + ",price=" + this.price + ",qty=" + this.qty + "]");
	}
}