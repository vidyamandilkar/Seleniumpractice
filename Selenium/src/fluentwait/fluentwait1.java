package fluentwait;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait1 {

	

	public static void main(String[] args) 
	{
		//set webdriver esecutable path
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create instance if web driver
		ChromeDriver driver=new ChromeDriver();
		
		//Implicite wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Enter requred url
		driver.get("https://demo.actitime.com/login.do");
		
		//find locater of username and setkey
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//find locator for password and set key
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//log in button
		driver.findElement(By.id("loginButton")).click();
		
		//create an instance of flient wait class with time outpolling time(retry) and expression t
		//to be ignored
		
		FluentWait wait=new FluentWait(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5))//retrive
		.ignoring(NoSuchElementException.class);//ignore exeption within 20 sec after 20 sec it gives error
		
		//implment condition for wait,polling works like 5,10,15,20,25,30
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		driver.findElement(By.className("logout")).click();
		//cls webdriver
		driver.close();
	}

	
	}


