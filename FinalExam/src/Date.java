import java.time.LocalDate;
import java.time.Period;

/*
 * Author: Gunnar Yonker
 * Date: 7/1/2022
 * File: Date.java
 * Description: A class that contains month, day, and year information. Also contains a displayDate and calculateAge function
 */
public class Date {
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private int futureMonth;
	private int futureDay;
	private int futureYear;
	public Date(int bMonth, int bDay, int bYear, int fMonth, int fDay, int fYear)
	{
		setMonth(bMonth);
		setDay(bDay);
		setYear(bYear);
		setFuturem(fMonth);
		setFutured(fDay);
		setFuturey(fYear);
	}
	
	//Define the methods
	//Make sure month is between 1 and 12, if not set to 1
	public int getMonth()
	{
		return birthMonth;
	}
	public void setMonth(int newMonth)
	{
		if(newMonth >= 1 && newMonth <= 12)
		{
			this.birthMonth = newMonth;
		}
		else
		{
			System.out.println("Invalid Month Input, Month Set to 1");
			this.birthMonth = 1;
		}
	}
	//Assume that day and year are entered correctly
	public void setDay(int newDay)
	{
		this.birthDay = newDay;
	}
	public int getDay()
	{
		return birthDay;
	}
	public void setYear(int newYear)
	{
		this.birthYear = newYear;
	}
	public int getYear()
	{
		return birthYear;
	}
	
	//Define methods of future date
	//Make sure month is between 1 and 12, if not set to 1
		public int getFuturem()
		{
			return futureMonth;
		}
		public void setFuturem(int monthf)
		{
			if(monthf >= 1 && monthf <= 12)
			{
				this.futureMonth = monthf;
			}
			else
			{
				System.out.println("Invalid Month Input, Month Set to 1");
				this.futureMonth = 1;
			}
		}
		//Assume that day and year are entered correctly
		public void setFutured(int dayf)
		{
			this.futureDay = dayf;
		}
		public int getFutured()
		{
			return futureDay;
		}
		public void setFuturey(int yearf)
		{
			this.futureYear = yearf;
		}
		public int getFuturey()
		{
			return futureYear;
		}
		
	
	//Create a function to displayDate, that displays like this month/day/year
	public void displayDate()
	{
		System.out.println(getMonth()+"/"+getDay()+"/"+getYear());
	}
	
	//Create a function to calculateAge with three parameters that indicate a future date, month day year
	//calculate ones age based on birthdate and also on future date
	
	public void calculateAge()
	{
		//Calculate current age based off of birthday
		//Declare the birthday entered
		LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
		
		//Obtain the current date
		LocalDate currentDate = LocalDate.now();
		
		//Obtain the difference between the two dates
		Period difference = Period.between(birthday, currentDate);
		
		//Print out the age in years and days, no months
		System.out.printf("%d years %d months %d days old.", difference.getYears(), difference.getMonths(), difference.getDays());
	}
	
	public void displayFutureDate()
	{
		System.out.println(getFuturem()+"/"+getFutured()+"/"+getFuturey());
	}
	
	//I couldn't figure out a way to get future age in the same function and was running out of time, so I tried this as a fix with a new function
	public void calculateFutureAge()
	{
		//Calculate current age based off of birthday
		//Declare the birthday entered
		LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
		
		//Obtain the current date
		LocalDate futureDate = LocalDate.of(futureYear, futureMonth, futureDay);
		
		//Obtain the difference between the two dates
		Period difference = Period.between(birthday, futureDate);
		
		//Print out the age in years and days, no months
		System.out.printf("%d years %d months %d days old.", difference.getYears(), difference.getMonths(), difference.getDays());
	}
}
