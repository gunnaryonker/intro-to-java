/*
 * Author: Gunnar Yonker
 * Created: 6/1/2022
 * Description: A program that asks for name and age input, which then prints out the receipt with the name, category, and price of the ticket for the Sunrise company cruise line in Lake Michigan.
 */
import java.util.*;

public class CruiseTickets {
	public static void main(String args[]) {
		//Create a scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declaire variables for age, category, price, name
		int age =0;
		int price =0;
		String name ="";
		String category ="";
		
		//Ask for keyboard input of the name of customer
		System.out.print("Enter the customer name: ");
		name = myScanner.nextLine();
		
		//Ask for keyboard input of age
		System.out.print("Enter the age of the customer: ");
		age = myScanner.nextInt();
		
		//If invalid answer for age input, such as negative then print out invalid entry
		if(age < 0)
		{
			System.out.println("The age, "+ age + ", is invalid."); //age is less than zero, impossible to be negative age
			return;
		}
		
		//Convert the age to a price of the ticket and assign correct category for age
		if(age >= 65)
		{
			price = 40;
			category = "Senior	";
		}
		else if(age >= 18 && age <= 64 )
		{
			price = 50;
			category = "Adult	";
		}
		else if(age >= 14 && age <= 17)
		{
			price = 45;
			category = "Young Adult";
		}
		else if(age >= 3 && age <= 13)
		{
			price = 25;
			category = "Child	";
		}
		else if(age >= 0 && age <= 2)
		{
			price = 2;
			category = "Baby	";
		}
		
		//Print out receipt of ticket price, category, and age
		System.out.println();
		System.out.println("-------------------------------------------------------------------------\r\n"
				+ "Sunrise Cruise Receipt\r\n"
				+ "-------------------------------------------------------------------------\r\n"
				+ "Customer Name	|	Category	|	Price	|\r\n"
				+ name + "	|	" + category + "	|	$" + price + "	|\r\n"
				+ "-------------------------------------------------------------------------\r\n"
				+ "");
		
	}

}
