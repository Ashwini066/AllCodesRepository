package Tryout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class assignmnet21 {

	public static void main(String[] args) {
		 WebDriver  driver= new ChromeDriver();
		 driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  WebElement searchtextbox= driver.findElement(By.id("APjFqb"));
		  searchtextbox.sendKeys("Apple");

		  //waits = new WebDriverWait(driver,Duration.ofMillis(5));
		  WebElement searchbtn= driver.findElement(By.name("btnK"));
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView(true)", searchbtn);
		  js.executeScript("arguments[0].click()", searchbtn);
		  String expected_value="Apple";
		  String actual_value = driver.findElement(By.id("APjFqb")).getAttribute("value");
		  System.out.println(actual_value);
		  Assert.assertEquals(actual_value, expected_value);
		  driver.quit();
		  
	
	}

}
