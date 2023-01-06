package x.path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartSansung {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Enter url
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		
		//Identyfy Samsung Galaxy f13
		WebElement a1=driver.findElement(By.xpath("//div[div[a[@title='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)' and @class='s1Q9rs']]]//div/div/div[1]"));
		System.out.println("Prise="+a1.getText());
		
		//html/body/div/div[1]/div[3]/div[3]/div/div[2]/div//div[4]/div/div/div/div/a
		System.out.println("*******");
		WebElement a2=driver.findElement(By.xpath("//html/body/div/div[1]/div[3]/div[3]/div/div[2]/div//div[4]/div/div/div/div/a"));
		System.out.println("Prise of mobile"+a2.getText());
		
		driver.close();
	}
}