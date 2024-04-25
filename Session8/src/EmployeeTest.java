import java.util.*;
/*
 * EmpaloyeeTest.java
 * Include the main method that test the use of Employee class
 * 	and objects
 * Written by:	Gunnar Yonker
 * Written on: 6/22/2022
 * */
public class EmployeeTest {
	public static void main(String args[])
	{
		//Ask user to input the name of an employee
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Input the name of the employee:");
		String employeeName1 = myScanner.nextLine();
		System.out.println("Input the salary of "+employeeName1+":");
		double employeeSalary1 = myScanner.nextDouble();
		
		//Create an Employee object using the input name and salary values
		Employee employee1 = new Employee(employeeName1, employeeSalary1);

		//Use the printPayStub method to display paystub
		//	of employee1
		employee1.printPayStub();

		/*Old code that does not use regular methods*/
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
		
		
				
	}//end of the main method
	
}
