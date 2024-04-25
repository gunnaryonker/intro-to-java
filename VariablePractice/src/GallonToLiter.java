/*
 * A program to convert gallons to liters
 * Written by: Gunnar Yonker
 * Created on: 5/25/2022
 */
public class GallonToLiter {
	public static void main(String args []) {
			//Declare the conversion rate
			final double GALLONS_TO_LITERS = 3.785;
			//Declare variables for gallons and liters
			double gallons =0, liters =0;
			
			//Assign a value to the gallon variable
			gallons = 5;
			
			//Compute the value of liters
			liters = gallons * GALLONS_TO_LITERS;
			
			//Print out the conversion result
			System.out.println(gallons + " gallons is equal to "
					+ liters + " liters");
		
			//Second conversion
			//Assign a different value to the gallon variable
			gallons = 2;
			
			//Computer the value of liters
			liters = gallons * GALLONS_TO_LITERS;
			
			//Print out the conversion result
			System.out.println(gallons + " gallons is equal to "
					+ liters + " liters");
	}
	
}
