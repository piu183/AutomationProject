package AutomationPractice;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandelSelectTag extends BrowserSetup {
    public HandelSelectTag() {
    }

    @Test
    public void testSelectedOption() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000L);
        Select select = new Select(getElement(By.id("dropdown-class-example")));
        select.selectByVisibleText("Option2");
        Thread.sleep(2000L);
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000L);
        select.selectByValue("option1");
        Thread.sleep(2000L);
        clickOnElement(By.id("dropdown-class-example"));
        Thread.sleep(2000L);
        select.selectByIndex(3);
        Thread.sleep(2000L);
        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> options = select.getOptions();
        Iterator var3 = options.iterator();

        while(var3.hasNext()) {
            WebElement option = (WebElement)var3.next();
            System.out.println(option.getText());
        }

    }
}
