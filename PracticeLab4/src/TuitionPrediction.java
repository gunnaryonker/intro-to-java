/*
 * Author: Gunnar Yonker
 * Created: 6/3/2022
 * Description: Tuition prediction program that will display the tuition for University of BridgeWater every 4 years for the next 40 years, with an increase of 10% every 4 years 
 */
import java.text.DecimalFormat;

public class TuitionPrediction {
	public static void main(String args[]) {
		//Declare the variables of year and tuition
		final int MIN_NUMBER = 2022;
		final int MAX_NUMBER = 2062;
		int year; //counter variables
		double sum = 10000; //tuition cost
		
		//Print out the name of the university and the beginning table
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Tuition at University of BridgeWater");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Year \t \t Tuition");
		
		//Decimal formatting to have integer only
		DecimalFormat df = new DecimalFormat ("0");
		
		//use a loop to calculate the tuition every 4 years
		for (year = MIN_NUMBER; year <= MAX_NUMBER; year += 4) {
		if(year == 2022)
		{
			sum = 10000;
			System.out.println(year + "\t \t $" + df.format(sum));
		}
		else {
			//increase 10% every 4 years
			sum = sum * 1.10;
			//print out the result in a tuition table
			System.out.println(year + "\t \t $" + df.format(sum));
		}
		}
		
	}
}
