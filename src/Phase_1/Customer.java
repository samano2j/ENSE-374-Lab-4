package Phase_1;

public class Customer {
	
	//variables
	private String name;
	private String address;
	private float creditRating;
	private float discountRating;
	
	//setter
	public void setCreditRating(float newCreditRating) {
		creditRating = newCreditRating;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	public void setDiscountRating(float newDiscountRating) {
		discountRating = newDiscountRating;
	}
	
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public float getCreditRating() {
		return creditRating;
	}
	
	public float getDiscountRating() {
		return discountRating;
	}
}
