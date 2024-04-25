/*
 * Author: Gunnar Yonker
 * Created: 6/4/2022
 * Description: Practice for using for loops
 */

public class ForLoopPractice {
	public static void main(String args[]) {
		
		/*************************************************
		 * *Practice 1: Print out number and their squares
		 * ***********************************************/
		final int MIN_NUMBER = 100;
		final int MAX_NUMBER = 200;
		int num; //Counter variables
		
		//Table head
		System.out.println("Number \t \t Number Squared");
		for (num = MIN_NUMBER; num <= MAX_NUMBER; num++) {
			//If the number is even, print out it and its square
			if(num%5 == 0)	//num is even
			{
				System.out.println(num+"\t \t" + (num*num));
			}

			//Otherwise, print nothing
		}
		
		/*************************************************
		 * *Practice 2: Compute the summation of odd numbers
		 * between 0 and 100
		 *************************************************/
		final int START = 1;
		final int END = 100;
		
		//Declare variables for the computation
		int sum =0;
		
		//Use a for loop to add up all odd numbers
		for(int number = START; number <= END; number += 2)
		{
			//Add one number in one loop
			sum += number;	//sum = sum + number;
		}
		
		//Print out the summation result
		System.out.println("Summation of odd numbers between 1 and 100 is "+sum);
		
	}
}
