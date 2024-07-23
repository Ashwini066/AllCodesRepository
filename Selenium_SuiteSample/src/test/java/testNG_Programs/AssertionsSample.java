package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.ScreenShotInSelenium;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AssertionsSample {
	WebDriver driver;
	ScreenShotInSelenium screenshot;
  @Test(priority = 1)
  public void verifyExactURLOpensWhileHittingTheURL() {
	  String actual_Url= driver.getCurrentUrl();
	  //Hard Assert//
	  String expected_Url="http://selenium.qabible.in/";
	  Assert.assertEquals(actual_Url, expected_Url, "Url is Incorrect ");
	  //System.out.println("Message not displayed");
  }
  
  @Test
  public void verifyExactURLOpensWhileHittingTheURLSoftAssert() {
	  
	  String actual_Url= driver.getCurrentUrl();
	  String expected_Url="https://selenium.qabible.in/";
	  SoftAssert soft= new SoftAssert();
	  soft.assertEquals(actual_Url, expected_Url, "URL Mismatch");
	  soft.assertAll();
	 
	  //System.out.println("Message not displayed");
  }
  
  @Test
  public void verifyMessageIsDisplayed() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  WebElement messageTextBox= driver.findElement(By.id("single-input-field"));
	  String expected_message="Your Message : Hello";
	  messageTextBox.sendKeys("Hello");
	  WebElement showMessageBtn= driver.findElement(By.id("button-one"));
	  showMessageBtn.click();
	  WebElement messagePrinted= driver.findElement(By.id("message-one"));
	  String actual_message=messagePrinted.getText();
	  //Assert.assertEquals(actual_message, expected_message);
	  Assert.assertTrue(actual_message.contains("Hello"));
	  
	  
  }
 
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("http://selenium.qabible.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  //driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
      if (result.getStatus() == ITestResult.FAILURE) {
          screenshot.takeScreenshot(driver, result.getName());
 
      }
  }

}


//alwaysRun    ---- when you always want to run the test
//enabled=false ---- when you dont want to run that test
