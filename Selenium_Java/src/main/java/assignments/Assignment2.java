package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("Current URL of the page is : "+driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement orangeHRMIncLink=driver.findElement(By.linkText("OrangeHRM, Inc"));
		orangeHRMIncLink.click();
		driver.quit();


	}

}
