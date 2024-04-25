/*
 * Author: Gunnar Yonker
 */


public class WhileLoop {
	public static void main(String args[])
	{
		//Find the smallest number whose square is more than 800
		
		//Declare variables for the number, and its square
		int number =1, square =1;
		while(square <= 800) //the loop will continue if the square is <= 800
		{
			number ++; //try a larger number
			square = number*number;
		}
		
		//The while loop will stop here since square is already larger than 800
		System.out.println("Number "+number+" is the smallest number whose "+
		"square is larger than 800.");
	}
}
