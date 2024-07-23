package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.navigate().refresh();
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("URL of the page is : "+driver.getCurrentUrl());
		driver.navigate().to("https://groceryapp.uniqassosiates.com/sign-up");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.close();


	}

}
