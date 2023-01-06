package basicpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigergadgets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
				//identify addgadget buttin
				driver.findElement(By.cssSelector("button.btn.btn-default.addButton.dropdown-toggle")).click();
				List<WebElement> l1=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.widgetsList.pull-right>li"));
				System.out.println("size="+l1.size());
				//print list
				for(int i=0;i<l1.size();i++)
				{
					System.out.println(l1.get(i).getText());
				}
				//add index 2 gadget
				l1.get(2).click();
				//add index  3 gadget
				//l1.get(3).click();
				
				driver.close();
				
	}

}
