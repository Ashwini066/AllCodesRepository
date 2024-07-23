package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Assignment19 {
	WebDriver driver;
	
	
  @Test
  public void verifyRememberMeCheckBoxIsSelected () {
	  WebElement rememberMe= driver.findElement(By.id("remember"));
	  Assert.assertFalse(rememberMe.isSelected());  
  }
  
  @Test
  public void verifySuccessfulLogin () {
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin");
	  WebElement signInBtn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signInBtn.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  WebElement userNameAftLogin=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
	  String actualUserName= userNameAftLogin.getText();
	  //System.out.println(actualUserName);
	  String expectedUserName="Admin";
	  Assert.assertEquals(actualUserName, expectedUserName);
  }
  
  @Test
  public void verifyUnSuccessfulLogin () {
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("admin175 ");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin");
	  WebElement signInBtn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signInBtn.click();
	  WebElement invalidUser=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	  Assert.assertTrue(invalidUser.isDisplayed());
  }
  
  @Test
  public void verifyUnSuccessfulLoginUsingURL () {
	  WebElement username=driver.findElement(By.name("username"));
	  username.sendKeys("admin175 ");
	  WebElement password=driver.findElement(By.name("password"));
	  password.sendKeys("admin");
	  WebElement signInBtn=driver.findElement(By.xpath("//button[@type='submit']"));
	  signInBtn.click();
	  String actual_url=driver.getCurrentUrl();
	  String expected_url="https://groceryapp.uniqassosiates.com/admin";
	  Assert.assertNotEquals(actual_url,expected_url,"URL Mismatch");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
