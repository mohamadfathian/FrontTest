package Page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PreLoginPage {

    private  WebDriver driver;

    public PreLoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void validateTile() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.isTrue(title.equals("Podia"), "Title is not correct");
    }

    public LoginPage clickLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'ورود')]")));

        element.click();
        return new LoginPage(driver);
    }
}
