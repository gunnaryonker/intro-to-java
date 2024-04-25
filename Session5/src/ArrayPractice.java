/*
 * Author: Gunnar Yonker
 * Created: 6/7/2022
 * Description: Use array to process score input and report generation
 */
import java.text.DecimalFormat;
import java.util.*;

public class ArrayPractice {
	public static void main(String args[]) {
		//Create a scanner
		Scanner myScanner = new Scanner(System.in);
		
		//Declare the variables for sum, average, and the score array
		double scoreAverage =0, sum =0;
		final int STUDENT_NUMBER = 3;
		int scores[] = new int[STUDENT_NUMBER];
		String studentName[] = new String[STUDENT_NUMBER];
		
		//Input each score and student name from the keyboard
		for(int i =0; i < scores.length; i++)
		{
			System.out.println("Name for student "+(i+1));
			studentName[i] = myScanner.nextLine();
			System.out.println("Score for student "+ studentName[i]);
			scores[i] = myScanner.nextInt();
			myScanner.nextLine();
		}
		
		//Compute the summation of all scores
		for(int i =0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		
		//Average score is equal to total score divided by number of people
		scoreAverage = sum / scores.length;
		
		//Find the minimum score and corresponding student name
		int min = scores[0];
		int minIndex =0;
		//Search each member in the score array and find the lowest one
		for(int i =1; i<scores.length; i++)
		{
			if(scores[i] < min)
			{
				min = scores[i];
				minIndex = i;
			}
			//else, just move on
		}
		
		//Decimal formatting
		DecimalFormat df = new DecimalFormat ("0");
		
		//Print out the table for the student score report
		System.out.println("Name \t \t Score");
		for(int i =0; i < scores.length; i++)
		{
			System.out.println(studentName[i] +"\t \t" + scores[i]);
		}
		
		//Print out the average score
		System.out.println("The average score for this class is "+df.format(scoreAverage));
		System.out.println("\n \nThe Minimum score record: ");
		System.out.println(studentName[minIndex] +"\t \t"+scores[minIndex]);

	}
	
}
