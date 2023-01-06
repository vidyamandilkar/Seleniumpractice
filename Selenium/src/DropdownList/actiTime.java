package DropdownList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			
			ChromeDriver cdriver=new ChromeDriver();
			
			cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			cdriver.manage().window().maximize();
			
			cdriver.get("https://demo.actitime.com/login.do");
			cdriver.findElement(By.id("username")).sendKeys("admin");
			cdriver.findElement(By.name("pwd")).sendKeys("manager");
			cdriver.findElement(By.id("loginButton")).click();
			
			//identyfy task and click on it
			cdriver.findElement(By.cssSelector(".navItem.preventPanelsHiding.navCell.relative.notSelected")).click();
			
			//identyfy addnew button and click in it
			cdriver.findElement(By.cssSelector(".title.ellipsis")).click();//
			
			//identify new task option
			cdriver.findElement(By.cssSelector(".item.createNewTasks")).click();
		
			//identify project
//			cdriver.findElement(By.cssSelector(".projectselector .SelectedItem")).click();
//			List<WebElement> projectList=cdriver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
//			System.out.println("size of projectlist="+projectList.size());
//			projectList.get(1).click();
			
			//creating task
			cdriver.findElement(By.cssSelector(".nameCell.first>.inputFieldWithPlaceholder")).sendKeys("testing");
			//click on deadline button
			cdriver.findElement(By.cssSelector(".x-btn-text")).click();
			//click on right button of clender
			cdriver.findElement(By.cssSelector("a[title='Next Month (Control+Right)']")).click();
			//select date from calender
			cdriver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(3)>td:nth-of-type(4)>a>em>span")).click();

			//identift select task
			//cdriver.findElement(By.className(".taskTableContainer .value.ellipsis")).click();
			//identify list
		// cdriver.findElements(By.cssSelector(".taskTableContainer .typeOfWorkList>div>div")).get(4).click();
		 cdriver.findElement(By.cssSelector(".basicLightboxFooter .components_button_label")).click();
			
			
			
			
			
			
			
			
			//creatting list of add new
			//List<WebElement> l1=cdriver.findElements(By.cssSelector(".dropdownContainer.addNewMenu>div"));//list
			
			// print list of elements in new addbutton
			//System.out.println("size="+l1.size());//4
				//go on task
			
			//l1.get(2).click();
			//System.out.println("click on new task");
			
			//add testing task
			//textbox
			//List<WebElement> l2=cdriver.findElements(By.cssSelector(".inputFieldWithPlaceholder"));
			//System.out.println("count of test box="+l2.size());//15
			//l2.get(1).sendKeys("testing");
			
			
			//click on deadline button
			//cdriver.findElement(By.cssSelector("#ext-gen109")).click();
			//set dead line
			//cdriver.findElement(By.cssSelector("#ext-gen204>table>tbody>tr>td>a#ext-gen210"));
			
			
			
			//cdriver.close();
				
	}
	
}
//