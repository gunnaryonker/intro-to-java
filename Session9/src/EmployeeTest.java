import java.util.Scanner;
/*
 * EmpaloyeeTest.java
 * Include the main method that test the use of Employee class
 * 	and objects
 * Written by:	Gunnar Yonker
 * Written on: 6/26/2022
 * */
public class EmployeeTest {
	public static void main(String args[])
	{
		//Ask user to input the name of an employee
		Scanner myScanner = new Scanner(System.in);
		/*
		System.out.println("Input the name of the employee:");
		String employeeName1 = myScanner.nextLine();
		System.out.println("Input the salary of "+employeeName1+":");
		double employeeSalary1 = myScanner.nextDouble();
		
		//Create an Employee object using the input name and salary values
		Employee employee1 = new Employee(employeeName1, employeeSalary1);
		//employee1.setName(employeeName1);
		//employee1.setSalary(employeeSalary1);
		
		//Print out the name of the employee using the getName method
		/*String eName1 = employee1.getName();
		System.out.println("The name of employee 1 is "+eName1);*/
		
		//Compute the tax and net payment
		/*
		double tax = employee1.calcTax();
		double netPayment = employee1.getSalary() - tax;
		System.out.println("The name of employee 1 is "
		 +employee1.getName()); 
		System.out.println("The salary is "
				 +employee1.getSalary()); 
		System.out.println("The tax is "
				 +tax);
		System.out.println("The net payment is "
				 +netPayment); 
		*/
		
		//Use the printPayStub method to display paystub
		//	of employee1
		/*employee1.printPayStub();
		*/
		/**
		 * Use object array to manage large number of employees
		 * */
		
		//Create an object array for employees
		final int EMPLOYEE_COUNT = 2;
		Employee myEmployee[] = new Employee[EMPLOYEE_COUNT];
		
		//Obtain values for attributes of each employee
		// and create the corresponding employee object
		String name = "";
		double salary = 0;
		for(int i=0; i<myEmployee.length; i++)
		{
			myScanner.nextLine();
			//Ask for name and salary for employee
			System.out.println("The name of employee "
					 +(i+1)+":"); 
			name = myScanner.nextLine();
			System.out.println("The salary of employee "
					 +(i+1)+":");			
			salary = myScanner.nextDouble();
			//Create an object using the input value
			myEmployee[i] = new Employee(name, salary);
		}
		
		//Print out a formatted employee paystub table
		groupPayStub(myEmployee);
		
	}//end of the main method
	
	
	public static void groupPayStub(Employee employee[])
	{
		System.out.printf("\n %20s %10s %10s %10s",
				"Name", "Salary", "Tax", "NetIncome");
		for(int i=0; i<employee.length; i++)
		{
			System.out.printf("\n %20s %10.2f %10.2f %10.2f",
					employee[i].getName(), 
					employee[i].getSalary(),
					employee[i].calcTax(),
					employee[i].getSalary()- 
					employee[i].calcTax());			
		}

	}
}

