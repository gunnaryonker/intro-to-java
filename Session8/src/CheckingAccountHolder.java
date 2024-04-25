import java.util.Scanner;

public class CheckingAccountHolder {
	public static void main(String args[]) {

		//Ask the user to input the account number
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Input Account Number:");
		int accountNum = myScanner.nextInt();
		myScanner.nextLine();
			
		//Create an account number object and set that input number to this object
		CheckingAccount account1 = new CheckingAccount(accountNum);
			
		//Ask the user to input the owner's name
		System.out.println("Input owner name:");
		String name1 = myScanner.nextLine();
			
		//Create an account name object using constructor
		CheckingAccount ownername = new CheckingAccount(name1);
			
		//Ask the user to input the initial balance for the account
		System.out.println("Input the Initial Balance: ");
			
		//Create the balance object using constructor
		double accBal = myScanner.nextDouble();
		if(accBal < 0)
		{
			System.out.println("Invalid entry, balance must be positive.");
			accBal = 0;
		}

		//Create an account balance object using constructor	
		CheckingAccount bal1 = new CheckingAccount(accBal);
			
		//Print out the summary of the account using the getters
		System.out.println(" ");
		System.out.println("Account Number: "+account1.getAccount());
		System.out.println("Account Owner's Name: " + ownername.getName());
		System.out.println("Account Balance: "+ bal1.getBalance());
			
	}
}