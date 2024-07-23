package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AlertHandling {
	WebDriver driver;
  @Test
  public void verifySimpleAlert() {
		WebElement clickMe1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe1.click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
  }
  
  @Test
  public void verifyConfirmationAlert() {
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe2.click();
		driver.switchTo().alert().dismiss();		
  }
  
    @Test
  public void verifyPromptAlert() {
		WebElement clickMe3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickMe3.click();
		driver.switchTo().alert().sendKeys("Obsqura");
		driver.switchTo().alert().accept();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://selenium.qabible.in/javascript-alert.php");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This program handles various types of Alerts");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Alert Handling completed successfuly");
  }

}
