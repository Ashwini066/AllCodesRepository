package testNG_Programs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ParameteriztaionExample {
	WebDriver driver;
  @Test
  
  @Parameters({"param1" , "param2"})
  public void addTwoNumbers(int a,int b) {
	  int c= a+ b;
	  System.out.println("Sum is : "+c);
  }
  
  
  @Test
  @Parameters({"s"})
  public void searchApple(String search) {
	  driver.findElement(By.id("APjFqb")).sendKeys(search);
	  Actions action= (Actions) driver;
	  action.sendKeys(Keys.ENTER).build().perform();

  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @AfterMethod
  public void afterMethod() {
  }

}
