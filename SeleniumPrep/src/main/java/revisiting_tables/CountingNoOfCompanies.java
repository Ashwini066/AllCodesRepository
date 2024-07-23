package revisiting_tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CountingNoOfCompanies {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		int actualcount=0;
		int expected_count=6;
		
		WebElement customerTable= driver.findElement(By.id("customers"));
		WebDriverWait waits= new WebDriverWait(driver, Duration.ofSeconds(2));
		waits.until(ExpectedConditions.visibilityOf(customerTable));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", customerTable);
		
		List <WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List <WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int row_count=rows.size();
		int column_count=columns.size();
		/*for(int r=1;r<row_count;r++)
		{
			for(int c=1;c<=column_count;c++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+ (r+1) +"]/td["+c+"]")).getText()+ "   ");
			}
			System.out.println();
		}*/   //get all the data
		for(int r=1 ;r<row_count;r++)
		{
			for(int c=1;c<=1;c++)
			{
					String text=(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+ (r+1) +"]/td["+ c+ "]")).getText());
					actualcount+=1;
					
	
				
			}
			
		}
		if(actualcount==expected_count)
		{
			System.out.println("Count is correct");
		}
		
		else
		{
			System.out.println("Incorrect count");
		}
		driver.quit();

}
}
