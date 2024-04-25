/*
 * Author: Gunnar Yonker
 * Created: 6/12/2022
 * Description: Generates a random integer and asks the user to guess the number, if incorrect tells user if the number is higher or lower and asks again,
 * once correct number entered, print out that they were correct and how many attempts it took them, then asks if they want to play again
 */
import java.util.*;

public class NumberGuessGame {
	public static void main(String args[])
	{
		//Declare a scanner
		Scanner scanner = new Scanner(System.in);
		
		//Declare variables for random integer, guess integer, attempts
		int guess =0;
		int attempts =0;
		String playAgain = "Yes";
		
		//While loop to run the game function for playing again
		while(playAgain.equals("Yes") || playAgain.equals("yes"))
		{
			if(playAgain.equals("No") || playAgain.equals("no"))
			{
				break;
			}
			//Generate a random number between 1 and 100
			Random random = new Random();
			int answer = random.nextInt(100 - 1 + 1) + 1;
			System.out.println("Guess the number 1-100!");
			//Variable to control if the round while loop is running or not
			int round =0;
			attempts = 0;
				//while loop to run each round of guessing
				while(round == 0)
				{
				System.out.print("Your guess: ");
				guess = scanner.nextInt();
					//If not right, use if sentence to print out higher or lower according to guess	
					if(guess < answer)
					{
						System.out.println("Higher!");
						attempts ++;
					}
					if(guess > answer)
					{
						System.out.println("Lower!");
						attempts ++;
					}
					if(guess == answer)
						{
						
						//Print out that they were correct and how many attempts it took
						attempts ++;
						System.out.println("Congratulations, the number was "+answer+" and it took you "+attempts+" attempts!");
						//Print out if they want to play again, yes starts program again and no stops the program
						round = 1;
						System.out.print("Do you want to play again?(Yes/No): ");
						playAgain = scanner.next();
						System.out.println(" ");
						}
				}
			}
		System.out.println("Thanks for playing!");
	}
}
