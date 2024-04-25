/*
 * Author: Gunnar Yonker
 * Created: 5/31/2022
 * A program to convert the numeric rank of a school into the tier rank
 */
import java.util.*;

public class SchoolRank {
	public static void main(String args[]) {
		//Create a scanner object
		Scanner myScanner = new Scanner(System.in);
		
		//Declare variables for numeric rank and tier rank
		int numericRank = 0;
		String tierRank = "";
		
		//Ask for keyboard input for the numeric rank
		System.out.println("Numeric rank for this school: ");
		numericRank = myScanner.nextInt();
		
		if(numericRank <=0)
		{
			System.out.println("The rank value is "+numericRank+" was invalid!");
			return;
		}
		//Convert the numerical rank into the tier rank
		if(numericRank <= 100)
		{
			tierRank = "Tier 1";
		}
		else if(numericRank <=200) // 100 < rank < 200
		{
			tierRank = "Tier 2";
		}
		else	//Rank > 200
		{
			tierRank = "Tier 3";
		}
		
		//Print out both rank results
		System.out.println("This school's numeric rank is " + numericRank + 
				", it's tier rank is " + tierRank);
	}
}
