package Phase_1;

public class ProductCatalogue {
	
	private static Product[] catalogue = new Product[10]; 
	
	public ProductCatalogue() {
		int coun = 0;
		while (coun < 10) {
			catalogue[coun] = new Product();
			coun++;
		}
	}
	public Product[] getProducts() {
		return catalogue;
	}
	public void setProducts(String newName, double newPrice, int newProductID, int counter) {
		catalogue[counter] = new Product(newName, newPrice, newProductID);
	}

}
