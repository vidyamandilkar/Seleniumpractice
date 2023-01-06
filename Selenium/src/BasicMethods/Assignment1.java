package BasicMethods;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Assignment1 {

	public static void main(String[] args) {
		//set the driver executable path using System.setproperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("http:\\actitime.com");
		System.out.println("Title Of page"+cdriver.getTitle());
		String pageTitle=cdriver.getTitle();
		System.out.println("Length of  Of Title="+pageTitle.length());
		System.out.println("pagetitle validation="+pageTitle.equals(pageTitle));
		
		//System.out.println("page source code"+cdriver.getPageSource());
		String SourceCode=cdriver.getPageSource();
		System.out.println("Length of source code="+SourceCode.length());
	
		
		cdriver.close();
	//	System.out.println("page is correct or not"+cdriver.getTitle().equals("Time Tracking Software"));
//		//System.out.println(cdriver.getPageSource());
//		System.out.println("get current url"+cdriver.getCurrentUrl());
//		cdriver.close();
//		
		

	}

}
