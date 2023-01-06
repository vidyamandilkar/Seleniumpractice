package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOfUtilty {

	public static void main(String[] args)
	{
		seleniumresuableFunctions s1=new seleniumresuableFunctions();
		WebDriver driver=s1.setUp("chrome","http:\\www.flipkart.com");
		
		
		
		
		driver.findElement(By.xpath("//*[@class='_3704LK']")).sendKeys("samsungmobiles");
		
		
//		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
//		ChromeDriver driver1=new ChromeDriver();
//		driver1.get("http:\\www.flipkart.com");
		
		
	}

}
