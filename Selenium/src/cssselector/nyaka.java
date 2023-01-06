package cssselector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nyaka {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.nykaafashion.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> sugglist=driver.findElements(By.cssSelector(".css-101e0cy>div>div>div.disable-scrollbars.css-1krjcs0>div"));
		
		System.out.println("suggestion count="+sugglist.size());
//		for(int j=0;j<sugglist.size();j++)
//		{
//			System.out.println(sugglist.get(j).getAttribute("innerHTML"));
//		}

	}

}
