import java.text.DecimalFormat;
import java.util.Scanner;

/**
* Project 2
* Names of classes defined: PizzaOrder.java and PizzaOrderMain.java
* Date of creation: 6/28/2022
* Date of modification: 6/29/2022
* Author: Gunnar Yonker
**/

public class PizzaOrderMain {
	public static void main(String args[]) {
	//Define scanner and any needed variables
	Scanner myScanner = new Scanner(System.in);
	
	//Declare the object array with 10 pizza orders
	final int PIZZA_COUNT = 10;
	PizzaOrder pizzaOrders[] = new PizzaOrder[PIZZA_COUNT];
	
	//Ask user to input detailed info on each of 10 pizza orders
	//Name, size, topping, and distance
	
	String name = "";
	String size = "";
	String topping = "";
	double distance = 0;
	int ordernumber = 0;
	
	//Create a for loop that asks for all inputs until object array is full
	for(int i=0; i<pizzaOrders.length; i++)
	{
		//Order number 1-10 counter
		ordernumber++;
		//Ask for name
		System.out.println("Customer "
				+ (i+1)+" name:");
		name = myScanner.nextLine();
		//Ask for size of pizza(give options)
		System.out.println("Size of pizza(Small, Medium, Large):");
		size = myScanner.nextLine();
		//Ask for topping(give options)
		System.out.println("Pizza Topping(Cheese=No Fee, Pepperoni=$1 Fee, Sausage=$2 Fee):");
		topping = myScanner.nextLine();
		System.out.println("Delivery Distance(0 Miles Self pick-up=No Fee, 0-1 Miles=$2, >1 Mile=$2 plus $0.50/mile over 1):");
		distance = myScanner.nextDouble();
		//Create the object using the input values
		pizzaOrders[i] = new PizzaOrder(ordernumber, name, size, topping, distance);
		name = myScanner.nextLine();
	}
	
	//Compute total charge and total revenue for all 10 orders
	double totRev = 0;
	double totCharge =0;
	
	//Get the totCharge value and calculate total revenue on all 10 orders
	for(int i=0; i<pizzaOrders.length; i++)
	{
	totCharge = pizzaOrders[i].calcCharge();
	totRev = totCharge + totRev;
	}
	
	//Decimal Formatting
	DecimalFormat df = new DecimalFormat ("0.00");
	
	//Print order information on each 10 pizzas in table format
	displayOrders(pizzaOrders);
	System.out.println("\nTotal Revenue: $" + df.format(totRev));
}

/**
 * Table format for pizza order information
 * Pizza order ID 1-10
 * Customer Name
 * Size of the pizza
 * Topping of the pizza
 * Distance for delivery
 * Total Charge
 * Total Revenue generated
 **/

public static void displayOrders(PizzaOrder pizzaOrders[])
{
	System.out.println("Pizza Orders");
	System.out.println("---------------------------------------");
	System.out.printf("%-15s %-15s %-15s %-15s %-20s %-20s",
			"Order#", "Name", "Size", "Topping", "Delivery Distance", "Total Charge");
	for(int i=0; i<pizzaOrders.length; i++)
	{
		System.out.printf("\n%-15d %-15s %-15s %-15s %17.2f %15.2f",
				pizzaOrders[i].getID(),
				pizzaOrders[i].getName(), 
				pizzaOrders[i].getSize(),
				pizzaOrders[i].getTopping(),
				pizzaOrders[i].getDistance(),
				pizzaOrders[i].calcCharge());	
		}
	}
}

