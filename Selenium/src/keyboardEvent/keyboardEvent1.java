package keyboardEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardEvent1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstName=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
		firstName.sendKeys("vidya",Keys.TAB);
		
		WebElement LastName=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		
		LastName.sendKeys("Mandilkar",Keys.TAB);
		
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		
		address.sendKeys("Pune",Keys.TAB);
		
		//email
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		
		email.sendKeys("abc@123",Keys.TAB);
		
		//phone

		WebElement phone=driver.findElement(By.xpath("//input[@type='tel']"));
		
		phone.sendKeys("353453543",Keys.TAB);
		
		
		//gender
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		//hobbies
	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	WebElement check=driver.findElement(By.xpath("//input[@id='checkbox3']"));
	
	
		//List<Webdriver> l1=driver.f
 		//driver.findElement(By.xpath("//*[contains(text()='Hockey'))]")).click();

	}
	//label[text()='Movies ']
}
