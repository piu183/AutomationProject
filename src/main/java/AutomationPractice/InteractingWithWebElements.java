package AutomationPractice;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends BrowserSetup {
    public InteractingWithWebElements() {
    }

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        getElement(By.xpath("//label[@for='radio1']")).click();
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys(new CharSequence[]{"Hello"});
        String optionName = getElement(By.xpath("//label[@for='bmw']")).getText();
        System.out.println(optionName);
        Thread.sleep(2000L);
        getElement(By.xpath("//input[@id='autocomplete']")).clear();
        Thread.sleep(2000L);
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys(new CharSequence[]{"Hi"});
        String placeholder = getElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);
        String frontSize = getElement(By.xpath("//a[@id='opentab']")).getCssValue("front-size");
        System.out.println(frontSize);
        Boolean isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        getElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        System.out.println(isSelect);
        Boolean isDisplay = displayedStatus(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isDisplay);
        getElement(By.id("hide-textbox")).click();
        isDisplay = displayedStatus(By.xpath("//input[@id='displayed-text']"));
        System.out.println(isDisplay);
        browser.get("https://www.google.com/");
        Boolean isEnabled = getElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        System.out.println(isEnabled);
    }
}
