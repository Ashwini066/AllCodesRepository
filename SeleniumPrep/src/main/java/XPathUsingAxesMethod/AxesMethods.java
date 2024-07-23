package XPathUsingAxesMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesMethods {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		////input[@placeholder='First Name']//parent::div

	}

}
