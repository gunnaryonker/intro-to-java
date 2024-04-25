/*
 * Author: Gunnar Yonker
 * Created: 6/5/2022
 * Description: Program that displays numbers 100 to 180, five per line that are divisible by 5 or 6, numbers separated by one tab space
 */

public class ProgrammingProb1 {
	public static void main(String args[]) {
		//Declare the variables
		final int MIN_NUMBER = 100;
		final int MAX_NUMBER = 180;
		int num; //variable to print out as each number
		int line =0;
		
		//use a loop to calculate the number to see if it is divisible by 5 or 6
		for(num = MIN_NUMBER; num <= MAX_NUMBER; num += 1) {
			if(num % 6 == 0 && num % 5 !=0)
			{
				System.out.print(num + "\t");
				line++;
			}
			if(num % 5==0 && num % 6!=0) {
					System.out.print(num + "\t");
					line++;
				}
					
					if(line == 5)
				{
					line = 0;
					System.out.println();
				}
			}
		}
	}
