package testNG_Programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class TableHandling {
    WebDriver driver;

   /* @Test
    public void verifyNumberOfRowsAndColumns() {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
        int rowCount = rows.size();
        int columnCount = column.size();
        System.out.println(rowCount);
        System.out.println(columnCount);
    }

    @Test
    public void verifyValueOfFifthRowFirstColumn() {
        WebElement apolloHospital = driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[1]"));
        System.out.println(apolloHospital.getText());
    }*/

    @Test
    public void  findIslandTrading() {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//th"));
        int rowCount = rows.size();
        int columnCount = column.size();
 

        for (int r = 1; r < rowCount; r++) {
            for (int c = 1; c < columnCount; c++) {
                String value = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[" + (r + 1) + "]//td[" + c + "]")).getText();
                if (value.equalsIgnoreCase("Island Trading")) {
                    System.out.println(r + " " + c);
                    break;
                }
            }

            }
        }

    
    

    @BeforeClass
    public void beforeTest() {
        driver = new EdgeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void afterTest() {
        driver.quit();
    }
}
