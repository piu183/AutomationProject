package AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleiFrame extends BrowserSetup {
    public HandleiFrame() {
    }

    @Test
    public void test_Scroll() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)browser;
        WebElement scrollToElement = getElement(By.xpath("//legend[text()='iFrame Example']"));
        js.executeScript("arguments[0].scrollIntoView();", scrollToElement );
        Thread.sleep(2000L);
        //browser.switchTo().frame("courses-iframe");
        //browser.switchTo().frame("iframe-name");
        //browser.switchTo().frame(getElement(By.id("courses-iframe")));
        browser.switchTo().frame(0);
        getElement(By.xpath("//a[text()='Register']"));
        //browser.switchTo().parentFrame();
        browser.switchTo().defaultContent();
        getElement(By.xpath("//legend[text()='iFrame Example']"));

    }
}

