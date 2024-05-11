package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BrowserSetup {
    public WebDriver browser;

    public BrowserSetup() {
    }

    @BeforeSuite
    public void startBrowser() {
        this.browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void quitBrowser() {
        this.browser.quit();
    }

    public WebElement getElement(By locator) {
        return this.browser.findElement(locator);
    }

    public void writeOnElement(By locator, String text) {
        this.getElement(locator).clear();
        this.getElement(locator).sendKeys(new CharSequence[]{text});
    }

    public Boolean displayedStatus(By locator) {
        return this.getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator) {
        this.getElement(locator).click();
    }
}
