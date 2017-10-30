package Phase_1;

public class PersonalCustomer   extends Customer{

	//variable
	private int creditCardNumber;
	
	//constructor
	public PersonalCustomer() {
		creditCardNumber = 0;
	}
	
	//setter
	public void set_creditCardNumber(int new_creditCardNumber) {
		creditCardNumber = new_creditCardNumber;
	}
	
	//getter
	public int get_creditCardNumber() {
		return creditCardNumber;
	}
}
