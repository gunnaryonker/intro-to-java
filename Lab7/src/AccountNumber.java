/*
 * AccountNumber.java
 * The class definition for Account Number
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 */
public class AccountNumber {
	//Define the attributes
	private int account;
	
	//Define the constructor
	public AccountNumber(int accNum)
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
}
