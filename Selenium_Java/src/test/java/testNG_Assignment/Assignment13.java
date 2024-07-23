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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Assignment13 {
	WebDriver driver;

  
  @Test
  public void enterDetailsFormSubmit() {
	  WebElement first_name=driver.findElement(By.id("validationCustom01"));
	  first_name.sendKeys("Test");
	  WebElement last_name=driver.findElement(By.id("validationCustom02"));
	  last_name.sendKeys("Test");
	  WebElement userName=driver.findElement(By.id("validationCustomUsername"));
	  userName.sendKeys("Test");
	  WebElement city=driver.findElement(By.id("validationCustom03"));
	  city.sendKeys("Test");
	  WebElement state=driver.findElement(By.id("validationCustom04"));
	  state.sendKeys("Test");
	  WebElement zipCode=driver.findElement(By.id("validationCustom05"));
	  zipCode.sendKeys("Test");
	  WebElement termsAndConditionCheckBox=driver.findElement(By.id("invalidCheck"));
	  termsAndConditionCheckBox.click();
	  WebElement submitFormBtn=driver.findElement(By.xpath("//button[text()='Submit form']"));
	  submitFormBtn.click();
	  WebElement consoleMsg=driver.findElement(By.xpath("//div[@id='message-one']"));
	  System.out.println("Console Message is : "+consoleMsg.getText());
	  
  }
  
  @BeforeTest
  public void beforTest() {
	  driver= new ChromeDriver();
	  driver.get("http://selenium.qabible.in");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  

  
  @BeforeMethod
  public void beforeMethod() {
	
	  WebElement inputFormTab= driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
	  inputFormTab.click();	
	  WebElement formSubmitTab= driver.findElement(By.xpath("//a[text()='Form Submit']"));
	  JavascriptExecutor js= (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true)", formSubmitTab);
	  formSubmitTab.click();	
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Starting Assignment 1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Assignment 1 completed successfully");
  }

}
