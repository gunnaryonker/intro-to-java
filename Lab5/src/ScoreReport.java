/*
 * Author: Gunnar Yonker
 * Created: 6/8/2022
 * Description: A program that will hold the score of 6 students and their names, find the student with the highest score
 * print out the highest student or the top highest students, find students below 70 and print their
 * name and score, and compute average score at the end
 */
import java.util.*;
import java.text.DecimalFormat;

public class ScoreReport {
	public static void main(String args[]) {
		//Create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Declare the variables and arrays for score and student name
		double scoreAverage =0;
		double scoreSum = 0;
		final int STUDENT_NUMBER =6;
		int scores[] = new int[STUDENT_NUMBER];
		String studentName[] = new String[STUDENT_NUMBER];
		
		//Ask for entry of each student name and score
		for(int i =0; i<scores.length; i++)
		{
			System.out.print("Student name: ");
			studentName[i] = scanner.nextLine();
			System.out.print("Score for "+studentName[i] + ": ");
			scores[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		//Compute the sum of all of the scores to find average score
		for(int i=0; i<scores.length; i++)
		{
			scoreSum += scores[i];
		}
		
		//Average score calculation
		scoreAverage = scoreSum / scores.length;
		
		//Find the student with the highest score
		int max = scores[0];
		int maxIndex =0;
		for(int i=1; i<scores.length; i++)
		{
			if(scores[i] > max)
			{
				max = scores[i];
				maxIndex = i;
			}
		}
		
		//Print out the student with the highest score and check if there are any other tied with highest
		System.out.println(" ");
		System.out.println("Highest score:");
		for(int i=1; i<scores.length; i++)
		{
			if(scores[maxIndex] == scores[i])		
			{
				System.out.println(studentName[i]+"\t \t" + scores[i]);
			}
		}
		
		
		//Find students who score below 70
		System.out.println(" ");
		System.out.println("Score below 70:");
		for(int i=0; i<scores.length; i++)
		{
			if(scores[i] < 70)
			{
				System.out.println(studentName[i]+"\t \t"+ scores[i]);
			}
		}
		
		//Decimal formatting
		DecimalFormat df = new DecimalFormat ("0.00");

		//Print out average score of all students scores
		System.out.println(" ");
		System.out.println("The average score for this class is "+df.format(scoreAverage));
		
	}
}
