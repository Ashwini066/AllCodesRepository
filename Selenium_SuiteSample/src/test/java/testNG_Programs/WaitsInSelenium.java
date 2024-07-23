package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class WaitsInSelenium {
	WebDriver driver;
  @Test
  public void explicitWaitsInSelenium() {
	  WebElement inputForm= driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  //wait.until(ExpectedConditions.elementToBeClickable("By.xpath(\"//a[contains(text(),'Input Form')]\")"));
	  //wait.until(ExpectedConditions.elementToBeClickable(inputForm));
	 // wait.until(ExpectedConditions.elementToBeSelected(inputForm));
	  //wait.until(ExpectedConditions.presenceOfElementLocated(""));
	  inputForm.click();
  }
  
  public void FluentWaitsInSelenium() {
	  WebElement inputForm= driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
	  Wait<WebDriver> fluent = new FluentWait <WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).
			  pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	  fluent.until(ExpectedConditions.elementToBeClickable(inputForm));
	  inputForm.click();
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	 driver=new ChromeDriver();
	 driver.get("https://selenium.qabible.in/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
  }

  @AfterTest
  public void afterTest() {
  }

}
