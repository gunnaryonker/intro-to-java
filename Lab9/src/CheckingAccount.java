/* 
 * CheckingAccount.java
 * Create a checking account class with three attributes: account number, owner's name, balance, deposit method and withdraw method, print account summary
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 * Modified: 6/22/2022
 */
public class CheckingAccount {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	public CheckingAccount(String aName, int aNum, double aBalance)
	{
		setNumber(aNum);
		setName(aName);
		setBalance(aBalance);
	}

	//Define the methods
	public void setNumber(int newNum)
	{
		this.accountNumber = newNum;
	}
	public int getNumber()
	{
		return accountNumber;
	}
	public void setName(String newName)
	{
		this.accountName = newName;
	}
	public String getName()
	{
		return accountName;
	}
	public double getBalance()
	{
		return accountBalance;
	}
	public void setBalance(double bSalary)
	{
		//Make sure balance entry is positive
		if(bSalary > 0)
		{
			accountBalance = bSalary;
		}
		else
		{
			System.out.println("Invalid entry, balance cannot be negative.");
			accountBalance = 0;
		}
	}
	
	//Create a deposit method
	public void deposit(double amount)
	{
		//Check to make sure deposit is positive
		if(amount > 0)
		{
			accountBalance = accountBalance + amount;
		}
		else
		{
			System.out.println("The deposit value "+amount+" is invalid!");
		}
	}
	
	//Create a withdraw method
	public boolean withdraw(double amount)
	{
		//Use a boolean method to show the success of the operation
		boolean check = false;
		
		//Check to see if the amount is negative or will cause over-draw
		if(amount < 0 || amount > accountBalance)
		{
			System.out.println("The withdraw amount "+amount+" is invalid!");
			return false;
		}
		else
		{
			accountBalance = accountBalance - amount;
			return true;
		}
	}
	
	/**
	 * Create an account summary printout
	 * contains nice head
	 * account number
	 * owner's name
	 * current balance
	 */
	public void printAccountSummary()
	{
		System.out.println("****************************************");
		System.out.println("Account Summary for "+getName() +"\n");
		System.out.println("Account Number: "
				+ getNumber());
		System.out.println("Account Owner's Name: "
				+ getName());
		System.out.println("Account Balance: $"
				+ getBalance());
		System.out.println("****************************************");
	}
	
	
	public void displayAccount()
	{
		System.out.printf("\n %20s %10s %10s",
				"Account Name", "Account Number", "Account Balance");
		for(int i=0; i<9; i++)
		{
			System.out.printf("\n %20s %10.2f %10.2f",
					getName(), 
					getNumber(),
					getBalance());	
		}

	}
}