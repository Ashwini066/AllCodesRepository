package chatgptAssessment;

import org.testng.annotations.Test;

import utility.ScreenshotInSelenium;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Day1 {
	WebDriver driver;
	WebDriverWait waits;
	ScreenshotInSelenium screenshot;
	
  @Test
  public void verifyTitle() {
	  driver.navigate().to("http://example.com");
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Example ABC Domain";
	  System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle, "Title Mismatch");
	  
  }
  @Test
  public void verifyCheckBoxAndRadioBtn() {
	  driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	  WebElement checkbox1 =  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	  waits= new WebDriverWait(driver, Duration.ofSeconds(2));
	  waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='checkbox'])[1]")));
	  System.out.println(checkbox1.isSelected());
	  checkbox1.click();
	  Assert.assertTrue(checkbox1.isSelected(),"Checkbox is not selected");
	  driver.navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
	  WebElement radiobutton= driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
	  waits.until(ExpectedConditions.visibilityOf(radiobutton));
	  radiobutton.click();
	  Assert.assertTrue(radiobutton.isSelected());
	  	  
  }
  
  @Test
  public void verifyDropDown() {
	  driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
	  WebElement dropDown = driver.findElement(By.id("dropdown"));
	  Select select = new Select(dropDown);
	  select.selectByVisibleText("Option 1");
	  String expected_value="Option 1";
	  String actual_value=select.getFirstSelectedOption().getText();
	  Assert.assertEquals(actual_value, expected_value,"Option 1 is not selected");
	  
  }
  
  @Test
  public void verifyalertHandling() {
	  driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	  WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	  promptAlert.click();
	  waits= new WebDriverWait(driver, Duration.ofSeconds(2));
	  waits.until(ExpectedConditions.alertIsPresent());
	  driver.switchTo().alert().sendKeys("okay");
	  driver.switchTo().alert().accept();
	  WebElement textAfterHandlingAlert= driver.findElement(By.id("result"));
	  String text=textAfterHandlingAlert.getText();
	  System.out.println(text);
	  
  }
  
  @Test
  public void verifyTableHandling() {
	  driver.navigate().to("https://the-internet.herokuapp.com/tables");
	  WebElement example1Table= driver.findElement(By.id("table1"));
	  List <WebElement> table_rows=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
	  int row_count=table_rows.size();
	  System.out.println(row_count);
	  for(int r=0;r<row_count;r++)
	  {
		  for(int c=1;c<=1;c++)
		  {
			  System.out.println(driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[" + (r + 1) + "]//td[" + c + "]")).getText());
			  //driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + (r + 1) + "]//td[" + c + "]")).getText();
		  }
		  
	  }
	  
	  
  }
  
  
  @Test
  public void verifyWindowHandling() {
	  driver.navigate().to("https://the-internet.herokuapp.com/windows");
	  WebElement clickhereLink= driver.findElement(By.xpath("//a[@href='/windows/new']"));
	  clickhereLink.click();
	  String parent_windowHandle=driver.getWindowHandle();
	  Set <String> allChildWindowHandles=driver.getWindowHandles();
	  for(String handle:allChildWindowHandles)
	  {
		  if(!handle.equalsIgnoreCase(parent_windowHandle))
		  {
			  driver.switchTo().window(handle);
			  String actual_title=driver.getTitle();
			  String expected_title="New Window";
			  Assert.assertEquals(actual_title, expected_title);
			  
		  }
		  
	  }
	  driver.quit();
	  driver.switchTo().window(parent_windowHandle);
	  driver.close();

	  
	  
  }
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	  if(result.getStatus()==ITestResult.FAILURE){
		  screenshot.takeScreenshot(driver, result.getName());
	  }
  }
	  
	  //driver.quit();
  }


