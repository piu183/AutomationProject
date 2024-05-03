package AutomationPractice;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandelAssertion extends BrowserSetup {
    public HandelAssertion() {
    }

    @Test
    public void testElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        getElement(By.xpath("//label[@for='radio1']")).click();
        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys(new CharSequence[]{"Hello"});
        String optionName = getElement(By.xpath("//label[@for='bmw']")).getText();
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(optionName, "Option1");
        softAssert.assertEquals(optionName, "Option1");
        Assert.assertEquals(1,1);

        System.out.println(optionName);

        getElement(By.xpath("//input[@id='autocomplete']")).clear();

        getElement(By.xpath("//input[@id='autocomplete']")).sendKeys(new CharSequence[]{"Hi"});
        String placeholder = getElement(By.xpath("//input[@id='name']")).getAttribute("placeholder");
        System.out.println(placeholder);
        String frontSize = getElement(By.xpath("//a[@id='opentab']")).getCssValue("front-size");
        System.out.println(frontSize);
        Boolean isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        Assert.assertFalse(isSelect);

        getElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        isSelect = getElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected();
        Assert.assertTrue(isSelect);
        Boolean isDisplay = displayedStatus(By.xpath("//input[@id='displayed-text']"));
        Assert.assertTrue(isDisplay);
        getElement(By.id("hide-textbox")).click();
        isDisplay = displayedStatus(By.xpath("//input[@id='displayed-text']"));
        Assert.assertFalse(isDisplay );

        browser.get("https://www.google.com/");
        Boolean isEnabled = getElement(By.xpath("//textarea[@id='APjFqb']")).isEnabled();
        Assert.assertTrue(isEnabled);
        softAssert.assertAll();
    }
}
