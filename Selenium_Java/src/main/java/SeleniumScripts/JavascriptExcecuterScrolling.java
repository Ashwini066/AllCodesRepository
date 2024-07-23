package SeleniumScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcecuterScrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement addToCartButton = driver.findElement(By.xpath("//a[contains(@onclick,'614')]"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy(0,500)");  //scrolling to the given value
		
		je.executeScript("arguments[0].click();", addToCartButton); // 
		
		je.executeScript("window.scrollBy(0,-500)"); //Scroll up 
		
		//je.executeScript("arguments[0].scrollIntoView();", addToCartButton); //scrolling up to the element
		
		addToCartButton.click();
	}

}
