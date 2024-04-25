/*
 * Author: Gunnar Yonker
 * Created: 6/8/2022
 * Description: Create an integer array with 10 numbers, initialize arbitrarily but have both positive and negative numbers
 * then generate two arrays out of the one, one with all natural(positive and zero) one all negative numbers
 * then print the number of elements and the detailed elements in each array
 */
import java.util.Arrays;

public class ArraySplitting {
	public static void main(String args[]) {
		//Declare the array
		final int numArray[] = {10, 20, -30, -10, -15, -5, -10, 30, 0, -25};
		int length = numArray.length;
	
		//Count the positive and the negative numbers
		int positive =0;
		int negative =0;
		for(int i=0; i<length; i++)
		{
			if(numArray[i] >= 0)
			{
				++positive;
			}
			else
			{
				++negative;
			}
		}
		
		//Create a for loop to find the positive numbers from the array
		int arrayNatural[] = new int[positive];
		int arrayNegative[] = new int[negative];
		int i=0;
		int j=0;
		for(int number : numArray)
		{
			if(number >= 0)
			{
				arrayNatural[i++] = number;
			}
			else
			{
				arrayNegative[j++] = number;
			}
		}
		System.out.println("Original Array: " + Arrays.toString(numArray));
		System.out.println(" ");
		System.out.println("Natural Number Array - "+positive+" elements: "+ Arrays.toString(arrayNatural));
		System.out.println("Negative Number Array - "+negative+" elements: "+ Arrays.toString(arrayNegative));
	}
	
}
