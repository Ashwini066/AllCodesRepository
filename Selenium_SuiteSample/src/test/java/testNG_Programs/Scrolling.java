package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Scrolling {
	WebDriver driver;
  @Test
  public void verifyScrollingWebPage() {
		WebElement addToCartButton = driver.findElement(By.xpath("//a[contains(@onclick,'614')]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("arguments[0].scrollIntoView(true)",addToCartButton);  
		
		je.executeScript("arguments[0].click();", addToCartButton); // 
  }
  @BeforeMethod
  public void beforeMethod() {
	  	driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This program helps to scroll in the webpage");
  }
  

  @AfterSuite
  public void afterSuite() {
  System.out.println("Scrolling completed successfully");
  }
  

}
