package validations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automation_registration_validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		//implicit wait
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.manage().window().maximize();
		
		//Explicit wait
	//	WebDriverWait wait=new WebDriverWait(cdriver,100);
		//wait.until(ExpectedConditions.textToBe(By.cssSelector("div.col-md-4.col-xs-4.col-sm-4>input.class"), "first name not find"));
		
		
		cdriver.get("https://demo.automationtesting.in/Register.html");
	
		WebDriverWait wait1=new WebDriverWait(cdriver,30);
		wait1.until(ExpectedConditions.textToBe(By.cssSelector("div.col-md-4.col-xs-4.col-sm-4>input.class"), "first name not find"));
		
		//identify firstname field
		WebElement firstName=cdriver.findElement(By.cssSelector("div.col-md-4.col-xs-4.col-sm-4>input[placeholder='First Name']"));
		System.out.println("find first name fiedl");
		/**
		 validate position of first name
		 */
		//for that identyfy positio in fst name
		Point firstNameposition=firstName.getLocation();
		
		//find x n y cordinates of fst name
		int fst_x_cord=firstNameposition.getX();
		int fst_y__cord=firstNameposition.getY();
		
		System.out.println("First Name x-cord="+fst_x_cord);
		System.out.println("First Name y-cord="+fst_y__cord);
		
		WebDriverWait wait11=new WebDriverWait(cdriver,30);
		wait1.until(ExpectedConditions.textToBe(By.cssSelector("input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-touched"), "Last name not find"));
		
		
		
		//identyfy  last name Element
		WebElement lastName=cdriver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-touched"));
		System.out.println("find last name element");
		
		
		/**
		 validate position of last name
		 */
		//for that identyfy positio of last name
		Point lastNameposition=lastName.getLocation();
		
		//find x n y cordinates of last name
		int last_x_cord=lastNameposition.getX();
		int last_y__cord=lastNameposition.getY();
		
		System.out.println("Last Name x-cord="+last_x_cord);
		System.out.println("Last Name y-cord="+last_y__cord);
		
		//check position of first name n last name on x-axis
		System.out.println(" is first name and last name on x axis="+(fst_x_cord<last_x_cord));
		
		
//		WebDriverWait wait2=new WebDriverWait(cdriver,10000);
//		wait2.until(ExpectedConditions.textToBe(By.cssSelector("textarea.ng-pristine"), "Address not find"));
//	
//		
//		//identyy addres field
//		WebElement address=cdriver.findElement(By.cssSelector("textarea.ng-pristine"));
//		/**
//		 * validate area field on y axis
//		 */
//		
//		org.openqa.selenium.Point addressLocation=address.getLocation();
//		
//		//find co-ordinates of Address field
//		int Area_x_cord=addressLocation.getX();
//		int Area_y_cord=addressLocation.getY();
//		
//		System.out.println(" Area x-cord="+Area_x_cord);
//		System.out.println("Area y-cord="+Area_y_cord);
//		
//		
	}
	
}
