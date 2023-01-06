package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) 
	{	//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver pdrivers=new ChromeDriver();
		
		pdrivers.get("http:\\facebook.com");
		String u1=pdrivers.getCurrentUrl(); 
		String Title=pdrivers.getTitle();
		System.out.println("Title of page="+Title);
		System.out.println("Title verification="+Title.equals("facebook"));
		System.out.println("Title verification="+Title.equals("log in or sign upFacebook – log in or sign up"));
		System.out.println("length of title="+Title.length());
		String srccode=pdrivers.getPageSource();
	//	System.out.println("page Source="+srccode);
		System.out.println("Length of srccode="+srccode.length());
		
		pdrivers.close();

	}

}
