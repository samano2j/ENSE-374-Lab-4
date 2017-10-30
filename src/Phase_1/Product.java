package Phase_1;

public class Product {
	
	//variables
	private String name;
	private double price;
	private int productID;
	
	//constructor
	Product() {
		name = null;
		price = 0.0;
		productID = 0;
	}
	

	public Product(String newName, double newPrice, int newProductID) {
		name = newName;
		price = newPrice;
		productID = newProductID;
	}
	
	// setters
	public void setName(String newName) {
		name = newName;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	public void setProductID(int newProductID) {
		productID = newProductID;
	}
	
	
	// getters
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getProductID() {
		return productID;
	}
	
}
