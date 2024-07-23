package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		
		WebElement openNewTabButton=driver.findElement(By.id("newTabBtn"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",openNewTabButton );
		js.executeScript("arguments[0].click()",openNewTabButton );
		String parentWindowHandle=driver.getWindowHandle();
		Set <String> allOpenedWindowHandles=driver.getWindowHandles();
		for(String handle:allOpenedWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				WebElement clickmeButtonSimpleAlert=driver.findElement(By.xpath("//button[@id='alertBox']"));
				js.executeScript("arguments[0].scrollIntoView(true)",clickmeButtonSimpleAlert );
				clickmeButtonSimpleAlert.click();
				String alertText=driver.switchTo().alert().getText();
				System.out.println(alertText);
				driver.switchTo().alert().accept();
				WebElement clickmeButtonPromptAlert=driver.findElement(By.id("promptBox"));
				js.executeScript("arguments[0].scrollIntoView(true)",clickmeButtonPromptAlert );
				clickmeButtonPromptAlert.click();
				driver.switchTo().alert().sendKeys("Ashwini");
				driver.switchTo().alert().accept();
				WebElement promptText=driver.findElement(By.xpath("//div[@id='output']"));
				String promptTextMessage=promptText.getText();
				System.out.println(promptTextMessage);
				
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.quit();

	}

}
