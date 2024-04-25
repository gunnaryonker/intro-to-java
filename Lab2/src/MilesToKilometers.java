/*
 * Author: Gunnar Yonker
 * Created: 5/29/2022
 * Description: A program to convert miles to kilometers.
 */
import java.text.DecimalFormat;
import java.util.*;

public class MilesToKilometers {
	public static void main(String args[])
	{
		//Declare the conversion rate of miles to kilometers
		final double MILES_TO_KILOMETERS = 1.609;
		Scanner mileScanner = new Scanner(System.in);
		
		//Declare the variables of miles and kilometers
		double kilometer =0, mile =0;
		
		//Remind user to input number of miles
		System.out.print("Enter number of miles: ");
		
		//Save mile input to scanner variable
		mile = mileScanner.nextDouble();
		
		//Convert miles to kilometers
		kilometer = mile * MILES_TO_KILOMETERS;
				
		//Decimal formatting for miles to be signal integer
		DecimalFormat df = new DecimalFormat ("0");
		
		//Print out converted miles
		System.out.println((df.format(mile)) + " miles is equal to " + kilometer + " kilometers.");
		
	}
}
