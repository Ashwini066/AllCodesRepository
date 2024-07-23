package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class demo {
    public static void main(String[] args) {


       
        WebDriver driver = new ChromeDriver();

  
        driver.get("https://demoqa.com/frames");

        
        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

     
        System.out.println("Number of iframes on the page: " + iframes.size());

      
        driver.quit();
    }
}
