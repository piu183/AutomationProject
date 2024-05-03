package AutomationPractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleBrowser {
    public HandleBrowser() {
    }

    @Test
    public void workWithBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200L);
        driver.get("https://www.google.com/");
        Thread.sleep(2000L);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000L);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        driver.close();
        Thread.sleep(2000L);
        driver.quit();
    }

    @Test
    public void testWindowHandles() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[text()='Open Window']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[text()='Open Tab']")).click();
        Thread.sleep(2000L);
        System.out.println(driver.getWindowHandles());
        List<String> window_handles = new ArrayList(driver.getWindowHandles());
        Iterator var3 = window_handles.iterator();

       while(var3.hasNext()) {
            String handel = (String)var3.next();
        System.out.println(handel);
        }

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("++++++++++++++++++");
        driver.switchTo().window((String)window_handles.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window((String)window_handles.get(0));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window((String)window_handles.get(2));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
