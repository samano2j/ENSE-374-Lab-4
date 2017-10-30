package Phase_1;

import java.io.IOException;
import java.util.Scanner;

public class SimpleOrder {

	public static void main(String[] args) {
		//Simple Order Application
		System.out.println("Welcome to Anime Shop!");
		
		OrderApplication oa = new OrderApplication();
		
		Order order = new Order(); 
		
		oa.createOrder(order);
		
		
	}
	
}
