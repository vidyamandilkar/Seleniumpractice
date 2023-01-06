package Locator;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleapp_Assignment8 {
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("http://sampleapp.tricentis.com/101/");
		String url1=cdriver.getCurrentUrl();
		System.out.println("validate url="+url1.equals(""));
		
		String title1=cdriver.getTitle();
		System.out.println("Titlre of page="+title1);
		System.out.println("validate Title="+title1.equals("Tricentis Vehicle Insurance"));
		System.out.println("length of Title ="+title1.length());
		
		String source1=cdriver.getPageSource();
		System.out.println("length od source code of page="+source1.length());
		System.out.println("home of page="+cdriver.getTitle());
		
}
}