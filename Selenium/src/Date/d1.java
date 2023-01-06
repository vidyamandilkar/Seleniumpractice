package Date;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class d1 {

	public static void main(String[] args)
	{
		//get calender instance
		Calendar cal=Calendar.getInstance();
		
		//add number  of days(+/-) base on days
		
		cal.add(Calendar.DATE, 3);
		
		//date class gives you systems current class
		
		Date d1=new Date(cal.getTimeInMillis());
		
		//simple dateformat help you to get dspecific format of date
		SimpleDateFormat s= new SimpleDateFormat("dd/MMM/yyyy");
		
		
		//with yhe help of SimpleDate TimeFormat change in requied format
		System.out.println(s.format(d1));
	}

}
