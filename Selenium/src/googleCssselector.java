import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleCssselector {

	public static void main(String[] args) 
	{
		//set path
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				//create instance
				ChromeDriver driver= new ChromeDriver();
				//ge t url"
				driver.get("http:\\www.google.com");
				//imlicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.name("q")).sendKeys("manual inter view questions");
				List<WebElement> sugglist=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
			System.out.println("suggestion count="+sugglist.size());
			for(int i=0;i<sugglist.size();i++)
			{
				System.out.println("list is"+sugglist.get(i).getText());
			}
			driver.close();
	}

}
