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

public class FindingPrevAndNextElement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement customerTable= driver.findElement(By.id("customers"));
		WebDriverWait waits= new WebDriverWait(driver, Duration.ofSeconds(2));
		waits.until(ExpectedConditions.visibilityOf(customerTable));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", customerTable);
		List <WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		int row_count=rows.size();
		List <WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tbody//th"));
		int column_count=columns.size();
		String expected_company_name="Amazon";
		String expected_country="Italy";
		for(int r=1;r<row_count;r++)
		{
			for(int c=1;c<column_count;c++)
			{
				String text=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ (r+1) +"]//td["+ c +"]")).getText();
				if(text.equalsIgnoreCase("Giovanni Rovelli"))
				
				{
					String actual_company_name=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ (r+1) +"]//td["+ (c-1) +"]")).getText();
					String actual_country=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+ (r+1) +"]//td["+ (c+1) +"]")).getText();
					//System.out.println(actual_company_name);
					//System.out.println(actual_country);
					if((actual_company_name.equalsIgnoreCase(actual_company_name)) && (actual_country.equalsIgnoreCase(expected_country)))
					{
						System.out.println("Comapny name is "+actual_company_name+" and Country name is "+actual_country);
						break;
					}
					
				break;	
				}
			}
		}
driver.quit();
	}

}
