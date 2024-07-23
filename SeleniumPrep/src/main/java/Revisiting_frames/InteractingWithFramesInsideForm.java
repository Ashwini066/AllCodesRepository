package Revisiting_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWithFramesInsideForm {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		WebElement item1= driver.findElement(By.xpath("//ol[@id='selectable']//following::li[1]"));
		item1.click();
		System.out.println(item1.isDisplayed());
		WebElement item2= driver.findElement(By.xpath("//ol[@id='selectable']//following::li[2]"));
		item2.click();
		System.out.println(item2.isDisplayed());
		WebElement item3= driver.findElement(By.xpath("//ol[@id='selectable']//following::li[3]"));
		item3.click();
		System.out.println(item3.isDisplayed());
		driver.switchTo().parentFrame();
		driver.close();
		

	}

}
