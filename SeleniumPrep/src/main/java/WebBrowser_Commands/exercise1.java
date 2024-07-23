package WebBrowser_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com");
		String title = driver.getTitle();
		System.out.println(title);
		int title_length=title.length();
		System.out.println(title_length);
		String currrentURL= driver.getCurrentUrl();
		if(currrentURL.equalsIgnoreCase("https://demoqa.com/"))
		{
			System.out.println("Verification successfull");
		}
		else
		{
			System.out.println("verification failed");
		}
		String pageSource=driver.getPageSource();
		System.out.println(pageSource.length());
		//driver.close();
	}

}
