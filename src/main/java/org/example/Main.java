package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:\\webdriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
      /*  driver.get("http://ya.ru");
        WebElement we = driver.findElement(By.id("text"));
        we.sendKeys("Selenium webdriver");
        WebElement b = driver.findElement(By.xpath("//button[@type='submit']"));
        b.click();
*/
int a;
   int aa;
            driver.get("https://demoqa.com/droppable");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
           WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));



            Actions builder = new Actions(driver);
          //  builder.dragAndDrop(source, target).perform();
        builder.dragAndDropBy(source,300,100).build().perform();





    }
}