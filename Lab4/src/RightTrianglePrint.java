/*
 * Author: Gunnar Yonker
 * Created: 6/5/2022
 * Description: This program asks for an input of how many rows in the triangle and then print out a triangle
 */
import java.util.*;

public class RightTrianglePrint {
	public static void main(String args[]) {
		//create a scanner
		Scanner myScanner = new Scanner(System.in);
		
		//Declare the variables
		int triangleRows =0;
		int counter =0;
		int num =1;
		int counterTwo =0;
		
		//Ask for input of rows of triangles
		System.out.print("Number of rows in triangle: ");
		triangleRows = myScanner.nextInt();
		
		//print out each line and match with counter to make sure its below number
		for(counter =1; counter <= triangleRows; counter++)
		{
			for(counterTwo =1; counterTwo <= counter; counterTwo++)
			{
				System.out.print(num++ + " ");	
			}
			System.out.println("");
		}
		
	}
	
}
