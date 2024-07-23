package assignments;
import java.awt.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("Current URL of the page is : "+driver.getCurrentUrl());
		WebElement yesRadioBtn=driver.findElement(By.xpath("//input[@id='yes']"));
		System.out.println("Is the Yes radio button selected by default? : "+yesRadioBtn.isSelected());
		WebElement noRadioBtn=driver.findElement(By.xpath("//input[@id='no']"));
		noRadioBtn.click();
		System.out.println("Is the No radio button selected : "+noRadioBtn.isSelected());
		driver.close();


	}

}
