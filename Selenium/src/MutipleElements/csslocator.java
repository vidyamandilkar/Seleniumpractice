package MutipleElements;

import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator 
{

	public static void main(String[] args)
	{
		System.getProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}

}
