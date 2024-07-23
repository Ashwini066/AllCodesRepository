package SeleniumScripts;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement newWindowBtn=driver.findElement(By.id("newWindowBtn"));
		String parentWindowTitle=driver.getTitle();
		System.out.println(parentWindowTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",newWindowBtn);
		js.executeScript("arguments[0].click()",newWindowBtn);
		Set <String> allOpenedWindowHandles=driver.getWindowHandles();
		System.out.println(allOpenedWindowHandles);
		for(String handle:allOpenedWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				/*All the child window handling happens within the if statement */
				driver.manage().window().maximize();
				String childWindowTitle=driver.getTitle();
				System.out.println(childWindowTitle);
				System.out.println(driver.getCurrentUrl());
				
				
			}
		}
    driver.switchTo().window(parentWindowHandle);
   System.out.println(driver.getCurrentUrl()); 


	}

}
