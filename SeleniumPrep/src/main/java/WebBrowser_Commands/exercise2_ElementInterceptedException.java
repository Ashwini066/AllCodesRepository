package WebBrowser_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise2_ElementInterceptedException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement newWindowBtn=driver.findElement(By.id("windowButton"));
		newWindowBtn.click();
		driver.close();
		driver.quit();
	}

}
/*This code fails with the exception ".selenium.ElementClickInterceptedException:  element click intercepted" because the new window button  is clicked, 
but the click is intercepted by another element. 
So we need to use JavaScriptExecuter class and scroll down to the element first and then click it*/
