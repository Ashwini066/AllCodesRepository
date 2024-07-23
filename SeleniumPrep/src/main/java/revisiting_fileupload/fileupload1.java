package revisiting_fileupload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(2)));
		WebElement chooseFile= driver.findElement(By.id("file-upload"));
		Robot r= new Robot();
		StringSelection filepath= new StringSelection("C:\\Users\\premc\\Downloads\\snowp.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("file-submit")).click();
		
		
		
	
		
		
		
		
		
		

	}

}
