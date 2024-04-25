/*
 * Author: Gunnar Yonker
 * Created: 6/2/2022
 * Description: Jacob is a retailer for ice and needs to know the price of the bags of ice which vary depending on how much he orders,
 * this program will calculate the discount he gets
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class IceRetailer {
	public static void main(String args[]) {
		//Create a scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declare variables for number of bags, discount, total cost
		int bags =0;
		double discount =0;
		double totalPrice =0;
		final double icecost = 2.5;
		
		//Ask for keyboard input of number of bags
		System.out.print("Number of bags: ");
		bags = myScanner.nextInt();
		
		//if invalid answer for input such as negative then print out invalid entry
		if(bags < 0)
		{
			System.out.println("The bag amount, "+ bags + ", is invalid.");
			return;
		}
		
		//If/else to assign the discount percent to the correct number of bags given the order volume
		if(bags >= 180)
		{
			discount = 0.25;
		}
		else if(bags >= 120 && bags <= 179)
		{
			discount = 0.20;
		}
		else if(bags >= 60 && bags <= 119)
		{
			discount = 0.15;
		}
		else if(bags >= 40 && bags <= 59)
		{
			discount = 0.10;
		}
		else if(bags >= 20 && bags <= 39)
		{
			discount = 0.05;
		}
		else if(bags >= 0 && bags <= 19)
		{
			//no discount can be applied at this volume
		}
		
		//Calculate the total cost with the discount taken out
		totalPrice = (icecost * (1 - discount)) * bags;
		
		//Decimal formatting if needed
		DecimalFormat df = new DecimalFormat ("0");
		
		//Print out the number of bags purchased and the total price he will pay
		System.out.println("");
		System.out.println(bags + " bags purchased");
		System.out.println("Total Price: $" + df.format(totalPrice));
	}
}
