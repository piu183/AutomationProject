package AutomationPractice;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvancedLocator extends BrowserSetup {
    public AdvancedLocator() {
    }

    @Test
    public void testPageLocator() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(1000L);
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(1000L);
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        Thread.sleep(1000L);
       browser.findElement(By.cssSelector(".radioButton")).click();
        Thread.sleep(1000L);
        String h1TexT_CSS = browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("Get By CSS SELECTOR: " + h1TexT_CSS);
        String h1TexT_XPATH = browser.findElement(By.xpath("//h1")).getText();
        System.out.println("Get By XPATH:" + h1TexT_XPATH);
        browser.findElement(By.xpath("//*[@value='radio3']")).click();
        Thread.sleep(1000L);
        String text = browser.findElement(By.cssSelector("div[id='checkbox-example'] > fieldset > legend")).getText();
        System.out.println(text);
        String text1 = browser.findElement(By.xpath("//div[@id='checkbox-example'] /fieldset/ legend")).getText();
        System.out.println(text1);
        browser.findElement(By.cssSelector("input[name='radioButton'][value='radio1']")).click();
        Thread.sleep(1000L);
        browser.findElement(By.xpath("//input[@name='radioButton' and @value='radio2']")).click();
        Thread.sleep(1000L);
        browser.findElement(By.cssSelector("input[placeholder^=\"Enter Your\"]")).sendKeys(new CharSequence[]{"Hello"});
        Thread.sleep(2000L);
        browser.findElement(By.xpath("//input[starts-with(@placeholder,\"Enter Your\")]")).sendKeys(new CharSequence[]{"Hello "});
        Thread.sleep(2000L);
        browser.findElement(By.cssSelector("input[placeholder*=\"Enter Your\"]")).sendKeys(new CharSequence[]{"Hello"});
        Thread.sleep(2000L);
        browser.findElement(By.xpath("//input[contains(@placeholder,\"Enter Your\")]")).sendKeys(new CharSequence[]{"Hello "});
        Thread.sleep(2000L);
        text = browser.findElement(By.xpath("//table[@name='courses']//tr/th[1]")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//table[@name='courses']//tr/th[2]")).getText();
        System.out.println(text);
        text = browser.findElement(By.xpath("//table[@name='courses']//tr/th[last()]")).getText();
        System.out.println(text);
        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody> tr >th:first-child")).getText();
        System.out.println(text);
        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody> tr >th:nth-child(2)")).getText();
        System.out.println(text);
        text = browser.findElement(By.cssSelector("table[name='courses'] > tbody> tr >th:last-child")).getText();
        System.out.println(text);
        List<WebElement> tableData = browser.findElements(By.xpath("//table[@name='courses']//td"));
        System.out.println(tableData.size());
        Iterator var6 = tableData.iterator();

        while(var6.hasNext()) {
            WebElement e = (WebElement)var6.next();
            System.out.println(e.getText());
        }

    }
}
