/*
 * Author: Gunnar Yonker
 * Created: 6/5/2022
 * Description: A program that asks for an integer input and then if it is positive, computes its factorial
 */
import java.util.*;

public class ProgrammingProb2 {
	public static void main(String args[]) {
		//Make a scanner
		Scanner myScanner = new Scanner(System.in);
		
		//Declare the variables
		int inputint =0;
		int factorial =1;
		int counter =0;
		
		//Ask for the input
		System.out.println("This program will calculate the factorial of a given number!");
		System.out.print("Enter a number: ");
		inputint = myScanner.nextInt();
		
		//check to see if it is a positive number
		if(inputint < 0) 
		{
			//Remind user that it needs to be positive
			System.out.println("Invalid input! Number should be positive.");
			return;
		}
		//Compute the factorial of the given number using a for loop
		else
		for(counter = 1; counter <= inputint; counter++)
		{
			factorial = factorial * counter;
		}
		//Print out the completed factorial
		System.out.println("The factorial of "+inputint+" is "+factorial);
		
	}
	
}
