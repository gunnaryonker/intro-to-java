/*
 * Author: Gunnar Yonker
 * Created: 6/2/2022
 * Description: input any given year and print out if it is a leap year or not, leap year is divisible by 4 and not by 100
 */
import java.util.Scanner;

public class LeapYear {
		public static void main(String args[]) {
			//Create a scanner
			Scanner myScanner = new Scanner(System.in);
			
			//declare leap year variable and string variable for answer printout
			double leapYear =0;
			String output = "";
			
			//Ask user to input year selection
			System.out.print("Is it a Leap Year or not?\r\n"
					+ "Year: ");
			leapYear = myScanner.nextInt();
			
			//Check if the year is a valid entry
			if(leapYear < 0)
			{
				System.out.println("The year entered, "+ leapYear + ", is invalid.");
			}
			
			//Check if it is divisible by 4 and not divisible by 100
			if( leapYear % 4==0 && leapYear % 100!=0  || leapYear % 100==0 && leapYear % 400==0 )
			{
				System.out.println("Leap Year!");
			}
			else
			{
				System.out.println("Not a Leap Year.");
			}
			
		}
}
