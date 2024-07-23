package assignments;

public class Assignment4 {

	public static void main(String[] args) {
		/*
		 * 		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("http://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
1.	Xpath for HOME FORM Tab
	WebElement homeTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));			---index
	WebElement homeTab=driver.findElement(By.xpath("(//a[contains(@href,'index.php')])[1]"));			---contains
	WebElement homeTab=driver.findElement(By.xpath("(//a[starts-with(@href,'ind')])[1]"));			--starts-with
	WebElement homeTab=driver.findElement(By.xpath("//a[text()='Home']"));			---text
	WebElement homeTab=driver.findElement(By.xpath("//a[contains(text(),'Home')]");			---text &contains
	WebElement homeTab=driver.findElement(By.xpath("//a[@class='nav-link' and @href='index.php']"));			---logical operator
		
		
2.	Xpath for INPUT FORM Tab
	WebElement inputFormTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));				---index
	WebElement inputFormTab=driver.findElement(By.xpath("(//a[contains(@href,'simple-form-demo.php')])[1]"));			---contains
	WebElement inputFormTab=driver.findElement(By.xpath("(//a[starts-with(@href,'sim')])[1]"));			---starts-with
	WebElement inputFormTab=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));			---text
	WebElement inputFormTab=driver.findElement(By.xpath("//a[contains(text(),'nput')][1]");			---text &contains
	WebElement inputFormTab=driver.findElement(By.xpath("//a[@class='nav-link' and @href='simple-form-demo.php']"));			---logical operator
		
		
3.	Xpath for Date PickersTab
	WebElement datePickersTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[3]"));				---index
	WebElement datePickersTab=driver.findElement(By.xpath("(//a[contains(@href,'date-picker.php')])[1]"));			---contains
	WebElement datePickersTab=driver.findElement(By.xpath("//a[starts-with(@href,'date')][1]"));			---starts-with
	WebElement datePickersTab=driver.findElement(By.xpath("(//a[contains(text(),'Date')])[1]");			---text &contains
	WebElement datePickersTab=driver.findElement(By.xpath("(//a[@class='nav-link' or @href='date-picker.php'])[3]"));			--logical operator
		
		
4.	Xpath for TABLE Tab
	WebElement tableTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[4]"));				---index
	WebElement tableTab=driver.findElement(By.xpath("(//a[contains(@href,'table-pagination.php')])[1]"));			---contains
	WebElement tableTab=driver.findElement(By.xpath("//a[starts-with(@href,'table')][1]"));			---starts-with
	WebElement tableTab=driver.findElement(By.xpath("((//a[contains(text(),'able')])[1]");			---text &contains
	WebElement tableTab=driver.findElement(By.xpath("(//a[@class='nav-link' or @href='table-pagination.php'])[4]"));			---logical operator
		
		
5.	Xpath for PROGRESS BARS Tab
	WebElement progressBarTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[5]"));				index---
	WebElement progressBarTab=driver.findElement(By.xpath("(//a[contains(@href,'jquery-progress-bar.php')])[1]"));			---contains
	WebElement progressBarTab=driver.findElement(By.xpath("//a[starts-with(@href,'jquery')][1]"));			---starts-with
	WebElement progressBarTab=driver.findElement(By.xpath("(//a[contains(text(),'Bar')])[1]");			---text &contains
	WebElement progressBarTab=driver.findElement(By.xpath("(//a[@class='nav-link' and @href='jquery-progress-bar.php'])"));			---logical operator

		
		
6.	Xpath for ALERTS AND  MODALS Tab
	WebElement alertsAndModalsTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[6]"));				---index
	WebElement alertsAndModalsTab=driver.findElement(By.xpath("(//a[contains(@href,'bootstrap-alert.php')])[1]"));			---contains
	WebElement alertsAndModalsTab=driver.findElement(By.xpath("//a[starts-with(@href,'bootstrap')][1]"));			---starts-with
	WebElement alertsAndModalsTab=driver.findElement(By.xpath("(//a[contains(text(),'Modals')])[1]");			---text &contains
	WebElement alertsAndModalsTab=driver.findElement(By.xpath("(//a[@class='nav-link' and @href='bootstrap-alert.php'])"));			---logical operator

		
7.	Xpath for LIST BOX Tab
	WebElement listBoxTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[7]"));				---index
	WebElement listBoxTab=driver.findElement(By.xpath("(//a[contains(@href,'bootstrap-dual-list.php')])[1]"));			---contains
	WebElement listBoxTab=driver.findElement(By.xpath("(//a[starts-with(@href,'bootstrap')])[2]"));			---starts-with
	WebElement listBoxTab=driver.findElement(By.xpath("(//a[contains(text(),'Box')])[1]");			---text &contains
	WebElement listBoxTab=driver.findElement(By.xpath("(//a[@class='nav-link' and @href='bootstrap-dual-list.php'])"));			---logical operator
		
		
8.	Xpath for OTHERS Tab
	WebElement othersTab=driver.findElement(By.xpath("(//a[@class='nav-link'])[8]"));				---index
	WebElement othersTab=driver.findElement(By.xpath("(//a[contains(@href,'drag-drop.php')])[1]"));			---contains
	WebElement othersTab=driver.findElement(By.xpath("//a[starts-with(@href,'drag')]"));			---starts-with
	WebElement othersTab=driver.findElement(By.xpath("//a[contains(text(),'thers')]");			---text &contains
	WebElement othersTab=driver.findElement(By.xpath("(//a[@class='nav-link' and @href='drag-drop.php'])"));			---logical operator
		
		
		
9.	Xpath for SIMPLE FORM DEMO Tab

	WebElement simpleFormDemoLink=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[2]"));				---index
	WebElement simpleFormDemoLink=driver.findElement(By.xpath("(//a[contains(@href,'simple-form-demo.php')])[1]"));			---contains
	WebElement simpleFormDemoLink=driver.findElement(By.xpath("(//a[starts-with(@href,'simple')])[1]");		---starts-with
	WebElement simpleFormDemoLink=driver.findElement(By.xpath("(//a[contains(text(),'Input')])[1]");			---text &contains
	WebElement simpleFormDemoLink=driver.findElement(By.xpath("//a[@class='nav-link' and @href='simple-form-demo.php']"));		---logical operator

10.	Xpath for Select Input Tab:
	WebElement selectInputLink=driver.findElement(By.xpath("//a[@href='select-input.php']"));				---index
	WebElement selectInputLink=driver.findElement(By.xpath("//a[contains(@href,'select-input.php')]"));			---contains
	WebElement selectInputLink=driver.findElement(By.xpath("//a[starts-with(@href,'select')]");		---starts-with
	WebElement selectInputLink=driver.findElement(By.xpath("//a[contains(text(),'Input')]");			---text &contains

	
11.	Xpath for Single Input Field Tab:
	WebElement singleInputFieldText=driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]")); //contains

12.	Xpath for Enter message TextBox:
	WebElement messagetextBox=driver.findElement(By.xpath("//input[@id='single-input-field']”));                  ---index
	WebElement messagetextBox=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]");               ---contains
	WebElement messagetextBox=driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]");              ---starts-with
	WebElement messagetextBox=driver.findElement(By.xpath("//input[@placeholder='Message' and @id='single-input-field']")); ---- logical operator

13.	Xpath for SHOW MESSAGE BUTTON:
	WebElement showMessageBtn= driver.findElement(By.xpath("//button[@id='button-one']"));                                         ---index
	WebElement showMessageBtn= driver.findElement(By.xpath("//button[text()='Show Message']"):                                     ---text
	WebElement showMessageBtn= driver.findElement(By.xpath("//button[contains(text(),'Show ')]"):                             ---contains &text
	WebElement showMessageBtn= driver.findElement(By.xpath("(//button[@id='button-one' or @type='button'])[2]");   ---- logical operator

14.	Xpath for YOUR MESSAGE: Text:
	WebElement yourMessageText= driver.findElement(By.xpath("//div[@id='message-one']"));                        ---index
	WebElement yourMessageText= driver.findElement(By.xpath("//div[contains(text(),'Your')]");                     ---contains &text   
	WebElement yourMessageText= driver.findElement(By.xpath("//div[@id='message-one' and @class='my-2']");                          --- logical operator

		
		


		 */

	}

}
