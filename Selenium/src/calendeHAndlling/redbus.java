package calendeHAndlling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.manage().window().maximize();
		
		cdriver.get("https://www.redbus.in/");
		

		
		cdriver.findElement(By.id("src")).sendKeys("Pune");
		cdriver.findElement(By.className("selected")).click();
		
		cdriver.findElement(By.id("dest")).sendKeys("Mumbai");
		cdriver.findElement(By.className("selected")).click();
		
		cdriver.findElement(By.id("onward_cal")).click();
		cdriver.findElement(By.cssSelector(".next>button")).click();
		cdriver.findElement(By.cssSelector("tr:nth-child(5)>td:nth-child(5)")).click();
		
		//click on search
		cdriver.findElement(By.id("search_btn")).click();
		//cdriver.findElement(By.id("")).click();
			
		
		
		//click on before 6 am 
		cdriver.findElement(By.cssSelector("ul.dept-time.dt-time-filter>li:nth-child(1)>label.custom-checkbox")).click();
		
		//identyfy nonac
		cdriver.findElement(By.cssSelector("ul.list-chkbox>li:nth-child(3)>input")).click();
		
		//select all bus //ul.bus-items>div
//		List<WebElement> listOfBus=cdriver.findElements(By.cssSelector("ul.bus-items>div"));
//		System.out.println("Total Bus count="+listOfBus);
		//cdriver.close();
	}

}//ul.dept-time.dt-time-filter>li:nth-child(1)>label.custom-checkbox
