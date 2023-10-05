package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.manage().window().maximize();

       driver.get("https://demoqa.com/text-box");

       WebElement userNameInput = driver.findElement(By.xpath("//input[@id='userName']"));

       userNameInput.sendKeys("Ivan");

       WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));

       email.sendKeys("ivan.pichurin@gmail.com");

        WebElement CurrentAddress = driver.findElement(By.xpath("//input[@id='currenAddress']"));

        CurrentAddress.sendKeys("123");


        WebElement PermanentAddress = driver.findElement(By.xpath("//input[@id='permanentAddress']"));

        PermanentAddress.sendKeys("ivan.pichurin@gmail.com");

        WebElement button = driver.findElement(By.xpath("//button[@id='btn btn-primary']"));
button.click();
    }
}