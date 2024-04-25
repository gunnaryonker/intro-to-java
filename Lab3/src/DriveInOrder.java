/*
 * Author: Gunnar Yonker
 * Created: 6/2/2022
 * Description: Drive in order program that displays a menu and then uses switch case to assign food type and print out a receipt for the customer
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class DriveInOrder {
	public static void main(String args[]) {
		//Create a Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declare variables for food type, food price, and total price
		int foodtype; //food type 1, 2, 3, 4
		int amount;
		String foodName = "";
		double tax =0;
		double foodPrice =0;
		double totalPrice =0;
		double totalCharge =0;
		
		//Display the food menu with options
		System.out.println("Please enter your choice (in number): ");
		System.out.println("	1 - Hamburger \t $4.50");
		System.out.println("	2 - Sandwich \t $3.00");
		System.out.println("	3 - Hot Dog \t $2.00");
		System.out.println("	4 - Brat \t $2.00");
		
		System.out.print("Your choice: ");
		foodtype = myScanner.nextInt();
		
		//use switch case to assign food price to food type
		switch(foodtype)
		{
			case 1: foodPrice = 4.50;
					foodName = "Hamburger";
				break;
			case 2: foodPrice = 3.00;
					foodName = "Sandwich";
				break;
			case 3: foodPrice = 2.00;
					foodName = "Hot Dog";
				break;
			case 4: foodPrice = 2.00;
					foodName = "Brat";
				break;
			default: System.out.println("Invalid choice!");
				return;
		}
		if(foodtype == 1 || foodtype == 2 || foodtype ==3 || foodtype == 4);
		{
			//Ask for how many units of the food type they want
			System.out.print("Please enter amount of choice: ");
			amount = myScanner.nextInt();
			
			//Calculate total price
			totalPrice = foodPrice * amount;
			
			//Calculate tax
			tax = 0.05 * totalPrice;
			
			//Calculate total charge
			totalCharge = totalPrice + tax;
			
			//Decimal formatting for tax
			DecimalFormat df = new DecimalFormat ("0.0");
			
			//Print out receipt information
			System.out.println("");
			System.out.println("Name of the food: " + foodName);
			System.out.println("Unit Price: $" + foodPrice);
			System.out.println("Amount: " + amount);
			System.out.println("Total Price: $" + totalPrice);
			System.out.println("Tax: $"+ df.format(tax));
			System.out.println("Total Charge: $" + totalCharge);
		}
	}
}