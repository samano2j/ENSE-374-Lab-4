package Phase_1;

public class ProductCatalogue {
	
	//static variable
	private static Product[] catalogue = new Product[10]; 
	
	//constructor
	public ProductCatalogue() {
		int counter = 0;
		while (counter < 10) {
			catalogue[counter] = new Product();
			counter++;
		}
	}
	
	//getter
	public Product[] getProducts() {
		return catalogue;
	}
	
	//setter
	public void setProducts(String newName, double newPrice, int newProductID, int counter) {
		catalogue[counter] = new Product(newName, newPrice, newProductID);
	}

}
