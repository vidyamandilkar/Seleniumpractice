package cssselector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vTigerAddWdgets {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver= new ChromeDriver();
		//ge t url"
		driver.get("http://demo.vtiger.com/vtigercrm/index.php");
		//imlicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("buttonBlue")).click();//on login butoon
		driver.findElement(By.className("addButton")).click();//on addwdgets button
		System.out.println("reach on add wdgres");
		
		List<WebElement> l1=driver.findElements(By.cssSelector(".dropdown-menu-right.widgetsList.pull-right>li>a"));
		System.out.println("count of element="+l1.size());
		System.out.println("print");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getAttribute("innerHTML"));
		}
		l1.get(6).click();
		driver.findElement(By.cssSelector(".fa.fa-remove")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
			driver.findElement(By.className("btn confirm-box-ok confirm-box-btn-pad btn-primary")).click();
		//l1.get(2).click();
		System.out.println("you clicl on 5 total revent rd opton");

	}
	
}
//btn confirm-box-ok confirm-box-btn-pad btn-primary