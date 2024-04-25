import java.util.*;
/* 
 * CheckingAccountDemo.java
 * Create a checking account class with three attributes: account number, owner's name and balance. Add in ability to deposit or withdraw
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 * Modified: 6/22/2022
 */
public class CheckingAccountDemo {
	public static void main(String args[]) {
		
		//Ask user to input the name
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Input the account owner's name:");
		String aName1 = myScanner.nextLine();
		//Ask user to input account number
		System.out.println("Input the account number:");
		int aNum1 = myScanner.nextInt();
		//Ask user to input the initial balance for the account
		System.out.println("Input the initial account balance:");
		double aBalance1 = myScanner.nextDouble();
		
		//Create an CheckingAccount object using the input name, account number and balance
		CheckingAccount account1 = new CheckingAccount(aName1, aNum1, aBalance1);
				
		//Call the displayAccount() method to print the summary of this account
		System.out.println("");
		account1.printAccountSummary();
		int menu = 1;
		
		//Stop menu from coming up with functions if incorrect balance was entered initially
		if(aBalance1 < 0)
		{
			menu = 0;
		}
		
		//Create a while loop to allow user to deposit, withdraw as many times as they want or exit
		while(menu == 1)
		{
			String accFunction = "";
			//Ask if deposit or withdraw or exit
			System.out.println("Deposit, Withdraw, or Exit?");
			accFunction = myScanner.next();
			
			//Deposit
			if(accFunction.equals("Deposit"))
			{
				//Ask user to input the deposit amount
			
			System.out.println("Input amount to deposit:");
			double amount = myScanner.nextDouble();
			
			//create a deposit amount object
			account1.deposit(amount);
			
			//Call the displayAccount() method to show the summary
			System.out.println("");
			account1.printAccountSummary();
			}
			
			//Withdraw
			if(accFunction.equals("Withdraw"))
			{
			//Ask user to input the withdraw amount
			System.out.println("Input amount to withdraw:");
			double amount = myScanner.nextDouble();
			
			//Then withdraw it from the CheckingAccount object
			account1.withdraw(amount);
			
			//Call the displayAccount() method to show the summary if operation is successful
			System.out.println("");
			account1.printAccountSummary();
			}
			
			//Exit
			if(accFunction.equals("Exit"))
			{
				System.out.println("");
				account1.printAccountSummary();
				System.out.println("Thank you and have a great day!");
				menu = 0;
			}
			//Call the displayAccount() method to print the summary of the account and then exit the program
		
		}
	}
	}
