package Phase_1;

public class OrderLine {

	private int quantity2; // changed from quantity due to duplicate name
	private double Tprice; // changed from price due to duplicate name
	
	OrderLine( ) {
		quantity2 = 0;
		Tprice = 0;
	}
	
	public Product getProduct() { // changed from getProduct due to duplicate name
		Product temp = null;
		return temp;
	}
	
	public int getQuantiy() {
		return quantity2;
	}
	
	public double getPrice() {
		return Tprice;
	}
	public void setQuantiy(int wantedQuantity) {
		quantity2 = wantedQuantity;
	}
	
	public void setPrice(double wantedPrice) {
		Tprice = wantedPrice;
	}
}
