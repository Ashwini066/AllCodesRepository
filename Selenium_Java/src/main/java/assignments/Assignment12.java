package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frm1");
		WebElement selectCourseDropDown=driver.findElement(By.xpath("//select[@id='course']"));
		Select select=new Select(selectCourseDropDown);
		select.selectByValue("java");
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm2");
		WebElement fnameText=driver.findElement(By.id("firstName"));
		String placeHolderValue=fnameText.getAttribute("placeholder");
		System.out.println(placeHolderValue);
		
	}

}
