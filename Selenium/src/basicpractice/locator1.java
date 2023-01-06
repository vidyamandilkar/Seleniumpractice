package basicpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1 
{
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http:\\facebook.com");
			//by css id
			WebElement userid=driver.findElement(By.cssSelector("#email"));
			userid.sendKeys("abc@123");
			userid.clear();
			//by tag n id
			driver.findElement(By.cssSelector("input#email"));
			userid.sendKeys("abc@124");
			userid.clear();
			//tag n claa
			driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
			userid.sendKeys("abc@125");
			userid.clear();
			//by tag n atrribure
			driver.findElement(By.cssSelector("input[name=email"));
			userid.sendKeys("abc@126");
			userid.clear();
			//by tag class n attribute
			driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[data-testid=\"royal_email]"));
			userid.sendKeys("abc@127");
			userid.clear();
		
			
			driver.close();
			
		}
}
