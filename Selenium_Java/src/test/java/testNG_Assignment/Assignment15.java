package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Assignment15 {
	WebDriver driver;

  @Test
  public void verifySimpleAlertBox() throws InterruptedException {
	  WebElement simpleClickMe= driver.findElement(By.id("alertBox"));
	  Thread.sleep(2000);
	  simpleClickMe.click();
	 driver.switchTo().alert().accept();
	  System.out.println("Simple Alert accepted");	  
  }
  
  @Test
  public void verifyConfirmationAlertBox() throws InterruptedException {
	   WebElement confirmationClickMe= driver.findElement(By.id("confirmBox"));
	 	Thread.sleep(1000);
	  confirmationClickMe.click();
	  driver.switchTo().alert().dismiss();
	  System.out.println("Confirmation Alert Accepted");
	  
  
  }
  
  
  @Test
  public void verifyPromptAlertBox() throws InterruptedException {
    Thread.sleep(1000);
	  WebElement promptClickMe= driver.findElement(By.xpath("//button[@id='promptBox']"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true)", promptClickMe);
	  promptClickMe.click();
	driver.switchTo().alert().sendKeys("Ramu");
	  driver.switchTo().alert().accept();
	  System.out.println("Prompt alert Accepted");
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver= new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/alertsdemo.html?m=1");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  }

  @AfterMethod
  public void afterMethod() {
	//driver.close();
  }

 
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Started Assignment 15");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Assignment 15 completed successfully");
  }

}
