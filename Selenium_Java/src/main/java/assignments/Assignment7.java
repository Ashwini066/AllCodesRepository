package assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.qabible.in");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@src='images/logo.png']"));
		System.out.println("Size of the logo is : "+logo.getSize());
		System.out.println("Location of the logo is : "+logo.getLocation());
		WebElement inputFormTab=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputFormTab.click();
		WebElement radioBtnDemoTab=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));
		radioBtnDemoTab.click();
		WebElement femaleRadioBtn=driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
		femaleRadioBtn.click();
		WebElement showSelectedValueBtn=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		showSelectedValueBtn.click();
		WebElement showSelectedValuemessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(showSelectedValuemessage.getText());
		
		
		WebElement femaleGroupRadioBtn=driver.findElement(By.xpath("(//input[@value='Female'])[2]"));
		femaleGroupRadioBtn.click();
		WebElement ageGroupRadioBtn=driver.findElement(By.xpath("//input[@value='45 to 60']"));
		ageGroupRadioBtn.click();
		WebElement getResultBtn=driver.findElement(By.xpath("//button[text()='Get Results']"));
		getResultBtn.click();
		WebElement getResultBtnMessage=driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println(getResultBtnMessage.getText());
		driver.navigate().refresh();
		List <WebElement> allMaleRadioBtn=driver.findElements(By.xpath("//input[@value='Male']"));
		for(WebElement element:allMaleRadioBtn)
		{
			System.out.println("Female Radio button selected by default ? : "+element.isSelected());
		}
		List <WebElement> allRadioBtn=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement element:allRadioBtn)
		{
			element.click();
			System.out.println("Is the button clickabke ? : "+element.isSelected());


	}

}
}
