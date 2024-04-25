/*
 * Author: Gunnar Yonker
 * Created: 6/11/2022
 * Description: A program that prompts user for username and password, user gets 5 incorrect attempts before stating their account is locked and program terminates, 
 * otherwise if attempt is correct then prints login successful
 */
import java.util.Scanner;

public class AuthenticationSystemProblem {
	public static void main(String args[])
	{
		//Declare the authorized name and password and intialize them
		String authorizedName = "172Student";
		String authorizedPassword = "whileloop";
		Scanner scanner = new Scanner(System.in);
		
		//Declare variables for attempt number
		final int THRESHOLD_ATTEMPTS =5;
		int totalAttempts =1;
		
		//Declare input name and password
		String inputName, inputPassword;
		
		//Create a while loop to enable users to keep trying until the correct one has been input
		while(true)
		{
			//ask user to input their username and password
			System.out.print("Username: ");
			inputName = scanner.next();
			System.out.print("Password: ");
			inputPassword = scanner.next();
		
			//If they match the authorized one, show that it passed and exit the while loop using break statement
			if(inputName.equals(authorizedName) && inputPassword.equals(authorizedPassword))
			{
				System.out.println("Login Successful");
				break;
			}
			
			//If 5 incorrect attempts, then lock the account
			if(totalAttempts == THRESHOLD_ATTEMPTS)
			{
				System.out.println("Your Username and Password was wrong for 5 attempts, your account has been locked.");
				break;
			}
			//Otherwise continue the loop
			totalAttempts ++; //Add an incorrect attempt to the counter
			System.out.println("Either your Username or Password is wrong, please input your Username and Password.");
			System.out.println(" "); //blank line to keep each attempt separate in console
		}
	}
}

