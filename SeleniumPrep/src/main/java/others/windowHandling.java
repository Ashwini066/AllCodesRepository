package others;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newWindowBtn = driver.findElement(By.id("windowButton"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", newWindowBtn);
		newWindowBtn.click();
		String parentWindowHandle=driver.getWindowHandle();
		//System.out.println(parentWindowHandle);
		Set <String> allChildWindowHandles= driver.getWindowHandles();
		for(String handle: allChildWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				String childWindowText=driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(childWindowText);
				driver.quit();	
			}
			
			//driver.quit();	
	}
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
