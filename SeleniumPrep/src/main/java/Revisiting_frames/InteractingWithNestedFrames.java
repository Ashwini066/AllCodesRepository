package Revisiting_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithNestedFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		//System.out.println(driver.findElement(By.tagName("body").tagName("h2")).getText());
		//System.out.println(driver.findElement(By.tagName("body").tagName("p")).getText());
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
