package calendeHAndlling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class phptravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="March";
		String day="";
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.manage().window().maximize();
		
		cdriver.get("https://www.phptravels.net/");
		cdriver.findElement(By.cssSelector("input#checkin")).click();
		
	}
	//div.datepicker.dropdown-menu>div.datepicker-days>table.table-condensed>thead>tr>th:nth-child(3).next>i.icon.mdi.mdi-long-arrow-right
//div.datepicker.dropdown-menu>div>table.table-condensed>thead>tr>th:nth-child(3).next>i.icon.mdi.mdi-long-arrow-right
}
