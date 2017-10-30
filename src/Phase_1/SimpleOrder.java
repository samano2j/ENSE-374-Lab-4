package Phase_1;

import java.io.IOException;
import java.util.Scanner;

public class SimpleOrder {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Anime Shop!");
		
		OrderApplication app = new OrderApplication();
		
		Order wantedOrder = new Order(); 
		
		app.createOrder(wantedOrder);
		
		
	}
	
}
