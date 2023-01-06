package fluentwait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class actitime_imp_wait

{
	public static void main(String[] args) {
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		//implicit ti
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.get("https:/demo.actitime.com/login.do");
		
		String pageTitle=cdriver.getTitle();
		System.out.println("Title Of page"+cdriver.getTitle());
		
		System.out.println("Length of  Of Title="+pageTitle.length());
		
		System.out.println("pagetitle validation="+pageTitle.equals(pageTitle));
		
		//System.out.println("page source code"+cdriver.getPageSource());
		String SourceCode=cdriver.getPageSource();
		System.out.println("Length of source code="+SourceCode.length());
	
		cdriver.findElement(By.id("username")).sendKeys("admin");
		cdriver.findElement(By.name("pwd")).sendKeys("manager");
		cdriver.findElement(By.id("loginButton")).click();
		//Eplicit wait
		
		//creatting object of WebDriver Wait
		WebDriverWait wait=new WebDriverWait(cdriver,30);
		//using until method we give exception
		wait.until(ExpectedConditions.titleContains("actiTime-enterTime-Track"));
		//display home page name
		System.out.println("homepage="+cdriver.getTitle());
		
		//find logout element and set key
		cdriver.findElement(By.id("logoutLink")).click();
		
		//clode driver
		cdriver.close();
		
	//	System.out.println("page is correct or not"+cdriver.getTitle().equals("Time Tracking Software"));
//		//System.out.println(cdriver.getPageSource());
//		System.out.println("get current url"+cdriver.getCurrentUrl());
//		cdriver.close();
//		
		

	}

}


