package BasicMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	//System.getProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	ChromeDriver sdriver=new ChromeDriver();
	sdriver.get("http:\\Google.com");
	System.out.println("print current url of doodle"+sdriver.getCurrentUrl());
	String Title1=sdriver.getTitle();
	System.out.println("Title of page="+Title1);
	System.out.println("length of title="+Title1.length());
	System.out.println("Title verificTION="+Title1.equals("google"));
	System.out.println("Title verificTION="+Title1.equals("Google"));
	sdriver.close();
	
	}
}
