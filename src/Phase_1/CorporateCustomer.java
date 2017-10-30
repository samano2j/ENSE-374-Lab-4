package Phase_1;

public class CorporateCustomer extends Customer{

	private String contactName;
	
	public CorporateCustomer() {
			contactName = null;
	}
 	// setter
	public void set_contactName(String new_contactName) {
		contactName = new_contactName;
	}
	 	
	// getter
 	public String get_contactName() {
 		return contactName;
 	}
}
