package WebBrowser_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();   //to instantiate the web browser
		driver.get("http://selenium.qabible.in/");   //  loads the given url
		System.out.println(driver.getTitle());          //returns the title of the page
		System.out.println(driver.getCurrentUrl());  // returns the current url
		System.out.println(driver.getPageSource());   //returns the source code of the page
		driver.close();   //close the current browser window
		driver.quit(); // to close all the windows opened as part of this automation script run
		

	}

}
