/*
 * Author: Gunnar Yonker
 * Created: 5/28/2022
 * Description: A program to calculate the electricity cost in the city of Greendale with the input of customer name, month of bill, and the KWH used. Then prints out the charges for the electric bill in correct format.
 */
import java.util.*;
import java.text.DecimalFormat;

public class ElectricBillProblem {
	public static void main(String args[])
	{

		//Declare kwh used, baserate, surcharge, and city tax
		double kwh =0, baserate =0, surcharge =0, citytax =0, latecharge =0, total =0;
		Scanner myScanner = new Scanner(System.in);
		
		//Have the user input their name
		System.out.print("Enter the customer name: ");
		//Save the input of the first and last name
		String name = myScanner.nextLine();
		
		//Have user input their month of bill
		System.out.print("Enter the month of the bill: ");
		
		//Save the input of the month of bill
		String month = myScanner.nextLine();
		
		//Have user input their KWH used in that month
		System.out.print("Enter the KWH used: ");
		
		//Save input of the KWH used
		kwh = myScanner.nextDouble();
		
		//Calculate the base rate cost of bill
		baserate = kwh * 0.1528;
		
		//Calculate the surcharge based off of the base rate
		surcharge = baserate * 0.15;
		
		//Calculate the city utility tax
		citytax = baserate * 0.05;
		
		//Calculate total cost of bill
		total = baserate + surcharge + citytax;
		
		//Calculate the late charge amount after the 20th of the month
		latecharge = (total * 0.04) + total ;
		
		//Decimal formatting to 2 decimal places
		DecimalFormat df = new DecimalFormat ("0.00");
		DecimalFormat dff = new DecimalFormat ("0");
		
		//Print out the correctly formatted bill
		System.out.println(); //blank line for formatting
		System.out.println(); //blank line for formatting
		
		System.out.println("Electric Bill for Jessica Ponce on 6th of " + month); //Output line with customer name and month
		
		System.out.println("-------------------------------------------------------");//formatting line of bill
		System.out.println("Kilowatts Used: 			" + (dff.format(kwh))); //Output line with kwh used
		System.out.println("-------------------------------------------------------");//formatting line of bill
		
		System.out.println("Base Rate " + (dff.format(kwh)) + "@$0.1528			$" + (df.format (baserate)) );//base rate calculated charge
		System.out.println("Surcharge				$" + (df.format (surcharge)) );//surcharge amount on bill
		System.out.println("City Tax				$" + (df.format (citytax)) );//city tax amount on bill
		System.out.println("                        		________        "); //line on right side of bill above total charge
		System.out.println("Pay this amount				$" + (df.format (total)) ); //total amount of electric bill
		System.out.println("After " + month + " 20th Pay			$"	+ (df.format (latecharge ))); //total amount owed if paying after 20th
		
	}

}
