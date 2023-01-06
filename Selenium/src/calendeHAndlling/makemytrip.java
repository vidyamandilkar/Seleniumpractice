package calendeHAndlling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makemytrip {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.manage().window().maximize();
		
		cdriver.get("https://www.makemytrip.com/");
		
		//selectcalender
		WebDriverWait wait=new WebDriverWait(cdriver,20);
		wait.until(ExpectedConditions.titleContains("NOSuchElementFound"));
		
		cdriver.findElement(By.id("input#departure")).click();
		//cdriver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>div.DayPicker-Body>*:nth-child(2)>*:nth-child(5)>div>p")).click();
		
		

	}

}
