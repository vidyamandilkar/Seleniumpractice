package Browser_Operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerAssignment {

	public static void main(String[] args) 
	{
	
		//set path
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver= new ChromeDriver();
		//ge t url"
		driver.get("http://demo.vtiger.com/vtigercrm/index.php");
		//imlicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//get tilte
		System.out.println("Title of page="+driver.getTitle());
		//find username field
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
		//find password field
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test@123");
		//find login
		driver.findElement(By.className("buttonBlue")).click();
		
		//find Add element
		WebElement addfield=driver.findElement(By.tagName("addButton  "));
		System.out.println("add element visible ornot="+addfield.isDisplayed());
		System.out.println("add element Enable ornot="+addfield.isEnabled());
		System.out.println("add element selected ornot="+addfield.isSelected());//false
		addfield.click();
		System.out.println("after add element selected ornot="+addfield.isSelected());//tru
			
//		addfield.click();
//		driver.close();

	}

}
