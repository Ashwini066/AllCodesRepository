package SeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHRMLoginAssignment {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		//textUsername.clear();
		username.sendKeys("Admin");
		
		//WebElement password = driver.findElement(By.name("password"));
		//textPassword.clear();
		//password.sendKeys("admin123");
		
		WebElement btnSignIn = driver.findElement(By.tagName("button"));
		
		btnSignIn.click();
		
		//driver.close();
	}

}
