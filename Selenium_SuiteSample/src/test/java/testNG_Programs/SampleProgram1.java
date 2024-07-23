package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleProgram1 {
	WebDriver driver;
  @Test
  public void verifyDropdownIsMultiSelect() {
	  WebElement color1 = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(color1);
		Boolean check1 = select1.isMultiple();
	    System.out.println(check1);
		
  }
   @Test
   public void verifySelectedValueFromDropdown() {
	   WebElement colorDropdown = driver.findElement(By.id("single-input-field"));
	   Select select = new Select(colorDropdown);
	   select.selectByIndex(2);
   }
   
  @Test
  public void verifyAllOptionsInDropDown(){
	  WebElement colorDropdown = driver.findElement(By.id("single-input-field"));
		Select select = new Select(colorDropdown);
	    List<WebElement> li1 =select.getOptions();
	    	for (WebElement webElement : li1) {
		System.out.println(webElement.getText());
	    	}
  }
  
	    	@Test
	    	

	    	public void verifyGetAllSelectedOptionsFromDP() {
	    		WebElement color1 = driver.findElement(By.id("multi-select-field"));
	    		Select select1 = new Select(color1);
	    		List<WebElement> li3 = select1.getAllSelectedOptions();
	    	    for (WebElement webElement : li3) {
	    			System.out.println(webElement.getText());
	    	    } 	
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.get("http://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a  dropdown handling program ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Dropdown handling program completed Successfully");
  }

}
