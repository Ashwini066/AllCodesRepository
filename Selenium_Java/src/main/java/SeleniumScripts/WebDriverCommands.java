package SeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//WebDriver driver= new ChromeDriver();

		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		
		driver.manage().window().maximize();
		
		
		WebElement textUsername = driver.findElement(By.name("username"));
		textUsername.clear();
		textUsername.sendKeys("admin");
		
		WebElement textPassword = driver.findElement(By.name("password"));
		textPassword.clear();
		textPassword.sendKeys("admin");
		WebElement btnSignIn = driver.findElement(By.tagName("button"));
		
		btnSignIn.click();
		
		//driver.close();
		
		
	

		
	}

}
