/*
 * AccountNumber.java
 * The class definition for Account Name
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 */
public class AccountName {
	//Define the attributes
	private String name;
	
	//Define the constructor
	public AccountName(String accName)
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
}
