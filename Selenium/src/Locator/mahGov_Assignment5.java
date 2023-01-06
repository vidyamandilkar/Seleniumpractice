package Locator;
import org.openqa.selenium.chrome.ChromeDriver;
public class mahGov_Assignment5
{

	public static void main(String atgs[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("http://msrtc.maharashtra.gov.in/");
		String url1=cdriver.getCurrentUrl();
		System.out.println("validate url="+url1.equals("http://msrtc.maharashtra.gov.in/"));
		String title1=cdriver.getTitle();
		;
		System.out.println("Titlre of page="+title1);
		System.out.println("length Titlre of page="+title1.length());
		String source1=cdriver.getPageSource();
		System.out.println("length od source code of page="+source1.length());
	}
}
