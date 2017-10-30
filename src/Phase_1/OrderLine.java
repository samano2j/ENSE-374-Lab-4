package Phase_1;

public class OrderLine {
	//variables
	private int quantity2; 
	private double Tprice; 
	
	//constructor
	OrderLine( ) {
		quantity2 = 0;
		Tprice = 0;
	}
	
	//getters
	public Product getProduct() { 
		Product temp = null;
		return temp;
	}
	
	public int getQuantiy() {
		return quantity2;
	}
	
	public double getPrice() {
		return Tprice;
	}
	
	//setters
	public void setQuantiy(int wantedQuantity) {
		quantity2 = wantedQuantity;
	}
	
	public void setPrice(double wantedPrice) {
		Tprice = wantedPrice;
	}
}
