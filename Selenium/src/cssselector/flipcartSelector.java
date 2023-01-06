package cssselector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartSelector
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//imlicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> sugglist=driver.findElements(By.cssSelector("div._331-kn._2tvxW>div>div>div"));
		System.out.println("suggestion count="+sugglist.size());
		for(int i=0;i<sugglist.size();i++)
		{
			System.out.println(sugglist.get(i).getText());
		}
		
	}
}
