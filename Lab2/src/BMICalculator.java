/*
 * Author: Gunnar Yonker
 * Created: 5/29/2022
 * Description: A program that is a BMI calculator and prints out BMI value after input of height&weight and prints out the Department of Health and Human Services information on BMI value.
 */
import java.util.*;
import java.text.DecimalFormat;

public class BMICalculator {
	public static void main(String args[])
	{
	//Declare the variables of height, weight, and BMI value
	double bmi =0, weight =0, height =0, inches =0, feet =0;
	Scanner myScanner = new Scanner(System.in);
	
	//Ask the user to input their weight in pounds
	System.out.print("Enter your weight in pounds(lbs): ");
		
	//Save the weight in pounds input
	weight = myScanner.nextDouble();
	
	//Ask the user to input their height in feet
	System.out.print("Enter your height in feet: ");
	
	//Save the feet input
	feet = myScanner.nextDouble();
	
	//Ask the user to input their height in inches
	System.out.print("Enter your height in inches: ");
	
	//Save the inches input
	inches = myScanner.nextDouble();
	
	//Convert the height in feet and inches to total inches
	height = (feet * 12) + inches;
	
	//Calculate the BMI value
	bmi = (weight * 703) / (height * height);
	
	//Decimal formatting for BMI value
	DecimalFormat df = new DecimalFormat ("0.00");
	
	//Print out the BMI value and the information table
	System.out.println("");
	System.out.println("Body Mass Index(BMI) = " + (df.format(bmi)));
	
	System.out.println("");
	System.out.println("See below table on BMI from the Department of Health and Human Services:");
	System.out.println("");
	
	System.out.println("******************************\r\n"
			+ "BMI AND BODY SHAPE\r\n"
			+ "Underweight:	Less than 18.5\r\n"
			+ "Normal:		Between 18.5 and 24.9\r\n"
			+ "Overweight:	Over 25\r\n"
			+ "******************************\r\n");
	
	}

}
