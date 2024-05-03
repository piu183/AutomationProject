package AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class handelScroll extends BrowserSetup {
    public handelScroll() {
    }

    @Test
    public void test_Scroll() throws InterruptedException {
       browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("window.scroll(0, document.body.scrollHeight);", new Object[0]);
        Thread.sleep(2000L);
        js.executeScript("window.scroll(document.body.scrollHeight, 0);", new Object[0]);
        Thread.sleep(2000L);
        WebElement hoverElement = getElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView();", new Object[]{hoverElement});
        Thread.sleep(2000L);
    }
}

