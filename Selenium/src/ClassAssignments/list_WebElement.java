package ClassAssignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list_WebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//instance of driver
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.demoblaze.com");
		WebElement categery=driver.findElement(By.cssSelector(".list-group>a"));
		System.out.println("totalcount="+categery.getSize());
		//create expected result list
		List<String> ExpectedCat=new ArrayList<String>();
		ExpectedCat.add("catageries");
		ExpectedCat.add("Phone");
		ExpectedCat.add("Laptops");
		ExpectedCat.add("Monitor");
		//get one by one eelement from  list
//		for(int i=0;i<categery.getSize();i++)
//		{
//			WebElement cat=categery.get(i);
//			System.out.println("list"+cat.getText());
//			System.out.println("is display"+cat.isDisplayed());
//			System.out.println("is Enable"+cat.isEnable());
//			System.out.println("is display"+cat.getText().equals(ExpectedCat.get(i)));
//		}
////
	}

}
