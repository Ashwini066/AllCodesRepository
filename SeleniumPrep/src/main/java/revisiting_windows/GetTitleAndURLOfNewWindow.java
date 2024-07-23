package revisiting_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndURLOfNewWindow {

	public static void main(String[] args) throws NoSuchSessionException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement openNewWindowBtn= driver.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", openNewWindowBtn);
		js.executeScript("arguments[0].click()",openNewWindowBtn);
		String parentWindowHandle = driver.getWindowHandle();
		Set <String> allWindowHandles= driver.getWindowHandles();
		for(String handle:allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				String newWindowURL=driver.getCurrentUrl();
				String newWindowTitle= driver.getTitle();
				System.out.println("New Window URL : "+newWindowURL);
				System.out.println("New Window Title : "+newWindowTitle);
				driver.switchTo().window(parentWindowHandle);
				break;
			}
			
		
		}
		
		driver.quit();
	}

}
