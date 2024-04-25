/*
 * Author: Gunnar Yonker
 * Created: 6/5/2022
 * Description: This is a program that asks for an integer input and then checks to see if it is a prime number or not and prints out the result
 */
import java.util.*;

public class ProgrammingProb3 {
	public static void main(String args[]) {
		//Make a scanner
		Scanner myScanner = new Scanner(System.in);
		
		//Declare the variables
		int numberIn =0;
		int count =0;
		
		//Ask the user to input a number
		System.out.println("This program will check if a number is a Prime Number!");
		System.out.print("Enter a number: ");
		numberIn = myScanner.nextInt();
		
		//Check to see if the number is positive
		if(numberIn < 0) 
		{
			//Remind user that it needs to be positive
			System.out.println("Invalid input! Number should be positive.");
			return;
		}
		
		//Check to see if the number is a prime number or not
		for(count = 2; count < (numberIn /2); count++)
		{
			if (numberIn % count == 0)
			{
				//Print out the answer if it is not prime
				System.out.println(numberIn + " is not a Prime Number.");
				return;
			}
		}
			{
				//Print out the answer if it is prime
				System.out.println(numberIn + " is a Prime Number!");
				return;
			}
		}	
	}
