package Assignment_orangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeHrmCreateNewEmployee {

	public static void main(String[] args) 
	{
		//set driver path
		//System.setProperty("webdriver.chrome.drivre",".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//create instance of driver
		//ChromeDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		//implcit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//maximize window
		driver.manage().window().maximize();
		
		//hit url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//identify UserName and sendkeys as admin
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123",Keys.ENTER);
		
		//identyfy PIM an click on It
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		//Identify Add Employee Menu
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		//Identyfy Employee name fiels and Fill Employee Name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Archit",Keys.TAB);
		
		//Identyfy Employee Middlename fiels and Fill Employee MiddleName
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Pradeep",Keys.TAB);
				
		//Identyfy Employee Lastname fiels and Fill Employee LastName
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mandilkar",Keys.TAB);
		
		//Identyfy Employee id
		//driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)")).click();
		System.out.println("clik in id");
		//driver.findElement(By.cssSelector("div.oxd-grid-2.orangehrm-full-width-grid>div>div>div:nth-child(2)")).clear();
//		System.out.println("id box clear");
		
		driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div>input")).sendKeys(Keys.chord(Keys.CONTROL,"a"),(Keys.chord(Keys.BACK_SPACE)));
		System.out.println("id find");
		//send  id value i.e 2022
		
		WebElement id=driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>div>input"));
		
		id.sendKeys("2022",Keys.ENTER);
		
		//Save the record
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		
		
		//clik on Pim
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		/**
		 
		driver.findElement(By.cssSelector("div.oxd-form-row>div>div:nth-child(2)")).click();
		System.out.println("click in text id box");
		
		
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.("div.oxd-form-row>div>div:nth-child(2)",""));
		
		
		driver.findElement(By.cssSelector("div.oxd-form-row>div>div:nth-child(2)")).sendKeys("2022");
		
		///////////////////////////////////////////////**/
		
		//search record with name
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Archit");
		
		//click on search
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		
		//find check box
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
		
		//find edit option
		driver.findElement(By.xpath("//*[@class='oxd-icon bi-pencil-fill']")).click();
		
		//identify job element n click on it
		driver.findElement(By.xpath("//a[text()='Job']")).click();
		
	
		//Identify job  list
		List <WebElement> jobList= driver.findElements(By.cssSelector("div.oxd-select-dropdown.--positon-bottom>div"));
		System.out.println("Size of job List"+jobList.size());
		jobList.get(5).click();
		
		
		
		
		
/**
		joblist.get(3).click();
		System.out.println("job selected");
/**		
		//identyfy list of jobtitle
		
		//div.oxd-form-row>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div
		
		//Identyfy Search button n Click on it
		//path for id=div:nth-child(2)>div>div:nth-child(2)>input
**/	
}

}
