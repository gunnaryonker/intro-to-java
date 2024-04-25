/**
* Project 2
* Names of classes defined: PizzaOrder.java and PizzaOrderMain.java
* Date of creation: 6/28/2022
* Date of modification: 6/29/2022
* Author: Gunnar Yonker
**/

public class PizzaOrder {
	//Define the basic attributes Order ID(1-10), Customer name, size of pizza, topping of pizza, and distance for delivery
	private int orderID;
	private String orderName;
	private String orderSize;
	private String orderTopping;
	private double orderDistance;
	String cheese = "Cheese"; String pepperoni = "Pepperoni"; String sausage = "Sausage";
	String small = "Small"; String medium = "Medium"; String large = "Large";
	
	public PizzaOrder(int oID, String oName, String oSize, String oTopping, double oDistance)
	{
		setID(oID);
		setName(oName);
		setSize(oSize);
		setTopping(oTopping);
		setDistance(oDistance);
	}
	//Define basic methods, constructors, getters and setters for each attribute
	public void setID(int newID)
	{
		this.orderID = newID;
	}
	public int getID()
	{
		return orderID;
	}
	//Customer Name
	public void setName(String newName)
	{
		this.orderName = newName;
	}
	public String getName()
	{
		return orderName;
	}
	//Size of Pizza
	public String getSize()
	{
		return orderSize;
	}
	public void setSize(String newSize)
	{
		//Check if correct size entered, default to small otherwise
		if(newSize.equals(small))
		{
			this.orderSize = newSize;
		}
		else if(newSize.equals(medium))
		{
			this.orderSize = newSize;
		}
		else if(newSize.equals(large))
		{
			this.orderSize = newSize;
		}
		else
		{
			System.out.println("Invalid size, default to small.");
			this.orderSize = small;
		}
	}
	//Topping of Pizza
	public String getTopping()
	{
		return orderTopping;
	}
	public void setTopping(String newTopping)
	{

		//Check if correct topping entered, default to cheese otherwise
		if(newTopping.equals(cheese))
		{
			this.orderTopping = newTopping;
		}
		else if(newTopping.equals(pepperoni))
		{
			this.orderTopping = newTopping;
		}
		else if(newTopping.equals(sausage))
		{
			this.orderTopping = newTopping;
		}
		else
		{
			System.out.println("Invalid topping, default to cheese.");
			this.orderTopping = cheese;
		}
	}
	//Delivery Distance
	public void setDistance(double newDistance)
	{
		//Make sure attribute is positive
		if(newDistance < 0)
		{
			System.out.println("Delivery Distance needs to be positive.");
			this.orderDistance = 0;
		}
		else
		{
			this.orderDistance = newDistance;
		}
	}
	public double getDistance()
	{
		return orderDistance;
	}
	//Method to compute delivery fee
	public double deliveryCalc()
	{
		//Declare new variables
		double milefee = 0;
		
		//Calculate fee
		if(this.orderDistance ==0 )
		{
			//No fee
			milefee = 0;
		}
		if(this.orderDistance > 0 && this.orderDistance <= 1)
		{
			//2 dollar delivery fee
			milefee = 2;
		}
		if(this.orderDistance > 1)
		{
			//2 dollars + 0.50/mile over 1
			milefee = 2 + 0.5*(this.orderDistance - 1);
		}
		
		//Return the milefee
		return milefee;
	}
	
	//Method to compute topping fee
	public double toppingCalc()
	{
		//Declare new variables
		double toppingfee = 0;
		
		//Calculate fee
		if(this.orderTopping.equals(cheese))
		{
			//No fee
			toppingfee = 0;
		}
		if(this.orderTopping.equals(pepperoni))
		{
			//1 dollar fee
			toppingfee = 1;
		}
		if(this.orderTopping.equals(sausage))
		{
			//2 dollars
			toppingfee = 2;
		}
		
		//Return the topping fee
		return toppingfee;
	}
	
	//Method for computing total charge(basic price, topping fee, and delivery fee)
	public double calcCharge()
	{
		double milefee = deliveryCalc();
		double toppingfee = toppingCalc();
		double totCharge = 0;
		
		//Small
		if(this.orderSize.equals(small))
		{
			totCharge = 8 + milefee + toppingfee;
		}
		if(this.orderSize.equals(medium))
		{
			totCharge = 12 + milefee + toppingfee;
		}
		if(this.orderSize.equals(large))
		{
			totCharge = 16 + milefee + toppingfee;
		}
		
		//return the totCharge
		return totCharge;
	}
}
