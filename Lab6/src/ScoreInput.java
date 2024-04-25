/*
 * Author: Gunnar Yonker
 * Created: 6/12/2022
 * Description: Ask user to input score for 10 students, if invalid ask for re-entry(needs to be 0-100), then print out all of the scores one line at a time
 */
import java.util.*;

public class ScoreInput {
	public static void main(String args[])
	{
		//Create a scanner and declare array for student scores and score length
		Scanner scanner = new Scanner(System.in);
		final int STUDENT_NUMBER =10;
		int scores[] = new int[STUDENT_NUMBER];
		int students =0;
		int score =0;
		
		//Use an infinite while loop to enter student scores until 10 scores entered then break
		while(true)
		{
			//Ask for student score entry
			for(int i=0; i<scores.length; i++)
			{
				System.out.print("Student score: ");
				score = scanner.nextInt();
				int posCheck = score;
				//check to make sure student score is between 1-100 or ask for re-entry	
				if(posCheck > 100 || posCheck < 0)
					{
					while(score < 0 || score > 100)
						{
						System.out.println("Invalid Entry, Must be between 0 and 100");
						System.out.print("Re-enter Score: ");
						score = scanner.nextInt();
						}
					}
				//Store student score in the array
				System.out.println(" ");
				scores[i] = score;
				students++;
			}
			if(students == 10)
				{
					break;
				}
			}
		//Print out the student scores, 1 per line
		System.out.println("Student Scores Entered: ");
		for(int scoreList : scores)
		{
			System.out.println(scoreList);
		}
	}
}
