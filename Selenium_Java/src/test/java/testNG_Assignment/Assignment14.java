package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Assignment14 {
	WebDriver driver;
  @Test
  public void verifyTable() {
 List <WebElement> titles= driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
 System.out.println("The titles are : ");
 for (WebElement element : titles)
 {
	 System.out.println(element.getText());
 }
 System.out.println();
  }
  
  @Test
  public void verifyFirstRowData() {
 List <WebElement> tabledata= driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
 List <WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
 int columnCount=columns.size();
 System.out.println("The values in the first row are : ");
 for(int r=1;r<=1;r++)
 {
	 for(int c=1; c<=columnCount;c++)
	 {
		 String value=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + (r + 1) + "]//td[" + c + "]")).getText();
		 System.out.println(value);
	 }
	 System.out.println();
 }
  }

 
 
  @BeforeTest
  public void beforeTest() {
      driver = new ChromeDriver();
      driver.get("https://www.w3schools.com/html/html_tables.asp");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Starting Assignment 14");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Assignment 14 completed successfully");
  }
  

}
