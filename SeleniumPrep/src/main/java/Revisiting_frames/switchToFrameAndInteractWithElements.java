package Revisiting_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class switchToFrameAndInteractWithElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String leftFrameText=driver.findElement(By.tagName("body")).getText();
		System.out.println(leftFrameText);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		String rightFrameText=driver.findElement(By.tagName("body")).getText();
		System.out.println(rightFrameText);
		driver.switchTo().defaultContent();
		driver.quit();
		
		

	}

}
