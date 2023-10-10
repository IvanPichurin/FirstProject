package page.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Constants.Constants.URLS.START_PAGE_URL;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public void openURL (String url){
        driver.get(url);
    }

    public void openStratPage(){
        openURL(START_PAGE_URL);
    }




    public WebElement findElement(String locator){
        WebElement element = driver.findElement(By.xpath(locator));
        return element;
    }
    public List<WebElement> findElements(String locator){
        return driver.findElements(By.xpath(locator));
    }

    public void click (String locator) {


        findElement(locator).click();
    }

    public void clear (String locator){
        findElement(locator).clear();
    }
    public void  sendKeys (String locator, String text){
        findElement(locator).sendKeys();
    }
    public void sendKeysSwitchClear (String locator, String text){
        clear(locator);sendKeys(locator,text);
    }
    public String getText(String locator){
        return findElement(locator).getText();
    }
}
