package Mouseoperations;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class dragAndDrop 
{

	public static void main(String[] args) throws InterruptedException	
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create instance
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//set url
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		
		// to enter required application URL use get() of WebDriver interface
				driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
				// frame handling
//				WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
//				driver.switchTo().frame(frame);

				// create an instance of Actions class by passing required browser instance to its constructor
				Actions act = new Actions(driver);
				//first identify source and target elements for drag and drop
				List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
				WebElement target = driver.findElement(By.id("trash"));
				System.out.println("trash find");
				//perform dragAndDrop operation
				act.dragAndDrop(sourceElements.get(0), target).build().perform();
				Thread.sleep(1000);
				act.dragAndDrop(sourceElements.get(1), target).build().perform();
				Thread.sleep(1000);
				act.dragAndDrop(sourceElements.get(2), target).build().perform();
				
//				for(int i=0;i<sourceElements.size();i++) {
//					performDranAndDrop(act, sourceElements.get(i), target);
//					Thread.sleep(1000);
				}
			
		
	
		
}

		
		
		
	
		
/**		
		
		//create instanceof action class
		Actions act=new Actions(driver);

//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id='gallery']/li")));
		
		//identify source
		List<WebElement> src = driver.findElements(By.cssSelector("ul#gallery>li"));
		System.out.println("size="+src.size());
		//WebElement target = driver.findElement(By.id("trash"));
		WebElement target = driver.findElement(By.id("trash"));
				
		//drag element fron src to trash
		act.dragAndDrop(src.get(0), target).build().perform();
		System.out.println("1element move");
	//	performDranAndDrop(act,src.get(3),target);
		
		

	}}
	//static void performDranAndDrop(Actions act,WebElement src,WebElement target) {
		//act.dragAndDrop(src, target).build().perform();**/
	


