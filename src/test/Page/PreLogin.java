import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PreLogin {

    private  static WebDriver driver;

    @BeforeAll
    static void beforeAll() {

        driver =WebDriverManager.getDriver();
        driver.get("https://digitalschool-front.sandpod.ir/javid");

    }

    @Test
    void testLoginBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'ورود')]")));

        element.click();
    }

    @Test
    public void validateTile() {
        String title = driver.getTitle();
        Assert.isTrue(title.equals("POD SandBox Login"), "Title is not correct");
    }

    @AfterAll
    static void afterAll() {
        WebDriverManager.closeDriver();
    }
}
