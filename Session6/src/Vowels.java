/*
 * 
 */
import java.util.*;

public class Vowels {
	public static void main(String args[]) 
	{
		//Declare variables for holding the sentence, vowel count
		String sentence = "";
		int vowelCount = 0;
		//Create a scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Type a sentence from the keyboard
		System.out.println("Please type a sentence:");
		sentence = scanner.nextLine();
		
		//Count the number of vowels
		for(int i=0; i<sentence.length(); i++)
		{
			if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A' 
					|| sentence.charAt(i) == 'e' || sentence.charAt(i) == 'E' 
					|| sentence.charAt(i) == 'i' || sentence.charAt(i) == 'I' 
					|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'O' 
					|| sentence.charAt(i) == 'u' || sentence.charAt(i) == 'U')
			{
				vowelCount ++;
			}
		}
		
		//Print out the result
		System.out.println("The sentence "+sentence+" has "+vowelCount+" vowels.");
	}
}
