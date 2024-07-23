package SeleniumScripts;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		WebElement newWindowBtn = driver.findElement(By.id("newWindowsBtn"));
		String curTitle = driver.getTitle();
		System.out.println("Parent window title : "+curTitle);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle : "+parentWindowHandle);	
		
		newWindowBtn.click();
		
		Set<String> allOpenedWindowsHandle = driver.getWindowHandles();
		System.out.println("All opened window handles : "+allOpenedWindowsHandle);
		
		for (String handle : allOpenedWindowsHandle) {
			if (!handle.equalsIgnoreCase(parentWindowHandle)) {
				driver.switchTo().window(handle);
				
				//All child window operations should be done inside the if condition
				driver.manage().window().maximize();
				String newTitle = driver.getTitle();
				System.out.println(newTitle);
				String newUrl = driver.getCurrentUrl();
				System.out.println(newUrl);				
			}
		}
				
		driver.switchTo().window(parentWindowHandle);

	}

}
