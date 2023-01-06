package DropdownList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https:\\demosite.executeautomation.com");
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		//identyfy web element
		WebElement drlist=driver.findElement(By.id("TitleId"));
		System.out.println("List is found");
		
		//create obj of select class and pass that list in that constructor
		Select s1=new Select(drlist);
		
		//op1-count options available in list
		List<WebElement> op=s1.getOptions();
		System.out.println("count of options="+op.size());
		
		//op2 print all options
		System.out.println("All options in list");
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i).getText());
		}
		
		//op3 get allready selected value
		String selectedVAlue=s1.getFirstSelectedOption().getText();
		System.out.println("selected value="+selectedVAlue);
		
		 //op-4select reqired value from llist
		 s1.selectByIndex(1);
		s1.selectByVisibleText("mr");
		
	}

}
