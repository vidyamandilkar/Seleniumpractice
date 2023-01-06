package Browser_Operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezon_Assignment {

	public static void main(String[] args) throws InterruptedException
	{
		//set path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create object
		ChromeDriver driver=new ChromeDriver();
		//implicit wiait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get url
		driver.get("http://www.Amezon.com");
		driver.manage().window().setSize(new Dimension(500,500));
		System.out.println("title of page="+driver.getTitle());
		//driver.findElement(By.linkText(" Electronics "));
//		driver.findElement(By.className("landscape-image "));
//		System.out.println("find electronics");
//		
//		Thread.sleep(1500);
		//System.out.println("validate title="+driver.getTitle());
		
		//find menu registry
		driver.findElement(By.className("nav_cs_mobiles")).click();
		System.out.println("mobile found");
		driver.close();
		

	}
	//nav-a
}
