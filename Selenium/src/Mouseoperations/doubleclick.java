package Mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args)
	{
		String chrompath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrompath);

		//instance of driver
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		//handle pop up usung escape
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		System.out.println("escape pop up");
		
		//find log in buttton
		
		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		
		System.out.println("clik");
		act.click(login).perform();
		
		
		
		
		
		

	}

}
