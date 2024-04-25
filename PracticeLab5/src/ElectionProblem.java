/*
 * Author: Gunnar Yonker
 * Created: 6/7/2022
 * Description: A program that asks for the program candidates and then the amount of votes per candidate, then prints out the winner and their voting total
 */
import java.text.DecimalFormat;
import java.util.*;

public class ElectionProblem {
	public static void main(String args[])
	{
		//Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		//Declare the string array for candidate names, int array for votes, votePercent
		final int CANDIDATE_NUMBER = 6;
		int votes[] = new int[CANDIDATE_NUMBER];
		String candidateName[] = new String[CANDIDATE_NUMBER];
		int voteSum =0;
		
		//Input each candidate name and their amount of votes
		for(int i =0; i < votes.length; i++)
		{
			System.out.print("Name of candidate: ");
			candidateName[i] = scanner.nextLine();
			System.out.print("Number of votes for "+candidateName[i]+": ");
			votes[i] = scanner.nextInt();
			scanner.nextLine();
		}
		//Compute the summation of all votes
		for(int i =0; i < votes.length; i++)
		{
			voteSum += votes[i];
		}
		
		//Find the maximum score and corresponding candidate name
		int max = votes[0];
		int maxIndex =0;
		int secondIndex =0;
		int secondMax =0;
		
		//Search each candidate in the votes array and find the highest one
		for(int i=1; i<votes.length; i++)
		{
			if(votes[i] > max)
			{
				max = votes[i];
				maxIndex = i;
				
			}
			//else nothing happens
		}
		
		//Search candidate in the votes array and find the 2nd highest vote amount
		for(int i=1; i<votes.length; i++)
		{
			if(votes[i] > max)
			{
				secondMax = votes[i-1];
				secondIndex = i;
				
			}
		}
		
		//Decimal formatting
		DecimalFormat df = new DecimalFormat ("0.00");
		
		
		//Create the vote percent
		double votePercent =0;
		
		votePercent = ( (double) (votes[maxIndex]) / voteSum) * 100;
		
		//create the second place vote percent
		double secondPercent =0;
		
		secondPercent = ( (double) (votes[secondIndex]) / voteSum) * 100;
		
		//Check if that number is more than 50% of the total 
		
		if(max >= (voteSum /2))
		{
			//Clear winner print out results of winner and percent of votes
			
			System.out.println("");
			System.out.println("Result:");
			System.out.println("Total votes: " + voteSum);
			System.out.println("Highest Vote: " + candidateName[maxIndex] + " " + votes[maxIndex] + " " + df.format(votePercent) + "%");
			System.out.println(candidateName[maxIndex] + " is the winner!");
		}
		
		//If there is not a majority lead then take the top two and print them out as a tie
		else if(max < (voteSum/2))
		{
			System.out.println("");
			System.out.println("Result:");
			System.out.println("Total votes: " + voteSum);
			System.out.println("Two highest votes:");
			System.out.println("\t \t" + candidateName[maxIndex] + " "+votes[maxIndex]+ " " + df.format(votePercent) + "%");
			System.out.println("\t \t" + candidateName[secondIndex] + "  "+votes[secondIndex]+ " " + df.format(secondPercent) + "%");
			System.out.println(" ");
			System.out.println(candidateName[maxIndex] +  " and " + candidateName[secondIndex] + " will enter the second round of the election.");
		
		}
		
	}
}
