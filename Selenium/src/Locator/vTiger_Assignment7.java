package Locator;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
public class vTiger_Assignment7 
{
	public static void main(String arg[])
	{	//run script
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cdriver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String url1=cdriver.getCurrentUrl();
		System.out.println("validate url="+url1.equals("https://demo.vtiger.com/vtigercrm/index.php "));
		String title1=cdriver.getTitle();
		
		System.out.println("Titlre of page="+title1);
		System.out.println("length Titlre of page="+title1.length());
		String source1=cdriver.getPageSource();
		System.out.println("length od source code of page="+source1.length());
		// we can 
		cdriver.findElement(By.name("username")).clear();
		
		cdriver.findElement(By.name("username")).sendKeys("admin");
		
		cdriver.findElement(By.name("password")).clear();
		
		cdriver.findElement(By.name("password")).sendKeys("Test@123");
		
		WebElement passwardInputfield=cdriver.findElement(By.name("password"));
		passwardInputfield.sendKeys("Test@123");
		
		WebElement loginbtn=cdriver.findElement(By.tagName("button"));
		loginbtn.click();
		System.out.println("homepage titlt="+cdriver.getTitle());
	}
}
