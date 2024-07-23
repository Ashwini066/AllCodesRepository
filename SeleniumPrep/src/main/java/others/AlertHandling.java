package others;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
    WebDriver driver= new ChromeDriver();
    driver.get("http://selenium.qabible.in/javascript-alert.php");
    driver.manage().window().maximize();
    WebElement simpleAlert= driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
    simpleAlert.click();
    driver.switchTo().alert().accept();
    WebElement confAlert= driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true)", confAlert);
    confAlert.click();
    driver.switchTo().alert().dismiss();
    WebElement promptAlert= driver.findElement(By.xpath( "//button[@onclick='jsPrompt()']"));
    promptAlert.click();
    driver.switchTo().alert().sendKeys("Hello");
    driver.switchTo().alert().accept();
    WebElement text=driver.findElement(By.id("prompt-demo"));
    System.out.println(text.getText());
   
    
    
    
    
    

	}

}
