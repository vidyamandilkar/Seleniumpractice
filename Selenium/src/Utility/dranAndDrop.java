package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dranAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		seleniumresuableFunctions s1=new seleniumresuableFunctions();
		WebDriver driver=s1.setUp("chrome","https://www.globalsqa.com/demo-site/draganddrop/");
		Actions act = new Actions(driver);
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		//src
		List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
		System.out.println(sourceElements.size());
		Thread.sleep(5000);
		//target**
		WebElement	target =driver.findElement(By.xpath("//*[@id='trash']"));
		
		
	
		//perform mouse action
		act.dragAndDrop(sourceElements.get(0), target).build().perform();
		
		
		
	}

}
