package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesOrIFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//WebElement iframeSamplePage=driver.findElement(By.id("frame1"));
		//driver.switchTo().frame(iframeSamplePage);/*Method 1: Using Webelement- so locate the elemenet first and then use the switch to method */
		
		//driver.switchTo().frame("frame1");/* Method 2:Using Id- just give the id of the iframe, no need to locate the Web element*/
		driver.switchTo().frame(4);/* Method 3:Using Index, pass the index value of the frame as argument */
		
		
		WebElement iframeSampleHeading=driver.findElement(By.id("sampleHeading"));
		String iframeSampleText=iframeSampleHeading.getText();
		System.out.println(iframeSampleText);
		
		
		
		

	}

}
