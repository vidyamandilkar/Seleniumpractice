package validations;

import java.awt.Point;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import 	org.openqa.selenium.Point.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class errormsg 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.manage().window().maximize();
		
		cdriver.get("https://demo.actitime.com/login.do");
		//cdriver.findElement(By.cssSelector("#inProgressText")).click();
		cdriver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(cdriver,30);
		wait.until(ExpectedConditions.textToBe(By.cssSelector("#ServerSideErrorMessage"), "Username or Password is invalid. Please try again."));		//find error msg
		WebElement errMsg=cdriver.findElement(By.cssSelector("#ServerSideErrorMessage"));
		System.out.println("eeroe msg found");
		/**validations
		 *msg color
		 */
		
		String errormsginrgba=errMsg.getCssValue("color");
		String errfontSize=errMsg.getCssValue("font-size");
		System.out.println("error ms color"+errormsginrgba);
		System.out.println("Font size"+errfontSize);
		//postion of error msg validation for that
		
		//identyfy position of userid for that 
		WebElement userName=cdriver.findElement(By.cssSelector("input#username"));
		
		//to find postion of error msg find x,y cord od username fot that
		//get location of error msg
		org.openqa.selenium.Point error_location=errMsg.getLocation();
		//now get x n y cord of errormsg
		int errmsg_x_cord=error_location.getX();
		int errmsg_y_cord=error_location.getY();
		
		System.out.println("error msg x-cord="+errmsg_x_cord);
		System.out.println("error msg y-cord="+errmsg_y_cord);
		
		//find cordinates for udername
		org.openqa.selenium.Point userNameLocation=userName.getLocation();
		int userName_x_cord=userNameLocation.getX();
		int userName_y_cord=userNameLocation.getY();
		
		System.out.println("Username x-cord="+userName_x_cord);
		System.out.println("Username y-cord="+userName_y_cord);
		
		System.out.println("postion of error msg is above username or not="+(errmsg_y_cord<userName_y_cord));
		cdriver.close();
}
}
