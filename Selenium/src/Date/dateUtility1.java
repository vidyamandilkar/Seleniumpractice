package Date;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class dateUtility1 
{

	public static void main(String[] args) 
	{
		System.out.println("calling first method");
		System.out.println(getDateOnDay("dd MM yyyy",0));
		System.out.println(getDateOnDay("dd MM yyyy",-2));
		
		
	}
	
	public static String getDateOnDay(String format,int noOfDays)
	{
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, noOfDays);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));		
		
	}
	public static String getDateOnMonth(String format,int noOfMonth)
	{
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.MONTH, noOfMonth);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));		
		
	}

	public static String getDateOnYear(String format,int noOfYear)
	{
		
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.YEAR, noOfYear);
		SimpleDateFormat s=new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));		
		
	}

	
}
