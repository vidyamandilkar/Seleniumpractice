package keyboardEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copy_past {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		//identyfy first name
		WebElement firstName=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		//identyfy last name
		WebElement LastName=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		
		
		System.out.println("select --cop--pst");
		//Select All And Copy frm first name
		firstName.sendKeys("vidya",Keys.chord(Keys.CONTROL,"a"));
		firstName.sendKeys(Keys.CONTROL,"c");
		
		
		//WebElement LastName=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		//Paste in last name
		LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		System.out.println("************************");
		
		//cut past
		System.out.println("select-cut-past");
		
		
		firstName.sendKeys("vidya",Keys.chord(Keys.CONTROL,"a"));
		firstName.sendKeys(Keys.CONTROL,"x");
		
		
		LastName=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		//Paste in last name
		LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		System.out.println("************************");
		
		
		
		//clear
				System.out.println("clear text box");
				
				
				firstName.sendKeys("vidya");
				firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				firstName.sendKeys(Keys.DELETE);
				
				
				System.out.println("************************");
		

	}

}
