package revisiting_fileupload;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadVideo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(2)));

	}

}
