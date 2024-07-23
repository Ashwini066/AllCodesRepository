package assignments;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/sign-up");
		driver.manage().window().maximize();
		WebElement fnameTextBox=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lnameTextBox=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		WebElement emailTextBox=driver.findElement(By.xpath("//input[@placeholder='E-Mail']"));
		WebElement phoneTextBox=driver.findElement(By.xpath("//input[@placeholder='Telephone']"));
		WebElement pwdTextBox=driver.findElement(By.id("password1"));
		WebElement repeatPwdTextBox=driver.findElement(By.id("password2"));
		WebElement signUpBtn=driver.findElement(By.xpath("//button[@class='next_ch02']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",signUpBtn );
		fnameTextBox.sendKeys("Hello");
		lnameTextBox.sendKeys("World");
		emailTextBox.sendKeys("World123@gmail.com");
		phoneTextBox.sendKeys("5644567891");
		pwdTextBox.sendKeys("World@123");
		repeatPwdTextBox.sendKeys("World@123");
		js.executeScript("arguments[0].click()", signUpBtn);
		WebElement otpVerifyText=driver.findElement(By.xpath("//h2[text()='OTP Verify']"));
		if(otpVerifyText.isDisplayed()==true)
		{
			System.out.println("Verify OTP screen is visible");
		}
		else
		{
			System.out.println("Verify OTP screen is not visible");
		}
	}

}
