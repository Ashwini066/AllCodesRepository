package Tryout;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void verifyLaughingBacchusWinecellars() {
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	List <WebElement> column=driver.findElements(By.xpath("//table[@id='customers']//th"));
	int rowCount=rows.size();
	int columnCount=column.size();
	for(int r=1;r<rowCount;r++)
	{
		for(int c=1;c<columnCount;c++)
		{
			String value=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + (r + 1 ) + "]//td[" + c + "]")).getText();
			if(value.equalsIgnoreCase("Laughing Bacchus Winecellars"))
			{
				System.out.println("Row : "+r+"   "+"Column : "+c);
				System.out.println("True");
				break;
			}
		}
	}
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/html_tables.asp");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
