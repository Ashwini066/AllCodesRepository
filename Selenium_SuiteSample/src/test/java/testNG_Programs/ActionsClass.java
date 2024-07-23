package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionsClass {
	WebDriver driver;
	 Actions action;
  @Test
  public void dragAndDrop() {
	  WebElement srcElement=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	  WebElement destElement=driver.findElement(By.id("amt7"));
	   action= new Actions(driver);
	  action.dragAndDrop(srcElement, destElement).build().perform();
  }
  
  @Test
  public void mouseActions() {
	  WebElement agileProjectTab=driver.findElement(By.xpath("//a[text()='Agile Project']"));
	  action= new Actions(driver);
	  action.moveToElement(agileProjectTab).click().build().perform();

  }
  
  @Test
  public void sendKeyClick() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.navigate().refresh();
	  WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
	  
	  action=new Actions(driver);
	  
	  action.click(messageTextBox).sendKeys("Message").build().perform();
	  WebElement showMessageBtn=driver.findElement(By.id("button-one"));
	  action.sendKeys(showMessageBtn,Keys.ENTER).build().perform();
	  
	  
	  
  }
  
  @Test
  public void keyDown() {
	  driver.navigate().to("http://selenium.qabible.in/simple-form-demo.php");
	  driver.navigate().refresh();
	  WebElement messageTextBox=driver.findElement(By.id("single-input-field"));
	   action=new Actions(driver);
	  action.click(messageTextBox).sendKeys("Message").build().perform();
	  action.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();
	  
	  
	  
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
