/*
 * Employee.java
 * The class definition for Employee
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 */
public class Employee {
	//Define the attributes
	private String name;
	
	//Define the constructor
	public Employee(String eName)
	{
		name = eName;
		
	}
	
	//Define the methods
	public void setName(String newName)
	{
		//Assign the parameter value to the attribute name
		name = newName;
	}
	public String getName()
	{
		return name;
	}
	
}
