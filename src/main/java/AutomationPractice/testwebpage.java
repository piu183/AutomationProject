package AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testwebpage extends BrowserSetup {
    public testwebpage() {
    }

    @Test
    public void testpage() throws InterruptedException {
        this.browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autocompleteTextBox = this.browser.findElement(By.id("autocomplete"));
        autocompleteTextBox.sendKeys(new CharSequence[]{"hello"});
        WebElement option1 = this.browser.findElement(By.name("checkBoxOption1"));
        option1.click();
        WebElement radioBtn = this.browser.findElement(By.className("radioButton"));
        radioBtn.click();
        WebElement title = this.browser.findElement(By.tagName("h1"));
        System.out.println(title.getText());
        Thread.sleep(5000L);
        this.browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(5000L);
        this.browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(5000L);
    }
}


