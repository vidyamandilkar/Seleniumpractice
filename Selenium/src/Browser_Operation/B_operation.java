package Browser_Operation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class B_operation {
//runable program
	public static void main(String[] args)
	{
		// set path of driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//create object
		ChromeDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//get ural
		driver.get("https://demo.automationtesting.in/Register.html");
		//get title
		String Title1=driver.getTitle();
		System.out.println("Length of title"+Title1.length());
		
		//Find Element First name
		System.out.println("hello");
		WebElement address=driver.findElement(By.className("form-control"));
		System.out.println("Addressfiela found");
		

		System.out.println("Address is displayed="+address.isDisplayed());
//		/*operation perform on First name element
//		 * 1.visible=isDisplayed()
//		 * 2.Editable=isEnable
//		 * 3.Default value="First name"=getAttribute(String Attribute name)
//		 */
		System.out.println("Address is visible or not="+address.isDisplayed());//true
		System.out.println("Address is Edible or not="+address.isEnabled());//true
		//we store value of attribute i.e placeholder in firstName value
		//String AddressisValue=address.getAttribute("placeholder");
		//validate place holder name with FirstName
//		System.out.println("validation of default value="+firstnameValue.equals("FirstName"));
//		
//		//find  Radio Button
		WebElement maleRadio=driver.findElement(By.name("radiooptions"));
//		/* Operation on radio button
//		 * Visible
//		 functional
//		by default not selected
//		 select and verify is selected or not
//		 */
		System.out.println("MaleRAdioButton visible or not="+maleRadio.isDisplayed());
		System.out.println("MaleRAdioButton Enable or not="+maleRadio.isEnabled());		System.out.println("MaleRAdioButton selected or not="+maleRadio.isSelected());
		
		System.out.println("MaleRAdioButton Enable or not="+maleRadio.isSelected());
		maleRadio.click();
		System.out.println("MaleRAdioButton after selection="+maleRadio.isSelected());
		//Find Submit button
		WebElement subButton=driver.findElement(By.id("submitbtn"));
		System.out.println("submit button cisible or not="+subButton.isDisplayed());		System.out.println("submit Enable or not="+subButton.isEnabled());
		String atualbutton=subButton.getText().trim();
		System.out.println("validation on text of submitbutton"+atualbutton.equals("submit"));
		driver.close();
		}

}
