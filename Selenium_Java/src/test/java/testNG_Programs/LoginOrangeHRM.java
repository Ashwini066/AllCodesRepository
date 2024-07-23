package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginOrangeHRM {
	WebDriver driver;
  @Test
  public void  verifyLoginButton() {
		WebElement usernameTextBox=driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("Admin");
		WebElement passwordTextBox=driver.findElement(By.name("password"));
		passwordTextBox.sendKeys("admin123");
		WebElement loginButton=driver.findElement(By.tagName("button"));
		loginButton.click();
  }
  @BeforeMethod
  public void beforeMethod() {
		driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
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
