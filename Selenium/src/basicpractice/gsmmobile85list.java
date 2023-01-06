package basicpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmmobile85list {

	public static void main(String[] args) 
	{
		//set driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver=new ChromeDriver();
		//implicit time
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		//set url
		driver.get("https://www.gsmarena.com/");
		driver.findElement(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a")).click();
		List<WebElement> l1= driver.findElements(By.cssSelector(".makers>ul>li>a"));
		System.out.println("size="+l1.size());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
		}

	}

}
