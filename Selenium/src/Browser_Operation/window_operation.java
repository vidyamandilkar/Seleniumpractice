package Browser_Operation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_operation {

	public static void main(String[] args) {
		//run
				// setting of web driver exeutable path
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				ChromeDriver cdriver=new ChromeDriver();//instance of driver
				
				//implict wait
				cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				//put up url
				cdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				String url1=cdriver.getCurrentUrl();//store url in url1
				
				//validate url using equals()
				System.out.println("validate url="+url1.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
				
				String title1=cdriver.getTitle();//storring Tiltel in title1 varirable of type String
				
				System.out.println("Titlre of page="+title1);//print page title
				System.out.println("length Titlre of page="+title1.length());//length of title
				
				String source1=cdriver.getPageSource();
				System.out.println("length od source code of page="+source1.length());
				
								
//				WebElement usernameInputfield=cdriver.findElement(By.name("username"));
//				usernameInputfield.sendKeys("Admin");
		//if no long element in use then no need to to create variable
				//find element and set value of element usernmae
				cdriver.findElement(By.name("username")).sendKeys("Admin");
				
//				WebElement passwardInputfield=cdriver.findElement(By.name("password"));
//				passwardInputfield.sendKeys("admin123");
				
				//find element and set value of element password
				cdriver.findElement(By.name("password")).sendKeys("admin123");
				
				//cdriver.findElement(By.tagName("button")).click();
				//or
				// can also use class name( absd sdsd sdsd) beteen two space there is a class name
				
				//find element and set value of element login
				cdriver.findElement(By.className("oxd-button")).click();
				System.out.println("login success");
				//maxinze window size aftera log in
				cdriver.manage().window().maximize();
				//set window size
				cdriver.manage().window().setSize(new Dimension(500,500));
				//maximize window
				cdriver.manage().window().maximize();
				//nevigate to forward
				cdriver.navigate().forward();
				cdriver.navigate().back();
				//nevigate to other website
				cdriver.navigate().to("http://www.google.com");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
				//log  out 
				//cdriver.findElement(By.linkText("<a href=\"/web/index.php/auth/logout\" role=\"menuitem\" class=\"oxd-userdropdown-link\">Logout</a>")).click();
				cdriver.close();
				
				
	}

}
