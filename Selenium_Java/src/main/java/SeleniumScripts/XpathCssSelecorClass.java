package SeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCssSelecorClass {

	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("(//img[@alt='logo'])[1]"));
		
		Boolean res = logo.isDisplayed();
		
		System.out.println(res);
	

	}

}
