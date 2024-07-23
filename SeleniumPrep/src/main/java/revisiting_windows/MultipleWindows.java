package revisiting_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement openMultipleWindow= driver.findElement(By.id("newWindowsBtn"));
		String parentHandle= driver.getWindowHandle();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", openMultipleWindow);
		js.executeScript("arguments[0].click()",openMultipleWindow);
		Set <String> allChildWindowHandles= driver.getWindowHandles();
		for(String handle:allChildWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentHandle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				String currentURL= driver.getCurrentUrl();
				String title=driver.getTitle();
				System.out.println(currentURL);
				System.out.println(title);
				if(driver.getTitle().equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
				{
					
					WebElement firstname=driver.findElement(By.id("firstName"));
					firstname.sendKeys("FirstName");
					
				}
				else if(driver.getTitle().equalsIgnoreCase("XPath Practice - H Y R Tutorials"))
						{
					
					WebElement techNewsTab=driver.findElement(By.xpath("//a[@href='https://www.hyrtutorials.com/search/label/TechNews']"));
					techNewsTab.click();
					
					
						}
			}
			//driver.close();	
			
		}
	    driver.switchTo().window(parentHandle);
	    driver.close();
	    
	}

}
