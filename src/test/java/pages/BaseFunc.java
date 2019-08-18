package pages;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunc {
    WebDriver browser;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    public void goToPage(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }

    public List<WebElement> getElements(By locator) {
        return browser.findElements(locator);
    }

    public WebElement getElement(By locator) {
        Assert.assertFalse("There is no elements", getElements(locator).isEmpty());
        return browser.findElement(locator);
    }

    @AfterClass
    public void closeBrowser() {
        browser.close();
    }
}
