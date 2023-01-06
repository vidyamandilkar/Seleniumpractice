package Date;
import java.sql.Date;

public class useOfDateUtility {

	public static void main(String[] args)
	{
		dateUtility1 d1=new dateUtility1 ();
		System.out.println("for next dats,monthyears ");
		System.out.println(d1.getDateOnDay("dd/MMM/yyyy", 0));
		System.out.println(d1.getDateOnMonth("dd/MMM/yyyy", 3));
		System.out.println(d1.getDateOnYear("dd/MMM/yyyy", 5));
		
		//for privious
		System.out.println("for privious dats,monthyears ");
		//dateUtility1 d1=new dateUtility1 ();
		System.out.println(d1.getDateOnDay("dd/MMM/yyyy", -3));
		System.out.println(d1.getDateOnMonth("dd/MMM/yyyy", -3));
		System.out.println(d1.getDateOnYear("dd/MMM/yyyy", -5));

				}

}
