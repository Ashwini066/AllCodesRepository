package assignments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameTextBox=driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("Admin");
		WebElement passwordTextBox=driver.findElement(By.name("password"));
		passwordTextBox.sendKeys("admin123");
		WebElement loginButton=driver.findElement(By.tagName("button"));
		loginButton.click();
		


	}

}
