package Phase_1;

import java.util.Date;

public class Order {

	private Date dateReceived;
	private double price;
	private int orderID;
	
	public Date getDateReceived() {
		return this.dateReceived;
	}
	
	public double calculatePrice() {
		return price;
	}
}
