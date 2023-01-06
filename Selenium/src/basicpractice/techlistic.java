package basicpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set driver
				System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
				//create instance
				ChromeDriver driver=new ChromeDriver();
				//implicit time
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				//maximize window
				driver.manage().window().maximize();
				//set url
				driver.get("https://www.techlistic.com/");
				driver.findElement(By.linkText("div.overflowable-container.overflowable-3>div>*:nth-of-type(1)>ul>li>a")).click();
				
				driver.close();
	}

}
