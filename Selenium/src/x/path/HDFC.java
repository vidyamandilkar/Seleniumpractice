package x.path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.nseindia.com");
		//WebElement l1=driver.findElement(By.xpath("//tr[td[a[text()='TCS']]]/td[4]"));
		//System.out.println("value="+l1.getText());
		
		//second way
		WebElement l2=driver.findElement(By.xpath("//tr[td[a[text()='SUNPHARMA']]]/td[4]"));
		System.out.println("value ofsunpharma="+l2.getText());
		
		//tr[td[a[text()='SUNPHARMA']]]/td[4]
		//tr[td[a[text()='TATAMOTORS']]]/td[4]
	}

}
