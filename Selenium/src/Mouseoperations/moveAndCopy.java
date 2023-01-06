package Mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveAndCopy {

	public static void main(String[] args)
	{
		String chromeExePath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		////////////
//		String chromepath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver"+ chromepath);
		
		//create an instance

		ChromeDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify first name
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("vidya");
		
		//creating object of Actions class
		
		Actions act=new Actions(driver);
		act.moveToElement(fname).perform();
		System.out.println("goes on fname");
		act.moveToElement(fname).doubleClick().perform();
		System.out.println("double Clicl on fname");
		act.moveToElement(fname).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.out.println("copy text");
		//past
		
		WebElement Lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		act.moveToElement(Lname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		//act.moveToElement(Lname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		System.out.println("copy text into last name");

	}

}
