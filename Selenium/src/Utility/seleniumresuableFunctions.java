package Utility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class seleniumresuableFunctions 
{	
	 //global declaration of browser 
	public static WebDriver driver; 
	public static Actions action=null;
	//public static WebDriverWait wait;

 public WebDriver setUp (String browserName,String appurl)	
 {	
		
	 	 
	 if(browserName.equalsIgnoreCase("chrome"))
	 {
		 String ChromeExePath=System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe";
		 
		 //setting the executable path
		 System.setProperty("webdriver.chrome.driver",ChromeExePath);
		 
		 //creating instance of driver
		 
		driver=new ChromeDriver();
		 
	 }
	 if(browserName.equalsIgnoreCase("firefox"))
	 {
		 String firefoxExePath=System.getProperty("user.dir")+ "\\drivers\\geckodriver.exe";
		 
		 //setting the executable path
		 System.setProperty("webdriver.gecodriver.driver",firefoxExePath);
		 
		 //creating instance of driver
		 
		 driver=new FirefoxDriver();
	 }
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get(appurl);
	 action = new Actions(driver);
	 return driver;

 }
}


