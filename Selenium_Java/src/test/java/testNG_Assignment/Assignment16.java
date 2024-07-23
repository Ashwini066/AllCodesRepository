package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Assignment16 {
	WebDriver driver;
	Select select;
	Select select1;
  @Test
  public void selectAllCourse() {

	 List <WebElement> l= select.getOptions();
	 System.out.println("The courses are : ");
	  for(WebElement element : l)
	  {
		  if(element.getText().equalsIgnoreCase("Select"))
		  {
			  continue;
		  }
		  System.out.println(element.getText());
	
	  }
	  System.out.println();
  }
	  @Test
	  public void verifyAllDropDowns() {  
		  List <WebElement> dropDowns=driver.findElements(By.tagName("select"));
		  System.out.println("Count of dropdowns in the page is : "+dropDowns.size());
	  
  }
	  @Test
	  public void selectCourseAndPrintSelectedValue () {  
		  
		 select.selectByValue("net");
		 WebElement selectedValue=select.getFirstSelectedOption();
		 System.out.println("The selected Value is : "+selectedValue.getText());
		  
	  }
	  
	  @Test
	  public void verifyIDEDropdownIsMultiple () {  

		  Boolean check=select1.isMultiple();
		  System.out.println("Is IDE a multiple DropDown ? : "+check); 
	  }
	  
	  @Test
	  public void selectValuesAndPrint() {  
		  select1.selectByIndex(1);
		  select1.selectByIndex(2);
		  select1.selectByIndex(3);
		  List <WebElement> l1=select1.getAllSelectedOptions();
		  System.out.println("The selected Values are : ");
		  for(WebElement element: l1)
		  {
			  System.out.println(element.getText());
		  }
System.out.println();

	  }
	  
  @BeforeMethod
  public void beforeMethod()  {

	  WebElement courseNameDropdown= driver.findElement(By.xpath("//select[@id='course']"));
	  select=new Select(courseNameDropdown);
	  WebElement IDEMultiDropDown=driver.findElement(By.id("ide"));
	  select1=new Select(IDEMultiDropDown);
	  
  }

  @BeforeTest
  public void beforeTest()  {
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }


  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Assignment 16 started");
  }

  @AfterSuite
  public void afterSuite() {
	  //river.close();
	  System.out.println("Assignment 16 completed successfully");
  }

}
