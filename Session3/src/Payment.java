/*
 * Class example of payment calculator
 */
import java.util.*;

public class Payment {
	public static void main(String argrs[])
	{
		Scanner myScanner = new Scanner(System.in);
		
		final double BASIC_HOUR_SALARY = 7;
		final double OVER_TIME_SALARY =10;
		
		double hours;
		double totalPayment;
		
		System.out.println("How many hours John has worked today? ");
		hours = myScanner.nextDouble();
		
		if(hours > 8)
		{
			double overtimeHours = hours - 8;
			double overtimePayment = overtimeHours * OVER_TIME_SALARY;
			
			double basicPayment = BASIC_HOUR_SALARY*8;
			
			totalPayment = basicPayment + overtimePayment;
		}
		else
		{
			totalPayment = hours * BASIC_HOUR_SALARY;
		}
		
		System.out.println("John has worked " + hours + (" hours, his total payment today is $" + totalPayment));
		
	}

}
