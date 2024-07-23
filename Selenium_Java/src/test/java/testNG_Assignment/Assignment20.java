package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignment20 {
	WebDriver driver;
	WebDriverWait waits;
	
  @Test
  public void verifyCorrectPageOpensWhileLoadingURL() {
	  String expected_URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  String actual_URL=driver.getCurrentUrl();
	 waits= new WebDriverWait(driver,Duration.ofSeconds(1));
	 waits.until(ExpectedConditions.urlContains("login"));
	  Assert.assertEquals(actual_URL, expected_URL,"URL Mismatch");
	  }
  
  @Test
  public void verifyLogoIsDisplayed() {
	  
	  WebElement Logo= driver.findElement(By.xpath("//img[@alt='orangehrm-logo']"));
	  waits= new WebDriverWait(driver,Duration.ofSeconds(10));
	  waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='orangehrm-logo']")));
	  String logoname=Logo.getAttribute("alt");
	  Assert.assertTrue(true, logoname="orangehrm-logo'");
	 
  }
  
  @Test
  public void OrangeHRMLinkIsAvailableInHomePage() {
	  WebElement orangeHRMIncLink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	  waits= new WebDriverWait(driver,Duration.ofSeconds(10));
	  waits.until(ExpectedConditions.visibilityOf(orangeHRMIncLink));
	  Assert.assertTrue(orangeHRMIncLink.isDisplayed(),"Link unavailable");
	  }
  
  @Test
  public void verifySucessfulLogin() {
	  
	  WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  waits= new WebDriverWait(driver,Duration.ofSeconds(5));
	  waits.until(ExpectedConditions.visibilityOf(userName));
	  userName.sendKeys("Admin");
	  WebElement passWord= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  waits.until(ExpectedConditions.visibilityOf(passWord));
	  passWord.sendKeys("admin123");
	  WebElement loginBtn= driver.findElement(By.xpath("//button[@type='submit']"));
	  waits.until(ExpectedConditions.elementToBeClickable(loginBtn));
	  loginBtn.click();
	  String expectedUserName="manda user";
	   WebElement userNameIAfterLogin= driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
	  waits.until(ExpectedConditions.visibilityOf(userNameIAfterLogin));
	  String actual_userName=userNameIAfterLogin.getText();
	  Assert.assertEquals(actual_userName, expectedUserName,"Username Mismatch");	  
  }
  
  @Test
  public void verifyUserNameIsShowingOrNotAfterLogin() {
	  
	  WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  waits= new WebDriverWait(driver,Duration.ofSeconds(5));
	  waits.until(ExpectedConditions.visibilityOf(userName));
	  userName.sendKeys("Admin");
	  WebElement passWord= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  waits.until(ExpectedConditions.visibilityOf(passWord));
	  passWord.sendKeys("admin123");
	  WebElement loginBtn= driver.findElement(By.xpath("//button[@type='submit']"));
	  waits.until(ExpectedConditions.elementToBeClickable(loginBtn));
	  loginBtn.click();
	  WebElement AdminOption=driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
	  Wait<WebDriver> fluent =  new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).
			  												pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	  
	  AdminOption.click();
	  WebElement userNameInLogin= driver.findElement(By.xpath("//label[text()='Username']//following::div[1]//child::input"));
	  userNameInLogin.sendKeys("Admin");
	  WebElement userRoleDropDown = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]//child::i"));
	  userRoleDropDown.click();
	  WebElement adminClick = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
	  waits.until(ExpectedConditions.visibilityOf(adminClick));
	  adminClick.click();
	WebElement   searchButton= driver.findElement(By.xpath("//button[@type='submit']"));
	 waits.until(ExpectedConditions.elementToBeClickable(searchButton));
	  searchButton.click(); 
	  WebElement adminAfterSearch= driver.findElement(By.xpath("//div[@class='oxd-table-card']//descendant::div[7]"));
	  waits.until(ExpectedConditions.textToBePresentInElement(adminAfterSearch, "Admin"));
	  System.out.println(adminAfterSearch.getText());
	  String expectedText= "Admin";
	  String actualText=adminAfterSearch.getText();
	  SoftAssert soft= new SoftAssert();
	  soft.assertEquals(actualText, expectedText,"Invalid User");	  
	  soft.assertAll();
  }



@BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
