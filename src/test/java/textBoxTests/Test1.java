package textBoxTests;

import Browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import static Constants.Constants.URLS.START_PAGE_URL;

public class Test1 {
private WebDriver driver;
basePage

    @BeforeClass
    public void beforeClass(){
       driver = Browser.createDriver();
        driver.get(START_PAGE_URL);
    }
@AfterClass
    public void AfterClass(){
        driver.quit();
}

@Test
    public void step_01(){
   basePage.click();

    WebElement textBox = driver.findElement(By.xpath("//li[@id='item-0']"));
   // textBox.click();
    WebElement currenText = driver.findElement(By.xpath("//div[@id='Ad.Plus-728x90']"));

    String text = currenText.getText();

    String textEt = "1234";

    Assert.assertEquals(text,textEt);
}

}
