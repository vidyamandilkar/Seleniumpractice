package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Executeauto_Assignment4 {
//locator prograns
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		//System.getProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		FirefoxDriver sdriver=new FirefoxDriver();
		sdriver.get("http:\\demosite.executeautomation.com/Login.html");
		
		WebElement usernameInputfield=sdriver.findElement(By.name("UserName"));
		usernameInputfield.sendKeys("execution");
		
		WebElement passwardInputfield=sdriver.findElement(By.name("Password"));
		passwardInputfield.sendKeys("admin");
		
		WebElement loginbtn=sdriver.findElement(By.name("Login"));
		loginbtn.submit();
		loginbtn.click();
		
//		String Title1=sdriver.getTitle();
//		System.out.println("Title of page="+Title1);
//		System.out.println("length of title="+Title1.length());
//		
//		WebElement logoutbtn=sdriver.findElement(By.name("Login"));
//		
//		logoutbtn.click();
//		sdriver.close();
//		
	}

}
