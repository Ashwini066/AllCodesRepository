package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FileUploadRobotClass {
	WebDriver driver;
  @Test
  public void verifyFileUpload() throws AWTException, InterruptedException {
	  WebElement chooseFile=driver.findElement(By.id("file-upload"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true)", chooseFile);
	  js.executeScript("arguments[0].click()",chooseFile);
	  Robot r=new Robot();
	  StringSelection filepath=new  StringSelection("C:\\Users\\premc\\Downloads\\Assignment.docx");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	  Thread.sleep(10);
	  r.keyPress(KeyEvent.VK_V);
	  
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  Thread.sleep(10);
	  r.keyRelease(KeyEvent.VK_V);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  Thread.sleep(10);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	  System.out.println("File uploaded sucessfully");
	  
  }
	  @Test
	  public void uploadUsingSendKeys()
	  {
		  WebElement chooseFile=driver.findElement(By.id("file-upload"));
		  chooseFile.sendKeys("C:\\Users\\premc\\Downloads\\Assignment.docx");
		  System.out.println("File Uploaded sucessfully");
	  }
	  


	 
	  
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
