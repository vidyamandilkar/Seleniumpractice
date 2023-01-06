package x.path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com");
		
		WebElement a1=driver.findElement(By.xpath("//div[div[h4[a[text()='Samsung galaxy s6']]]]"));
		//WebElement a1=driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']//following::h5[1]"));
		System.out.println("cost of mobile"+a1.getText());
		
		System.out.println("**************");
		//second way
		WebElement a2=driver.findElement(By.xpath("//div[div[h4[a[text()='Samsung galaxy s6']]]]/div/h5"));
		System.out.println("cost of mobile"+a2.getText());
		//new mobile
		System.out.println("**************");
		//div[div[h4[a[text()='Nexus 6']]]]//h5
		WebElement a3=driver.findElement(By.xpath("//div[div[h4[a[text()='Nexus 6']]]]//h5"));
		//WebElement a1=driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']//following::h5[1]"));
		System.out.println("cost of mobile"+a3.getText());
	}

}
