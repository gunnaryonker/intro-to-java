/*
 * AccountNumber.java
 * The class definition for Account Number
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 */
public class AccountBalance {
	//Define the attributes
	private double balance;
	
	//Define the constructor
	public AccountBalance(double accBal)
	{
		balance = accBal;
	}
	
	//Define the methods
	public void setBalance(double newBal)
	{
		//Check if entry is positive before setting
		if(newBal <= 0)
		{
			System.out.println("Invalid Entry, balance needs to be positive.");
			newBal = 0;
		}
		else {
		//Assign a parameter value to the attribute name
		balance = newBal;
		}
	}
	public double getBalance()
	{
		return balance;
	}
}
