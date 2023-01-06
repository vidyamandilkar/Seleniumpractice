package cssselector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsamarenaCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//create instance
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		//imlicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> sugglist=driver.findElements(By.cssSelector("#body>aside>div.brandmenu-v2.light.l-box.clearfix>ul>li"));
		System.out.println("suggestion count="+sugglist.size());
		for(int i=0;i<sugglist.size();i++)
		{
			System.out.println(sugglist.get(i).getText());
		}
		sugglist.get(1).click();
		System.out.println("click");

	}

}
