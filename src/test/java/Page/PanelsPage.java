package Page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PanelsPage {

    private WebDriver driver;
    Locators locators=new Locators();

    public PanelsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkPanel() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='خروج از سیستم']")));
//        element.sendKeys(username);
//        WebElement element=driver.findElement(By.xpath("//span[text()='خروج از سیستم']"));
        System.out.println(element.getText());
        Assertions.assertTrue(element.isDisplayed());
    }
}
