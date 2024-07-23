package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment18 {
		WebDriver driver;
  @Test
  public void f() {
	  WebElement tooltipMessage=driver.findElement(By.xpath("(//h4[contains(text(),'Live')])[1]//parent::span//parent::a"));
	  Actions action = new Actions(driver);
	  action.moveToElement(tooltipMessage).build().perform();
	 String  actualMessage=tooltipMessage.getAttribute("title");
	 String expectedMessage="Live";
	 Assert.assertEquals(actualMessage, expectedMessage);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver= new ChromeDriver();
	  driver.get(" https://www.browserstack.com/");
	  driver.manage().window().maximize();
  }
	
  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
