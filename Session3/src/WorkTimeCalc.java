/*
 * Author: Gunnar Yonker
 * Created: 5/31/2022
 * Description: lecture practice to calculate over time hour payment
 */
import java.util.*;
import java.text.DecimalFormat;

public class WorkTimeCalc {
	public static void main(String args[])
	{
		//Declare variables of work time and overtime
		double workTime =0, overTime =0, basicPayment =0, dailyPayment =0, overTimePayment;
		Scanner timeClock = new Scanner(System.in);
		
		//Ask for how many hours that have been worked
		System.out.print("Hours worked: ");
		
		//Save hours worked to workTime variable
		workTime = timeClock.nextDouble();
		
		//Is the overtime taking place
		if(workTime > 8)
		{
			overTime = workTime - 8;
			overTimePayment = 10*overTime;
			basicPayment = 7*8;
			dailyPayment = basicPayment + overTimePayment;
		}
		else {
			dailyPayment = 7*workTime;
		}
		//Decimal formatting
		DecimalFormat df = new DecimalFormat ("0.00");
		
			//Print out daily payment
		System.out.println("Your pay is: $" + df.format(dailyPayment));
	}
}
