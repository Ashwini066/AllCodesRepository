package testNG_Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Assignment17 {
    WebDriver driver;

    @Test
    public void uploadProfilePhotoUsingRootClass() throws AWTException, InterruptedException {
        WebElement uploadAPhoto = driver.findElement(By.xpath("//label[@for='avatar_upload']"));
        uploadAPhoto.click();
        Robot r = new Robot();
        StringSelection filepath = new StringSelection("C:\\Users\\premc\\Downloads\\snowpoo.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

        r.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        r.keyPress(KeyEvent.VK_V);

        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        r.keyRelease(KeyEvent.VK_V);

        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(100);
        r.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("File uploaded successfully");
        
        // Wait for the upload to complete and save the changes
        Thread.sleep(5000); // Adjust the sleep duration as necessary
        WebElement saveButton = driver.findElement(By.xpath("(//*[@class='Button-label'])[6]"));
        saveButton.click();
        Thread.sleep(2000); 
    }

    @Test
   /* public void uploadProfilePhotoUsingSendKeys() {
        WebElement uploadAPhoto = driver.findElement(By.xpath("//label[@for='avatar_upload']"));
        uploadAPhoto.sendKeys("C:\\Users\\premc\\Downloads\\snowpoo.jpg");
        System.out.println("File Uploaded successfully");
        
        // Wait for the upload to complete and save the changes
        try {
            Thread.sleep(5000); // Adjust the sleep duration as necessary
            WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(), 'Save')]"));
            saveButton.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement userName = driver.findElement(By.id("login_field"));
        userName.sendKeys("Ashwini066");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("Infy@738394");
        WebElement signInBtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signInBtn.click();
        driver.navigate().to("https://github.com/settings/profile");
        WebElement editButton = driver.findElement(By.xpath("//*[@class='octicon octicon-pencil']"));
        editButton.click();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Assignment 17 started");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Assignment 17 completed successfully");
    }
}