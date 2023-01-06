package Mouseoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		String chrompath=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrompath);

		//instance of driver
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		//handle pop up usung escape
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		System.out.println("escape pop up");
		
		//refresh web page
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		System.out.println("page reffresh");
		
		//Identify menu list
		List<WebElement> menu=driver.findElements(By.cssSelector("div._37M3Pb>div>a"));
		System.out.println("size of menu"+menu.size());
		System.out.println("print all element of menu");
		Actions act=new Actions(driver);
/**		
		for(int i=0;i<menu.size();i++)
		{
			System.out.println(menu.get(i).getText());
		}
		//mouse hover on it
		
/**		
 //hover all menu
		for(int i=0;i<menu.size();i++)
		{
			//WebElement option=menu.get(i;)
			act.moveToElement(menu.get(i)).perform();
			Thread.sleep(1000);
			
		}
		System.out.println("moved on each element");
		
**/		
		//mouse hover using functio for 1 menu
		mouseHoverOverInTheElement( act ,menu.get(2));
		System.out.println("move on 1 menu is functon done");
		//mouse hover using functio for all menu
		mouseoverOnAll( act,menu);
		System.out.println("move on all menu is functon done");
		
		mouseHoverCord(act,menu.get(2),100,0);
		System.out.println("move on 2 menu is functon done using cord");
		
		rightClik(act,menu.get(3));
		System.out.println("right click done on menu 3");
	}
	
	
	//hover on one menu
	 static void mouseHoverOverInTheElement(Actions act, WebElement webElement) {
		act.moveToElement(webElement).perform();
		
	}
	//hover on all menu
	private static void mouseoverOnAll(Actions act,List<WebElement>menu1) throws InterruptedException
	{
		for(int i=0;i<menu1.size();i++)
		{
			//WebElement option=menu.get(i;)
			act.moveToElement(menu1.get(i)).perform();
			Thread.sleep(1000);
			
		}

	}
	//hover withs cord
	private static void mouseHoverCord(Actions a,WebElement element,int x,int y)
	{
		System.out.println("Menu="+element.getText());
		a.moveToElement(element,x,y).perform();;
	}
	
	//right click
	private static void rightClik(Actions a,WebElement element)
	{
	System.out.println("element name-"+element.getText());
		a.contextClick(element).build().perform();
	}
}
