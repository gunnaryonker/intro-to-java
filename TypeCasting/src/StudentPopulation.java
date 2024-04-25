/*
 * Author: Gunnar Yonker
 * Created: 5/28/2022
 * Description: Compute the ratio of student population at two different schools
 */
import java.util.*;
import java.text.DecimalFormat;

public class StudentPopulation {
	public static void main(String args[])
	{
		//Declare the variables for student population at UWO and UWW
		int uwo = 14000;	//Student population in UW-Oshkosh
		int uww = 12000;	//Student population in UW-Whitewater
		
		//Compute the ratio of UWO vs UWW
		double ratio = 0;
		ratio = (double) (uwo)/uww;
		
		//Format the numerical output to 3 decimal places
		DecimalFormat df = new DecimalFormat ("0.000");
		
		//Print out the ratio value
		System.out.println("The ratio of student population at UW-Oshkosh is "
				+ (df.format (ratio)) + " times of UW-Whitewater.");
		
	}
}
