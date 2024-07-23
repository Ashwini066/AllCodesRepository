package others;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		/*Single Input dropdown */
		//WebElement singleDropDown=driver.findElement(By.id("single-input-field"));
		//List <WebElement> singleDropDown=driver.findElements(By.id("single-input-field"));
		//Select select = new  Select(singleDropDown);
		//selecting values from the dropdown
	   // select.selectByIndex(1);
		//select.selectByValue("Yellow");
		//select.selectByVisibleText("Green");
		//System.out.println(select.getFirstSelectedOption().getText());
	  /* List <WebElement> li=select.getOptions();
	   for(WebElement element : li)
	   {
		   System.out.println(element.getText());
	   }
		select.get*/
		WebElement multiDropDown=driver.findElement(By.id("multi-select-field"));
		Select select = new Select(multiDropDown);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.getFirstSelectedOption();
		List <WebElement> list1 = select.getOptions();
		
		for(WebElement element : list1)
		{
			System.out.println(element.getText());
		}
		
		

	}

}
