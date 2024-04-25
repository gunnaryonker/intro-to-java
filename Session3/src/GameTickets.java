/*
 * Author: Gunnar Yonker
 * Created: 5/31/2022
 * Description: Game ticket pricing for basketball game
 */
import java.util.*;

public class GameTickets {
	public static void main(String args[]) {
		//Create a Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declare variables for ticket type, unit price, and total price
		int type; //ticket type : 1,2,3
		double unitPrice =0;
		double totalPrice =0;
		
		//Display the ticket choice
		System.out.println("Ticket category and price:");
		System.out.println("	1 - Class A \t $50.00");	//Note: \t means tab key
		System.out.println("	2 - Class B \t $25.00");
		System.out.println("	3 - Class C \t $10.00");
		System.out.println("	Others - Invalid.");
		
		System.out.println("Your choice: ");
		type = myScanner.nextInt();
		
		//Decide the unit price of the ticket type one chooses
		switch(type)
		{
			case 1: unitPrice = 50.00;
				break;
			case 2: unitPrice = 25.00;
				break;
			case 3: unitPrice = 10.00;
				break;
			default: System.out.println("Invalid choice!");
			
		}
		
		if(type == 1 || type == 2 || type == 3); //If the choice is valid
		{
			//Ask for the amount of tickets for this type
			System.out.println("Number of this type of ticket: ");
			int number = myScanner.nextInt();
			
			//Compute the total price
			totalPrice = unitPrice * number;
			
			//Print out receipt information
			System.out.println("Your choice is "+ type);
			System.out.println("Number of this type of ticket is "+ number);
			System.out.println("Total Price is "+ totalPrice);
		}
		

	}

}
