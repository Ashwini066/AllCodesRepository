package SeleniumScripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://selenium.qabible.in/");
		driver.manage().window().maximize();
		
		WebElement linkInputForm = driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		linkInputForm.click();
		WebElement checkboxLink = driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkboxLink.click();
		List<WebElement> checkboxes = driver.findElements(By.className("check-box-list"));
				
		for (WebElement element : checkboxes) {
			element.click();
			Boolean status = element.isSelected();
			System.out.println(status);
		}	
		
		
		////input[@type='checkbox']		

	}

}
