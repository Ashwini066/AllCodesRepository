package Assignment;

import org.testng.annotations.Test;

import Utility.ScreenShotInSelenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Assignment21 {
	WebDriver driver;
	WebDriverWait waits;
	ScreenShotInSelenium screenshot;
	
	
	  @Test(priority = 2)
  @Parameters({"val1"})
  
  public void verifySearchOfFruitOranges(String searchval) {
		  
	  WebElement searchtextbox= driver.findElement(By.id("APjFqb"));
	  searchtextbox.sendKeys(searchval);
	  Actions action = new Actions(driver);
	  waits = new WebDriverWait(driver,Duration.ofMillis(5));
	  action.keyDown(Keys.ENTER).build().perform();

	  String wrong_expected_value="Fruit Apples";
	  String expected_value="Fruit Oranges";
	  String actual_value = driver.findElement(By.id("APjFqb")).getAttribute("value");
	  Assert.assertEquals(actual_value, expected_value);
	  //Assert.assertEquals(actual_value, wrong_expected_value);
	  
	  }
  
 
  @Test(priority = 1)
  @Parameters({"val2"})
  public void verifySearchOfFruitApple(String searchval) {
	  WebElement searchtextbox= driver.findElement(By.id("APjFqb"));
	  searchtextbox.sendKeys(searchval);
	  WebElement searchbtn= driver.findElement(By.name("btnK"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true)", searchbtn);
	  waits= new WebDriverWait(driver,Duration.ofMillis(5));
	  js.executeScript("arguments[0].click()", searchbtn);
	  String expected_value="apples";
	  String actual_value = driver.findElement(By.id("APjFqb")).getAttribute("value");
	  Assert.assertEquals(actual_value, expected_value);
	  
	  
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  screenshot= new ScreenShotInSelenium();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  screenshot.takeScreenshot(driver, result.getName());  
	  }
	  
	  driver.quit();
  }

}
