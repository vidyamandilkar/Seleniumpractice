package BasicMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8
{
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get(" https://www.amazon.in/ ");
		String url1=cdriver.getCurrentUrl();
		System.out.println("validate url="+url1.equals(" https://www.amazon.in/"));
		String title1=cdriver.getTitle();
		
		System.out.println("Titlre of page="+title1);
		System.out.println("length Titlre of page="+title1.length());
		
		String source1=cdriver.getPageSource();
		System.out.println("length od source code of page="+source1.length());
		
		
}}
