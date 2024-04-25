/*
 * Employee.java
 * The class definition for Employee
 * Written by:	Gunnar Yonker
 * Written on:	6/26/2022
 * */
public class Employee {
	//Define the attributes
	private String name;
	private double salary;
	
	//Define the constructor
	public Employee(String eName, double eSalary)
	{
		setName(eName);
		setSalary(eSalary);
	}
	//Define the methods
	public void setName(String newName)
	{
		//Assign the parameter value to the attribute name
		this.name = newName;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double aSalary) 
	{
		//Make sure the salary passed to the attribute is valid
		if(aSalary >= 500 && aSalary <=20000)
		{
			this.salary = aSalary;
		}
		else //invalid salary, just set the attribute value to default
		{
			System.out.println("The salary value "+ aSalary+" is invalid!");
			this.salary = 500;
		}
		
	}//end of the setSalary method
	
	/**
	 * calTax()
	 * Calculate the tax following the criteria based on 
	 * 	one's salary.
	 * @param	none. Use the attribute salary
	 * @return	the tax calculated 
	 */
	public double calcTax()
	{
		//Declare a tax variable
		double tax = 0;
		double taxRate = 0;
		
		//Calculate the tax based on the salary
		if(this.salary > 8000)
		{
			taxRate = 0.25;
		}
		else if (this.salary >6000) // between 6a000 and 8000
		{
			taxRate = 0.15;
		}
		else if (this.salary >4000) //between 4000 and 6000
		{
			taxRate = 0.07;
		}
		else	//Below 4000
		{
			taxRate = 0;
		}
		
		//Return the tax
		tax = this.salary*taxRate;
		return tax;
	}

	/**
	 * printPayStub()
	 * Print out the pay stub information for the 
	 * 	employee including name, salary, tax, and net payment
	 * @param:	none. Just use salary and name attributes
	 * @return:	none.
	 * */
	public void printPayStub()
	{
		double tax = calcTax();
		double netPayment = this.salary - tax;
		System.out.println("**********************");
		System.out.println("PayStub for "+getName()+"\n"); 
		System.out.println("The salary is "
				 +getSalary()); 
		System.out.println("The tax is "
				 +tax);
		System.out.println("The net payment is "
				 +netPayment); 
		System.out.println("**********************");
	}

}

