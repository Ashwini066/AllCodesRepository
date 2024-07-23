package others;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RobotCLass {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");
        
        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        
        WebElement chooseFileBtn = driver.findElement(By.id("uploadFile"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chooseFileBtn);

        // Click on the upload button using JavaScript to avoid click issues
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", chooseFileBtn);

        // Use Robot class to simulate file upload
        Robot r = new Robot();
        StringSelection filepath = new StringSelection("C:\\Users\\premc\\Downloads\\snowp.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        Thread.sleep(2000); // Small delay to ensure clipboard is set

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(2000); // Small delay to ensure file path is pasted

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000); // Wait for the file to be uploaded

        // Use explicit wait to wait for the element to appear
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement fileUploadedPath =driver.findElement(By.id("uploadedFilePath"));

        System.out.println(fileUploadedPath.getText());
        System.out.println("File uploaded successfully");

        driver.quit(); // Close the browser after the process is complete
    }
}
