package AutomationPractice;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandelAction extends BrowserSetup {
    public HandelAction() {
    }

    @Test
    public void testAction() throws InterruptedException {
       browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(browser);
        WebElement hoverElement = getElement(By.xpath("//button[@id='mousehover']"));
        actions.scrollToElement(hoverElement).build().perform();
        actions.clickAndHold(hoverElement).build().perform();
        actions.scrollToElement(getElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        actions.scrollByAmount(0, 100).build().perform();
        clickOnElement(By.xpath("//button[@id='mousehover']"));
        Thread.sleep(1000L);
        clickOnElement(By.xpath("//a[normalize-space()='Top']"));
        Thread.sleep(1000L);
       clickOnElement(By.id("dropdown-class-example"));
        actions.sendKeys(new CharSequence[]{Keys.ARROW_DOWN}).build().perform();
        Thread.sleep(1000L);
        actions.sendKeys(new CharSequence[]{Keys.ARROW_DOWN}).build().perform();
        Thread.sleep(1000L);
        actions.sendKeys(new CharSequence[]{Keys.ARROW_UP}).build().perform();
        Thread.sleep(1000L);
        actions.sendKeys(getElement(By.xpath("//input[@id='autocomplete']")), new CharSequence[]{"Hello"}).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys(new CharSequence[]{"a"}).keyUp(Keys.CONTROL).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys(new CharSequence[]{"c"}).keyUp(Keys.CONTROL).build().perform();
      getElement(By.xpath("//input[@id='name']")).sendKeys(new CharSequence[]{Keys.CONTROL, "v"});
        Thread.sleep(5000L);
    }
}

