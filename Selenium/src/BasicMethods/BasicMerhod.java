package BasicMethods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class BasicMerhod {

	public static void main(String[] args) {
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("http:\\demo.automationtesting.in/Register.html");
		System.out.println("Name Of page"+cdriver.getTitle());
		//System.out.println(cdriver.getPageSource());
		System.out.println("get current url"+cdriver.getCurrentUrl());
		cdriver.close();
		
		
	}

}
