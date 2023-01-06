package screenShots;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.*;

public class shot1 {

	public static void main(String[] args) throws IOException 
	{
		seleniumresuableFunctions s1=new seleniumresuableFunctions();
		WebDriver driver=s1.setUp("chrome", "http:\\www.google.com");
		//downcastinh
		TakesScreenshot ts=(TakesScreenshot)driver;
		//get screen shot using getScreenShotAs()of TakesScreenShots interface
		File File=ts.getScreenshotAs(OutputType.FILE);
		
		//store screen shot on required location
		FileUtils.copyFile(File,new File(".\\screenshots\\google.jpg"));
	}

}
