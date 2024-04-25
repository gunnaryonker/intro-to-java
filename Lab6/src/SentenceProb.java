/*
 * Author: Gunnar Yonker
 * Created: 6/12/2022
 * Description: A program that asks for a sentence input and then prints out each word of the sentence in a new line
 */
import java.util.*;

public class SentenceProb {
	public static void main(String args[])
	{
		//Create a scanner
		Scanner scanner = new Scanner(System.in);
		
		//Declare variables for sentence string
		String sentence = "";
		
		//Ask user for input of sentence
		System.out.print("Type your sentence: ");
		sentence = scanner.nextLine();

		//Split the entered sentence and print out each word
	    String printSentence[] = sentence.split(" ");
	    
	    //Create a for loop to print out each word into a line
	    for (int i = 0; i < printSentence.length; i++)
	    {
	      System.out.println(printSentence[i]);
	    }
	}
}	
