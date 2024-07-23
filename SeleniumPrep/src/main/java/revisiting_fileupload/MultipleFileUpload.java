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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleFileUpload {

    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duplichecker.com/grammar-checker.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        // Click on the upload button
        WebElement uploadBtn = driver.findElement(By.xpath("(//img[@class='whitebox'])[1]"));
        uploadBtn.click();
        
        // Use Robot class to upload file
        String filePath = "C:\\Users\\premc\\Downloads\\2506.txt";
        StringSelection filepathSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathSelection, null);
        
        Robot robot = new Robot();
        
        // Press CTRL + V to paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_V);
        
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        // Press ENTER to confirm the file upload
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        // Add a short delay to ensure the file is uploaded
    

        // Retrieve the text from the textarea after the file is uploaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement textArea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textdata")));
        String pastedText = textArea.getText();
        System.out.println("Text pasted in textarea: " + pastedText);
        
        // Close the browser
        driver.quit();
    }
}
