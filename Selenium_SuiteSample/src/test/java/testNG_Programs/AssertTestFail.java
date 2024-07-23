package testNG_Programs;

import org.testng.annotations.Test;

import Utility.ScreenShotInSelenium;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class AssertTestFail {
	
	WebDriver driver;
	ScreenShotInSelenium screenshot;
  @Test
  public void verifyExactURLOpensWhileHittingTheURL() {
	  String actual_Url= driver.getCurrentUrl();
	  //Hard Assert//
	  String expected_Url="http://selenium.qabible.in/";
	  Assert.assertEquals(actual_Url, expected_Url, "Url is Incorrect ");
	  //System.out.println("Message not displayed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  screenshot =new ScreenShotInSelenium();
	  driver.get("http://selenium.qabible.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
      if (result.getStatus() == ITestResult.FAILURE) {
          screenshot.takeScreenshot(driver, result.getName());
      }

}
}
