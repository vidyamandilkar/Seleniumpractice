package Browser_Operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlist {

	public static void main(String[] args) 
	{
		//set driver path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//get url
		driver.get("https://www.techlistic.com/");
		String title=driver.getTitle();
		System.out.println("Title of page="+title);
		//set window size
		driver.manage().window().maximize();
		//find java element
//		driver.findElement(By.linkText("https://www.techlistic.com/p/java.html"));
//		System.out.println("locator is find");
//		System.out.println("validate title of page"+driver.getTitle().equals(""));
		//find seleniun
		driver.findElement(By.linkText("https://www.techlistic.com/p/selenium-tutorials.html")).click();
		System.out.println("find selenum element");
		driver.navigate().back();
		
		//find BDD element
		//driver.findElement(By.className("dropbtn"));
		
		

	}

}
