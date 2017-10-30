package Phase_1;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
public class OrderApplication  {

	private Customer newCustomer = new Customer();
	private ProductCatalogue catalg = new ProductCatalogue();
	private CorporateCustomer cc = new CorporateCustomer();
	private PersonalCustomer pc = new PersonalCustomer();

	
	public boolean createOrder(Order cart) {
		
		Scanner in = new Scanner(System.in); 
		boolean chk = false;
		char choice = 'y';
		char discountQuestion;
		double discount = 0;
		double totalPrice = 0.0;
		String item = ""; 
		int quantity = 0;
		int counter = 0;
		int x = 0;
		int hold_pos = 0;
		Boolean checkIfproductExist = false; 
		String name;
		String address;
		String contactName;
		int creditNumber;
		
		chk = importCatalogue();
		System.out.println("List of Products Available:");
		cart.printCatalogue(catalg);
		while (choice == 'y') {
			checkIfproductExist = false;  
			System.out.println("What do you want to order:");
			item = in.nextLine();

			cart.items()[counter].setName(item);
			
			hold_pos = 0;
			x = 0; 
			while(x < 10)
			{
				
				if ( Objects.equals(item, catalg.getProducts()[x].getName())) {
					checkIfproductExist = true;  
					hold_pos = x;
				}
				x++;
			}

			if (checkIfproductExist == true) {
				System.out.println("How many?");
				quantity = in.nextInt();	
				cart.quantity()[hold_pos].setQuantiy(quantity);
			} else {
				System.out.println("Item doesn't exist!");
			}
			
			System.out.println("Do you still wish to order? (y/n)");
			choice = in.next().charAt(0);
			counter++;
			in.nextLine();
		}
		
		if (chk == true) {
			totalPrice = cart.calculatePrice(catalg);
			System.out.println("Do you have discount (if yes press y, and if not press any other key");
			discountQuestion = in.next().charAt(0);
			if (discountQuestion == 'y') {
				System.out.println("Enter the % of the discount :");
				discount = in.nextDouble();
				discount = (discount / 100) * totalPrice;
			} 
			
			in.nextLine();
			System.out.println("Enter your name: ");
			name = in.nextLine();
			newCustomer.set_Name(name);
			System.out.println("Enter address: ");
			address = in.nextLine();
			newCustomer.set_Address(address);
			System.out.println("Enter Credit Card number: ");
			creditNumber = in.nextInt();
			pc.set_creditCardNumber(creditNumber);
			in.nextLine();
			System.out.println("Enter contact name: ");
			contactName = in.nextLine();
			cc.set_contactName(contactName);
			
			System.out.println("Check out info:" );
			
			System.out.println("Buyer name:" + newCustomer.getName());
			System.out.println("Buyer contact name:" + cc.get_contactName());
			System.out.println("Buyer Address:" + newCustomer.getAddress());
			System.out.println("Total price is $" + totalPrice);
			if(discount > 0) {
				System.out.println("Total price after discount is $" + (totalPrice - discount));
			}
		} else {
			System.out.println("Error importing catalogue!");
		}
		
		return chk;
	}
	
	private boolean importCatalogue() {
		boolean chk = false;
		int counter = 0; // counter for the objects
		
		Pattern p = Pattern.compile(","); // regular expression to divide the line of the excel file
		
		try { // try and catch method in case there is an error
			
			Scanner fileIn = new Scanner(Paths.get("products.csv")); // get the file 
			
			fileIn.nextLine(); // get rid of the first line which has the headers
			// totalPrice = 
			
			
			while (fileIn.hasNextLine()) { 
				String line = fileIn.nextLine(); 
				
				String[] items = p.split(line); 
				
				
				String productName = items[0]; 
				double productPrice = Double.parseDouble(items[1]); // cast to double
				int productID = Integer.parseInt(items[2]); 
				
				
				catalg.getProducts()[counter] = new Product(productName, productPrice, productID);
				counter++; 
				
				
			}
			
			
			fileIn.close(); 
			
		} 
		catch (IOException e) { 
			e.printStackTrace();
		} 
		
		if (counter == 10) {
			chk = true;
		}
		return chk;
	}
	
	
}
