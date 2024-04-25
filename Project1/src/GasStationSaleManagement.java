/**
 * Project 1
 * File: GasStatonSaleManagement.java
 * Date of Creation: 6/15/2022
 * Date of Modification: 6/16/2022
 * Author: Gunnar Yonker
 **/
import java.text.DecimalFormat;

public class GasStationSaleManagement {
	public static void main(String args[]){
	
		/******************************************************
		* (1) Creating arrays and initializing them
		*******************************************************/
		
		//Create an array and initialize it for the grade of gas chosen by each customer and the gallons of gas added by each customer
		int grades[] = {87,87,89,87,87,87,87,91,87,87,89,87,87,89,89,87,87,91,87,87,87,87,89,87,87,87,87,89,91,87,87,91,87,89,89,87,87,87,89,87,87,87,87,89,87,87,91,87,91,87,89,87,87,87,87,91,87,87,87,87};
		double gallons[] = {5,15,12.2,18,11,14,3,2.6,42,11,13.6,11,8.5,4.2,11,21,4,16.4,19.2,24,2.5,15,12.2,18,4.4,14,3,15.4,12.8,11,5,15,12.2,18,11,14,3,17,26,15.8,3.2,22.4,12.2,18,11,14,17.2,25,14.6,11,2.5,15,12.2,18,1.8,14,4.1,17,32,11};
		
		/******************************************************
		* (2) Calculating the total charge for each transaction
		*******************************************************/
		
		//Set the gas prices per grade
		//#87 4.59
		final double gas87 = 4.59;
		//#89 4.89
		final double gas89 = 4.89;
		//#91 5.29
		final double gas91 = 5.29;
		
		//Calculate the total charge for each transaction using the basic prices for each grade of gas
		final int SALES = 60;
		double costarray[] = new double[SALES];
		for(int i=0; i<grades.length; i++)
		{
			//If 87 or 89 chosen and over 20 gallons of gas, 5% discount is given, 2% for at least 10 but less than 20, no discount less than 10, no discount on 91
			if(grades[i] == 87)
			{
				if(gallons[i] >= 20)
				{
					//5% discount over 20 gallons
					costarray[i] = (gas87*gallons[i]) * 0.95;
				}
				if(gallons[i] >= 10 && gallons[i] < 20)
				{
					//2% discount
					costarray[i] = (gas87*gallons[i]) * 0.98;
				}
				else
				{
					costarray[i] = gas87*gallons[i];
				}
			}
			//If 89 apply discount over 20, and between 10 and 20
			if(grades[i] == 89)
			{
				if(gallons[i] >= 20)
				{
					//5% discount over 20 gallons
					costarray[i] = (gas89*gallons[i]) * 0.95;
				}
				if(gallons[i] >= 10 && gallons[i] < 20)
				{
					//2% discount
					costarray[i] = (gas89*gallons[i]) * 0.98;
				}
				else
				{
					costarray[i] = gas89*gallons[i];
				}
			}
			//If 91 no discount, just calculate charge
			if(grades[i] == 91)
			{
				costarray[i] = gas91*gallons[i];
			}
		}
		
		/******************************************************
		* (3) Profit Calculation
		*******************************************************/
		
		//No sale tax included in the receipt, charge includes 32.9 cents/gallon that is paid to state's transportation department
		
		
		//Gas station wholesale prices, compute the profit of each
			//#87 3.89
		final double whole87 = 3.89;
			//#89 4.09
		final double whole89 = 4.09;
			//#91 4.39
		final double whole91 = 4.39;
		
		//Create the profit array
		double profitarray[] = new double[SALES];
		
		//Compute the the profit for each transaction and save them into an array
		for(int i=0; i<grades.length; i++)
		{
			//Profit on 87
			if(grades[i] == 87)
			{
				profitarray[i] = ((costarray[i])-(whole87*gallons[i]))-(gallons[i]*.329);
			}
			//Profit on 89
			if(grades[i] == 89)
			{
				profitarray[i] = ((costarray[i])-(whole89*gallons[i]))-(gallons[i]*.329);
			}
			//Profit on 91
			if(grades[i] == 91)
			{
				profitarray[i] = ((costarray[i])-(whole91*gallons[i]))-(gallons[i]*.329);
			}
		}
		
		/******************************************************
		* (4) Generate a transaction sale report
		*******************************************************/
		//Decimal Formatting
		DecimalFormat dff = new DecimalFormat ("0.00");
		
		//Display the transaction #, Grade, Gallons, Charge, Tax, and Profit in a receipt
		System.out.println("Transaction#\tGrade\tGallons\tCharge\tTax\tProfit");
		int salenum = 1;
		for(int i=0; i<grades.length; i++)
		{
			System.out.println(salenum+"\t \t "+grades[i]+"\t"+gallons[i]+"\t"+"$"+dff.format(costarray[i])+"\t"+"$"+dff.format((gallons[i]*.329))+"\t"+"$"+dff.format(profitarray[i]));
			salenum++;
		}
		//Also print out total sale income, total tax to be paid to state, and total profit as the last row
		double salesum =0;
		for(int i=0; i<grades.length; i++)
		{
			salesum = salesum + costarray[i];
		}
		double taxsum =0;
		for(int i=0; i<grades.length; i++)
		{
			taxsum = taxsum + (gallons[i]*.329);
		}
		double profitsum =0;
		for(int i=0; i<grades.length; i++)
		{
			profitsum = profitsum + profitarray[i];
		}
		System.out.println("Total Sale: $"+dff.format(salesum));
		System.out.println("Total Tax: $"+dff.format(taxsum));
		System.out.println("Total Profit: $"+dff.format(profitsum));
		
		/******************************************************
		* (5) Top Customer Tracking
		*******************************************************/
		
		//Find the top 3 transactions in terms of profit
		
		//Find the max
		double third=0, second=0, max=0;
		int firstMax =0;
		int saleid[] = {1,2,3,4,5,6,7,8,9,10,11, 12, 13, 14, 15, 16, 17, 18, 19, 20 , 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
		int secondMax =0;
		int thirdMax =0;
		int firstsale =0, secondsale =0, thirdsale =0;
		int counter =0;
			for(int i=1; i<gallons.length; i++)
	        { 
	            //first max
	            if (profitarray[i] > max) 
	            { 
	                third = second; 
	                second = max; 
	                max = profitarray[i]; 
	                firstMax = i;
	                firstsale = saleid[i];
	            } 
	            //second max
	            else if (profitarray[i] > second) 
	            { 
	                third = second; 
	                second = profitarray[i]; 
	                secondMax = i;
	                secondsale = counter;
	                secondsale = saleid[i];
	            } 
	            //third max
	            else if (profitarray[i] > third) 
	            {
	                third = profitarray[i]; 
	            	thirdMax = i;
	            	thirdsale = saleid[i];
	            }
	        }
		//Print out the top three in the same formatting as the receipt in 4, cannot use sort methods
		System.out.println(" ");
		System.out.println("Top 3 Sales:");
		System.out.println("Transaction#\tGrade\tGallons\tCharge\tTax\tProfit");
		System.out.println(firstsale +"\t \t "+grades[firstMax]+"\t"+gallons[firstMax]+"\t"+"$"+dff.format(costarray[firstMax])+"\t"+"$"+dff.format((gallons[firstMax]*.329))+"\t"+"$"+dff.format(profitarray[firstMax]));
		System.out.println(secondsale +"\t \t "+grades[secondMax]+"\t"+gallons[secondMax]+"\t"+"$"+dff.format(costarray[secondMax])+"\t"+"$"+dff.format((gallons[secondMax]*.329))+"\t"+"$"+dff.format(profitarray[secondMax]));
		System.out.println(thirdsale +"\t \t "+grades[thirdMax]+"\t"+gallons[thirdMax]+"\t"+"$"+dff.format(costarray[thirdMax])+"\t"+"$"+dff.format((gallons[thirdMax]*.329))+"\t"+"$"+dff.format(third));
		
		/******************************************************
		* (6) Special low value transaction tracking
		*******************************************************/
		
		//Find the sales that happened before the total sale value hit 1500
		
		//Print out the sales that had values less than 20
		System.out.println(" ");
		System.out.println("Special Low Value Transactions:");
		System.out.println("Transaction#\tGrade\tGallons\tCharge\tTax\tProfit");
		salenum =1;
		double salemax =0;
		while(true)	//Must use at least 1 loop to complete this section
		{
			for(int i=1; i<gallons.length; i++)
			{
				salemax = salemax + costarray[i];
				if(costarray[i] < 20)
					{
					System.out.println(saleid[i]+"\t \t "+grades[i]+"\t"+gallons[i]+"\t"+"$"+dff.format(costarray[i])+"\t"+"$"+dff.format((gallons[i]*.329))+"\t"+"$"+dff.format(profitarray[i]));
					}
				if(salemax > 1500)
				{
					break;
				}
			}
			break;
		}
		
		/******************************************************
		* (7) Summary Reports
		*******************************************************/
		
		//Compute the total gallons sold for each grade, total sale income, total tax, and total profit
		
		//variables for each grade sold and all totals
		double totcharge = salesum;
		double tottax = taxsum;
		double totprofit = profitsum;
		
		//Variables for average profit per gallon for each grade
		double gallons87 =0, gallons89 =0, gallons91 =0;
		double profit87 =0, profit89 =0, profit91 =0;
		
		//Compute the average profit per gallon for each grade
		for(int i=0; i<gallons.length; i++)
		{
			if(grades[i] == 87)
			{
				gallons87 = gallons87 + gallons[i];
				profit87 = profit87 + profitarray[i];
			}
			if(grades[i] == 89)
			{
				gallons89 = gallons89 + gallons[i];
				profit89 = profit89 + profitarray[i];
			}
			if(grades[i] == 91)
			{
				gallons91 = gallons91 + gallons[i];
				profit91 = profit91 + profitarray[i];
			}
		}
		//Average profit per gallon grade 87
		double avgpro87 =0;
		avgpro87 = profit87/gallons87;
		//Average profit per gallon grade 89
		double avgpro89 =0;
		avgpro89 = profit89/gallons89;
		//Average profit per gallon grade 91
		double avgpro91 =0;
		avgpro91 = profit91/gallons91;
		
		//Overall profit per gallon
		double avgprofit =0;
		avgprofit = (avgpro87 + avgpro89 + avgpro91)/3;
		
		//Decimal Formatting for gallons to one decimal point
		DecimalFormat dfgal = new DecimalFormat ("0.0");
		
		//Print out all of these values in a table
		System.out.println(" ");
		System.out.println("Summary Report:");
		System.out.println("#87Gallons\t#89Gallons\t#91Gallons\tTotCharge     TotTax\t TotProfit");
		System.out.println(gallons87+"\t \t"+dfgal.format(gallons89)+"\t \t"+gallons91+"\t \t$"+dff.format(totcharge)+"      $"+dff.format(tottax)+"\t $"+dff.format(totprofit));
				
		System.out.println(" ");
		System.out.println("Average Profit Per Per Gallon:");
		System.out.println("87\t\t89\t\t91\t\tOverall");
		System.out.println("$"+dff.format(avgpro87)+"\t \t$"+dff.format(avgpro89)+"\t \t$"+dff.format(avgpro91)+"\t \t$"+dff.format(avgprofit));
	}
}
