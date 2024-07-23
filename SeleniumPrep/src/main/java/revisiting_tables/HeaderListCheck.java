package revisiting_tables;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderListCheck {

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
				List <String> expectedList= new  ArrayList();
				Collections.addAll(expectedList, "Google", "Meta", "Microsoft", "Island Trading", "Adobe", "Amazon");
			    List<String> actual_list = new ArrayList();
			
				
				
				if(driver.findElement(By.xpath("//table[@id='customers']//tbody//th")).getText().equalsIgnoreCase("Company"))
				{
					for(int r=1;r<row_count;r++)
					{
						for(int c=1;c<=1;c++)
						{
						String value=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+(r+1)+"]//td["+c+"]")).getText();
						actual_list.add(value);
					
							}
						}
					
					}
					
				System.out.println(actual_list);	
				System.out.println(expectedList);
				if(expectedList.containsAll(actual_list))
				{
					System.out.println("yes");
				}
					
				
				
				
			driver.quit();	

			

		

	}

}
