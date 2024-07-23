package SeleniumScripts;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement messageTextbox  = driver.findElement(By.id("single-input-field"));
		String Checkplaceholder = messageTextbox.getAttribute("placeholder");
		
		System.out.println(Checkplaceholder);
		
		String textTag = messageTextbox.getTagName();
		System.out.println(textTag);
		
		org.openqa.selenium.Point p= messageTextbox.getLocation();
		System.out.println(p);
		
		
		messageTextbox.sendKeys("Hello");

		
		WebElement button = driver.findElement(By.id("button-one"));
		String fontFamily =  button.getCssValue("font-family");
		System.out.println(fontFamily);
		System.out.println(button.getSize());
		
		button.click();
//		
//		WebElement resultText = driver.findElement(By.id("message-one"));
//		String message = resultText.getText();
//		
//		System.out.println("Entered Message is :" +message );
//		
//		WebElement linkCheckbox = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
//		linkCheckbox.click();
//		
//		WebElement checkbox = driver.findElement(By.id("gridCheck"));
//		checkbox.click();
//		
//		boolean checked = checkbox.isSelected();
//		System.out.println(checked);
		
	}
}