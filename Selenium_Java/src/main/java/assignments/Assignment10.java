package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		int count=0;
		List  <WebElement> iframeList= driver.findElements(By.tagName("iframe"));
		for(WebElement element: iframeList)
		{
			count+=1;
		}
		
		System.out.println("The number of iframes in the page is : "+count);
		
	}

}
