package DropdownList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook11 
{//run

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		//get url 
		driver.get("https:\\facebook.com");
		
		//identyfy create account button
		driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		//Find dropdown of day
		WebElement drplist=driver.findElement(By.id("day"));
		
		
		//instance of select calss
		Select s1=new Select(drplist);
		s1.selectByVisibleText("12");
		//check it is multiple selector or not
		System.out.println("multi or not"+s1.isMultiple());
			
		//get all values in list
		List<WebElement> options=s1.getOptions();
		
		options.get(5);
	
		System.out.println("count="+options.size());
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println("options"+i+": "+options.get(i).getText());
//		}
		
		System.out.println("*******month*********");
	
		//Find dropdown of Month
		WebElement month=driver.findElement(By.id("month"));
		
		//instance of select calss
		Select s2=new Select(month);
		//s2.selectByVisibleText("Mar");
		s2.selectByValue("4");
		
		//check it is multiple selector or not
		System.out.println("multi or not"+s2.isMultiple());//false
			
		//get all values in list
		List<WebElement> options1=s2.getOptions();
		System.out.println("count="+options1.size());//12
//		for(int i=0;i<options1.size();i++)
//		{
//			System.out.println("options"+i+": "+options1.get(i).getText());
//		}
		System.out.println("*******year*********");
		
		//Find dropdown of year
				WebElement year=driver.findElement(By.id("year"));
				
				//instance of select calss
				Select s3=new Select(year);
				//s3.selectByVisibleText();
				
				//check it is multiple selector or not
				System.out.println("multi or not"+s3.isMultiple());//false
					
				//get all values in list
				List<WebElement> options2=s3.getOptions();
				System.out.println("count="+options2.size());//12
//				for(int i=0;i<options.size();i++)
//				{
//					System.out.println("options"+i+": "+options1.get(i).getText());
//				}
		//driver.close();  
		}
	}


