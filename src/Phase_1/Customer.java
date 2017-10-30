package Phase_1;

public class Customer {

	private String name;
	private String address;
	private float creditRating;
	private float discountRating;
	
	public void set_CreditRating(float newCreditRating) {
		creditRating = newCreditRating;
	}
	public void set_Name(String newName) {
		name = newName;
	}
	public void set_Address(String newAddress) {
		address = newAddress;
	}
	public void set_DiscountRating(float newDiscountRating) {
		discountRating = newDiscountRating;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public float creditRating() {
		return creditRating;
	}
	
	public float discountRating() {
		return discountRating;
	}
}
