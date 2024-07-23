package chatgpt_Assessment1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assessment1 {
	
	WebDriver driver;
  @Test
  public void question1() {
	  String current_title= driver.getTitle();
	  System.out.println(current_title);
	  driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
	  String expected_url="https://www.selenium.dev/documentation/webdriver";
	  String actual_url= driver.getCurrentUrl();
	  Assert.assertEquals(actual_url, expected_url);
	  
  }
  
  @Test
  public void question2() {
	  driver.navigate().to("https://demoqa.com/automation-practice-form");
	  
	  
	  
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("https://www.selenium.dev");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() {
  }

}
