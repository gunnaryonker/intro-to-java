import java.util.*;
/*
 * EmployeeTest.java
 * Include the main method that test the use of Employee class
 * and objects
 * Author: Gunnar Yonker
 * Created: 6/18/2022
 */


public class EmployeeTest {
	public static void main(String args[]) {
		
		//Ask user to input the name of an employee
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Input the name of the employee:");
		String employeeName1 = myScanner.nextLine();
		
		//Create an Employee object and set that inputted name to this object
		Employee employee1 = new Employee(employeeName1);
		//employee1.setName(employeeName1);
		
		//Print out the name of the employee using the getName method
		String eName1 = employee1.getName();
		System.out.println("The name of employee 1 is "+eName1);
		
		//Could be set as System.out.println("The name of employee 1 is"+employee1.getname();
		
		//Using a constructor to initialize object attribute
		System.out.println("Input the name of the 2nd employee:");
		String employeeName2 = myScanner.nextLine();
		
		//Create an Employee object using constructor
		Employee employee2 = new Employee(employeeName2);
		System.out.println("The name of employee 1 is "+employee2.getName());
		
	}
}
