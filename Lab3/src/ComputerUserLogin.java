/*
 * Author: Gunnar Yonker
 * Created: 6/2/2022
 * Description: Design a program that looks for a specific userlogin and userpassword and then prints out if the login is successful or not
 */
import java.util.*;

public class ComputerUserLogin {
	public static void main(String args[]) {
		//Create a scanner
		Scanner myScanner = new Scanner(System.in);
		
		//Declare variables for authorizedName and authorizedPassword
		String authorizedName = "JohnDoe";
		String authorizedPassword = "avocado";
		
		//Declare two other variables, inputName and inputPassword
		String inputName = "";
		String inputPassword = "";
		
		//Prompt the user to input their name and password
		System.out.print("Username: ");
		inputName = myScanner.nextLine();
		
		System.out.print("Password: ");
		inputPassword = myScanner.nextLine();
		
		//If input name matches the authorized name and the input password matches the authorized password 
		if(inputName.equals(authorizedName) && inputPassword.equals(authorizedPassword))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Either the Username or Password is incorrect.");
		}
	}
}