package SeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickMe1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe1.click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
				
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe2.click();
		driver.switchTo().alert().dismiss();		
		
		WebElement clickMe3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickMe3.click();
		driver.switchTo().alert().sendKeys("Obsqura");
		driver.switchTo().alert().accept();
	}

}
