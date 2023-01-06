package keyboardEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagedown {

	public static void main(String[] args) throws InterruptedException 
	{
		String chrompath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chrompath);
		//create instance
		ChromeDriver driver=new ChromeDriver();
		//get url
		driver.get("https://www.flipkart.com");
		//handle pop up usung escape
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		System.out.println("escape pop up");
		
		//refresh web page
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		System.out.println("page reffresh");
		
		//scroll down page
		
		WebElement paged=driver.findElement(By.cssSelector("body"));
		paged.sendKeys(Keys.PAGE_DOWN);
		System.out.println("pagedown 1 time");
		for(int i=0;i<10;i++)
		{
			paged.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1000);
			
		}
		System.out.println("pagedown 10 time");
		
		//go to first page page 
		paged.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		
		//go to last page
		paged.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		
	}

}
