/* 
 * CheckingAccount.java
 * Create a checking account class with three attributes: account number, owner's name and balance
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 * Modified: 6/19/2022
 */
public class CheckingAccount {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	//Check to make sure that the entry for balance is positive, print out error and make zero if it is a negative entry
	CheckingAccount(int accountNumber, String accountName, double accountBalance)
	{
		if(accountBalance < 0)
		{
			System.out.println("Invalid entry, balance can't be negative.");
			this.accountBalance = 0;
		}
		else
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	
	//Account setter
	private int account;
	
	//Define the constructor
	public CheckingAccount(int accNum)
	{
		account = accNum;
	}
	
	//Define the methods
	public void setAccount(int newAcc)
	{
		//Assign a parameter value to the attribute name
		account = newAcc;
	}
	public int getAccount()
	{
		return account;
	}
	
	//Name setter
	private String name;
	
	//Define the constructor
	public CheckingAccount(String accName)
	{
		name = accName;
	}
	
	//Define the methods
	public void setName(String newName)
	{
		//Assign a parameter value to the attribute name
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	
	//Account Balance setter
	private double balance;
	
	//Define the constructor
	public CheckingAccount(double accBal)
	{
		balance = accBal;
	}
	
	//Define the methods
	public void setBalance(double newBal)
	{
		//Assign a parameter value to the attribute name
		balance = newBal;
	}
	public double getBalance()
	{
		return balance;
	}

	
	//Create a method for depositing
	public double deposit()
	{
		//declare a withdraw amt
		double depositAmt = 0;
		
		//Check to make sure the deposit amount if positive
		if(depositAmt > 0)
		{
			//Calculate the new balance with the deposit added to it
			balance = balance + depositAmt;
		}
		else
		{
			System.out.println("The deposit amount "+depositAmt+" is invalid!");
			this.deposit = 0;
		}
	}
	
	//Create a parameter for depositing to make sure it is positive
	
	
	//Create a method for withdrawing, use boolean return type to show the success of the operation
	
	//If amount to be withdrawn is negative or one tries to over-withdraw, make no change and return false
	
	//If allowed amount withdrawn, update the balance by subtracting the withdrawing amount from it and then return true
	
	
	
	/**
	 * Create a displayAccount() method that includes
	 * Nice head with customer's name
	 * Account Number
	 * Owner's Name
	 * Current Balance
	 */
	
}
