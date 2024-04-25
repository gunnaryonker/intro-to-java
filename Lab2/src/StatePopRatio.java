/*
 * Author: Gunnar Yonker 
 * Created: 5/29/2022
 * Description: A program to create a ratio between two different state populations.
 */
import java.text.DecimalFormat;
import java.util.*;

public class StatePopRatio {
	public static void main(String args[])
	{
		//Declare the variables
		double popone =0, poptwo =0, ratio =0;
		Scanner myScanner = new Scanner(System.in);
		
		//Ask user to input the name of first state
		System.out.print("Name of first state: ");
		
		//Save name of first state
		String stateone = myScanner.nextLine();
		
		//Ask user to input the population of first state
		System.out.print("Population of " + stateone + ": ");
		
		//Save population of first state
		popone = myScanner.nextInt();
		
		//Ask user to input the name of second state
		System.out.print("Name of second state: ");
		myScanner.nextLine();
		
		//Save name of second state
		String statetwo = myScanner.nextLine();
		
		//Ask user to input population of second state
		System.out.print("Population of " + statetwo + ": ");
		
		//Save population of second state
		poptwo = myScanner.nextInt();
		
		//Compute the ratio of the first state's population compared to that of the second state's population in decimal point form
		ratio = (double) (popone)/poptwo;
		
		//Decimal format for final output ratio
		DecimalFormat df = new DecimalFormat ("0.00");
		
		//Print out result of ratio with state names
		System.out.println("The population of State " + stateone + " is " + (df.format(ratio)) + " times of State " + statetwo + ".");	
		
	}
}
