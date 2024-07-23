package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotInSelenium1 {


	
		public void takeScreenshot(WebDriver driver,String name) throws IOException
		{
			String folder_path="C:\\Users\\premc\\OneDrive\\Desktop\\Workspace\\SeleniumPrep"+"\\Screenshot1\\";
			File file= new File(folder_path);
			if(!file.exists())
			{
			file.mkdirs();	
			}
			
			TakesScreenshot takescreeshot = (TakesScreenshot) driver;
			File screenshot_file= takescreeshot.getScreenshotAs(OutputType.FILE);
			
			String timestamp= new SimpleDateFormat("").format(new Date());
			String destinationpath=folder_path+name+timestamp+".png";
			
			File destination_file= new File(destinationpath);
			FileHandler.copy(screenshot_file, destination_file);
			
		}

	

}
