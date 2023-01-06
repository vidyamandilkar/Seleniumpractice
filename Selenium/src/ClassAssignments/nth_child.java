package ClassAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nth_child 
{
	public static void main (String args[])
	{
	String driverPath=System.getProperty("user.dir")+"chromedriver.exe";
	//stp 1-set path of driver
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	
	//instance of driver
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http:\\www.demoblaze.com");
	WebElement categery=driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
	System.out.println(categery.isDisplayed());
	System.out.println(categery.isEnabled());
	System.out.println(categery.getText().equals("CATEGORIES"));
	
	WebElement phone=driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
	System.out.println(phone.isDisplayed());
	System.out.println(phone.isEnabled());
	System.out.println(phone.getText().equals("Phone"));
	
	WebElement laptop=driver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
	System.out.println(laptop.isDisplayed());
	System.out.println(laptop.isEnabled());
	System.out.println(laptop.getText().equals("Laptop"));
	
	
	}}