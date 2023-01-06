package MutipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
	public static void main(String arg[])
	{
		//set path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get url
		driver.get("https://demo.automationtesting.in/Register.html");
		//find multiple input elements using class name 
		//we can fill data first way havaingg simmiler loc
		List<WebElement> tlist=driver.findElements(By.className("form-control"));
		System.out.println("count of class"+tlist.size());
		tlist.get(1).sendKeys("aruush");
		tlist.get(2).sendKeys("Archit");
		tlist.get(3).sendKeys("NAsik");
		
		
		// or
		//we can fill data second way 
		
		
//		List<WebElement> classobject=driver.findElements(By.className("ng-pristine"));
//		System.out.println("count of class"+classobject.size());
//		classobject.get(1).sendKeys("vidya");
//		classobject.get(2).sendKeys("MAndilkar");
//		classobject.get(3).sendKeys("Puner");
//		classobject.get(4).sendKeys("abc@123");
		System.out.println("set ingormation");
	}

}
