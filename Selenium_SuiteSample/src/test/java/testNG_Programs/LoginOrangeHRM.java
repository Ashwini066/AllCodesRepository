package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.ScreenShotInSelenium;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginOrangeHRM {
	WebDriver driver;
	WebDriverWait waits;
	ScreenShotInSelenium screenshot;
  @Test
  public void  verifyUnsucessfulLoginButton() {
		WebElement usernameTextBox=driver.findElement(By.name("username"));
		waits=new WebDriverWait(driver, Duration.ofSeconds(2));
		waits.until(ExpectedConditions.visibilityOf(usernameTextBox));
		usernameTextBox.sendKeys("Adminabc");
		WebElement passwordTextBox=driver.findElement(By.name("password"));
		waits.until(ExpectedConditions.elementToBeSelected(passwordTextBox));
		passwordTextBox.sendKeys("admin123");
		WebElement loginButton=driver.findElement(By.tagName("button"));
		waits.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		String actual_url= driver.getCurrentUrl();
		String expected_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(expected_url, actual_url);
		soft.assertAll();
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
		driver= new ChromeDriver();
		screenshot= new ScreenShotInSelenium();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
      if (result.getStatus() == ITestResult.FAILURE) {
          screenshot.takeScreenshot(driver, result.getName());
	  driver.quit();
  }
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Login into Orange HRM site");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Logged in successfully");
  }

}
