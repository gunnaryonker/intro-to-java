import java.util.Scanner;

/*
 * Author: Gunnar Yonker
 * Date: 7/1/2022
 * File: AgeCalculation.java
 * Description: A main method that asks for users input of month, day, and year of one's birth date
 * then asks for a future date input and tells how many years old and days old they will be
 */
public class AgeCalculation {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
				
		//initialize each object variable
		int bMonth = 0;
		int bDay = 0;
		int bYear = 0;
		int fMonth =1; int fDay =0; int fYear =0;
		
		//Ask for input of each variable
		System.out.println("Birthday Month(1-12): ");
		bMonth = myScanner.nextInt();
		System.out.println("Birthday Day(1-31): ");
		bDay = myScanner.nextInt();
		System.out.println("Birthday Year: ");
		bYear = myScanner.nextInt();
		
		//Create object using the input values
		Date birthday1 = new Date(bMonth, bDay, bYear, fMonth, fDay, fYear);
		
		//Call the displayDate function to show the information in the correct format
		System.out.println("");
		System.out.print("Your birthday is: ");
		birthday1.displayDate();

		//Ask for a future date and calculate current age and age on that future date
		System.out.println("Input a future month(1-12): ");
		fMonth = myScanner.nextInt();
		System.out.println("Input a future day(1-31): ");
		fDay = myScanner.nextInt();
		System.out.println("Input a future year: ");
		fYear = myScanner.nextInt();
		
		//Create object of future date input
		Date futureage1 = new Date(bMonth, bDay, bYear, fMonth, fDay, fYear);
		
		//Print out current age and age from future date
		System.out.print("You are currently ");
		birthday1.calculateAge();
		System.out.println(" ");
		System.out.print("On ");
		futureage1.displayFutureDate();
		System.out.print("You will be ");
		futureage1.calculateFutureAge();
		
	}
}
