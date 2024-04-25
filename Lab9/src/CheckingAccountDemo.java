import java.util.Scanner;
/* 
 * CheckingAccountDemo.java
 * Create a checking account class with three attributes: account number, owner's name and balance. Add in ability to deposit or withdraw. Create
 * an object array with 10 checking accounts and store them
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 * Modified: 6/26/2022
 */
public class CheckingAccountDemo {
	public static void main(String args[]) {
		Scanner myScanner = new Scanner(System.in);
		
		//Declare an object array with 10 objects
		final int ACCOUNT_COUNT = 10;
		CheckingAccount bankAccount[] = new CheckingAccount[ACCOUNT_COUNT];
		
		//Create a for loop and obtain the values for each account's information(Name, account number and initial balance)
		// and initialize each account object
		String name = "";
		int number =0;
		double balance =0;
		for(int i=0; i<bankAccount.length; i++)
		{
			//Ask for the name, number and balance inputs
			System.out.println("Name of Account Owner "
					+ (i+1)+":");
			name = myScanner.nextLine();
			System.out.println("Account "
					+ (i+1) +" Number:");
			number = myScanner.nextInt();
			System.out.println("Initial Balance of Account "
					+ (i+1)+":");
			balance = myScanner.nextDouble();
			myScanner.nextLine();
			//Create the object using the input values
			bankAccount[i] = new CheckingAccount(name, number, balance);
		}
		
		int menu = 0;
		int functions = 0;
		int wrongName =0;
		
		//Ask if user would like to perform functions, or exit program and see account list
		System.out.println("Would you like to perform operations on any accounts?(Y/N)"
				+ "\n(If not, account summary will print and program will exit)");
		String answer = "";
		answer = myScanner.nextLine();
		if (answer.equals("Y"))
		{
			menu = 1;
			System.out.println("Bank Account Operations");
			System.out.println("If you are done with your operations, type 'Exit' to leave");
		}
		else if(answer.equals("N"))
		{
			//Print out all account summaries
			displayAccount(bankAccount);
			System.out.println("\nHave a great day!");
		}
		
		//Ask for the input of the owner's name
		String searchName = "";
		
		//Create a while loop to work on one account till user wants to exit, give ability to deposit and withdraw
		while(menu == 1)
		{
			System.out.println("Account owner's name to perform functions on:");
			searchName = myScanner.nextLine();
			//Search the object array for the matching account owner's name
			for(int i=0; i<bankAccount.length; i++)
			{
				if(bankAccount[i].getName().contains(searchName))
				{
					wrongName =0;
					functions = 1;
					//Create a while loop to perform function for said account of matching name
					while(functions == 1)
					{
						String accFunction = "";
						//Ask if deposit or withdraw or exit
						bankAccount[i].printAccountSummary();
						System.out.println("Deposit, Withdraw, or Back?");
						accFunction = myScanner.next();
						
						//Deposit
						if(accFunction.equals("Deposit"))
						{
							//Ask user to input the deposit amount
						
						System.out.println("Input amount to deposit:");
						double amount = myScanner.nextDouble();
						
						//create a deposit amount object
						bankAccount[i].deposit(amount);
						}
						
						//Withdraw
						if(accFunction.equals("Withdraw"))
						{
						//Ask user to input the withdraw amount
						System.out.println("Input amount to withdraw:");
						double amount = myScanner.nextDouble();
						
						//Then withdraw it from the CheckingAccount object
						bankAccount[i].withdraw(amount);
						}
						
						//Exit
						if(accFunction.equals("Back"))
						{
							myScanner.nextLine();
							functions = 0;
						}
					}
				}
				else
				{
					wrongName++;
				}
			}
				//Exit out at any point using Exit
				if(searchName.equals("Exit"))
				{
					wrongName =0;
					menu = 0;
					displayAccount(bankAccount);
					System.out.println("\nHave a great day!");
				}
				if(wrongName >= 103)
				{
					System.out.println("Account Name not found, try again.");
					System.out.println("");
					wrongName =0;
				}
		}
		
	}//End of main method

	
	//Formatted table for print
	public static void displayAccount(CheckingAccount bankAccount[])
	{
		System.out.println("Account Summary");
		System.out.println("---------------------------------------");
		System.out.printf("%-20s %-20s %-20s",
				"Account Name", "Account Number", "Account Balance");
		for(int i=0; i<bankAccount.length; i++)
		{
			System.out.printf("\n%-20s %-20d %-20.2f",
					bankAccount[i].getName(), 
					bankAccount[i].getNumber(),
					bankAccount[i].getBalance());	
		}
	}
}