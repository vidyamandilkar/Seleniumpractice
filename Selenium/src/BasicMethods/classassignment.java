package BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class classassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver sdriver=new ChromeDriver();
		sdriver.get("http:\\demo.actitime.com\\login.do");
		System.out.println("print current url of Actitome"+sdriver.getCurrentUrl());
		String Title1=sdriver.getTitle();
		System.out.println("Title of page="+Title1);
		System.out.println("length of title="+Title1.length());
		System.out.println("Title verificTION="+Title1.equals("google"));
		
		
		WebElement usernameInputfield=sdriver.findElement(By.id("username"));
		usernameInputfield.sendKeys("admin");
		
		WebElement passwardInputfield=sdriver.findElement(By.name("pwd"));
		passwardInputfield.sendKeys("manager");
		
		WebElement loginbtn=sdriver.findElement(By.id("loginButten"));
		loginbtn.click();
		sdriver.close();
		
		sdriver.close();
		
	}

}
