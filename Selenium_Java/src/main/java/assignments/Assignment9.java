package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment9 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		WebElement multipleWindowButton =  driver.findElement(By.id("newWindowsBtn"));
		System.out.println(driver.getTitle());
		String parentWindowHandle=driver.getWindowHandle();
		//System.out.println(parentWindowHandle);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",multipleWindowButton);
		js.executeScript("arguments[0].click()", multipleWindowButton);
		Set <String>allopenedWindows=driver.getWindowHandles();
		for(String handle:allopenedWindows)
		{
			
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				try
				{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				//System.out.println(driver.getTitle());
				if(driver.getTitle().equals("XPath Practice - H Y R Tutorials"))
					{
					WebElement fnameTextBox=driver.findElement(By.xpath("//input[@name='name'][1]"));
					WebElement lnameTextBox=driver.findElement(By.xpath("//input[@name='name'][2]"));
					WebElement emailTextBox=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
					WebElement passwordTextBox=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
					WebElement repeatPasswordTextBox=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
					WebElement registerBtn=driver.findElement(By.xpath("//button[@type='submit']"));
					
					js.executeScript("arguments[0].scrollIntoView(true)", registerBtn);
					fnameTextBox.sendKeys("Ashwini");				
					lnameTextBox.sendKeys("Prem");					
					emailTextBox.sendKeys("abc123@gmail.com");					
					passwordTextBox.sendKeys("Hello!223");				
					repeatPasswordTextBox.sendKeys("Hello!223");
					js.executeScript("arguments[0].click()", registerBtn);
					driver.close();
					}
				
				if(driver.getTitle().equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
				{
					WebElement firstname=driver.findElement(By.id("firstName"));
					WebElement lastname=driver.findElement(By.id("lastName"));				
					WebElement gender=driver.findElement(By.id("femalerb"));					
					WebElement englishLanguage=driver.findElement(By.id("englishchbx"));					
					WebElement hindiLanguage=driver.findElement(By.id("hindichbx"));					
					WebElement emailTextBox=driver.findElement(By.xpath("//input[@id='email']"));					
					WebElement pwdTextBox=driver.findElement(By.xpath("//input[@id='password']"));
			        WebElement registerButton=driver.findElement(By.id("registerbtn"));
			        
					js.executeScript("arguments[0].scrollIntoView(true)", registerButton);
					
					firstname.sendKeys("Ashwini");
					lastname.sendKeys("Prem");
					js.executeScript("arguments[0].click()", gender);
					js.executeScript("arguments[0].click()", englishLanguage);
					js.executeScript("arguments[0].click()", hindiLanguage);
					emailTextBox.sendKeys("abc123@gmail.com");
					pwdTextBox.sendKeys("Hello@123");
					js.executeScript("arguments[0].click()", registerButton);
					driver.close();
					
				}
				}
			catch(NoSuchWindowException wnf)
			{
				System.out.println("Target Window Closed Exception is handled");
			}
				
			}
			}
			
		
		
		driver.switchTo().window(parentWindowHandle);
		WebElement headingCheck=driver.findElement(By.xpath("//h1[@itemprop='name']"));
		System.out.println("Is the text 'Window Handles Practice' displayed on the screen : "+headingCheck.isDisplayed());
		driver.quit();
	}

}

