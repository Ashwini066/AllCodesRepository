package assignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://qalegend.com/restaurant");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement userNameTextBox=driver.findElement(By.name("username"));
		userNameTextBox.clear();
		userNameTextBox.sendKeys("lulla");
		WebElement passwordTextBox=driver.findElement(By.name("password"));
		
		passwordTextBox.sendKeys("123456");
		WebElement loginButton=driver.findElement(By.xpath("//input[@name='submit']"));
		loginButton.click();
		
		WebElement userNameInLoginPage=driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		System.out.println("Name of the user : "+userNameInLoginPage.getText());
		WebElement productTab=driver.findElement(By.xpath("//a[@href='https://qalegend.com/restaurant/products']"));
		productTab.click();
		WebElement addProductButton=driver.findElement(By.xpath("//button[@class='btn btn-add btn-lg']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", addProductButton);
		addProductButton.click();
		WebElement codeTextBox=driver.findElement(By.xpath("//input[@placeholder='Code']"));
		WebElement nameTextBox=driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement purchasePriceTextBox=driver.findElement(By.xpath("//input[@placeholder='Purchase Price']"));
		WebElement priceTextBox=driver.findElement(By.xpath("//input[@placeholder='Price']"));
		js.executeScript("arguments[0].scrollIntoView(true)", priceTextBox);
		codeTextBox.sendKeys("1041");
		nameTextBox.sendKeys("Chicken Biriyani");
		purchasePriceTextBox.sendKeys("250");
		priceTextBox.sendKeys("230");
		WebElement submitButtonOne=driver.findElement(By.xpath("(//button[@class='btn btn-add'])[1]"));
		submitButtonOne.click();
		WebElement submitButtonTwo=driver.findElement(By.xpath("//button[@onclick='updatestock()']"));
		 js.executeScript("arguments[0].click();", submitButtonTwo);


	}

}
