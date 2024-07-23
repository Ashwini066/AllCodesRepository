package revisiting_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement clickNewTabBtn= driver.findElement(By.id("newTabBtn"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", clickNewTabBtn);
		js.executeScript("arguments[0].click()",clickNewTabBtn);
		String parentWindowHandle= driver.getWindowHandle();
		Set <String> getAllOpenedWindow= driver.getWindowHandles();
		for(String handle:getAllOpenedWindow)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				WebElement clickme= driver.findElement(By.id("alertBox"));
				clickme.click();
				driver.switchTo().alert().accept();
				driver.close();
				driver.switchTo().window(parentWindowHandle);
			
				break;
			}
		}
driver.quit();
	}

}
