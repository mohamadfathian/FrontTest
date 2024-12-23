
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {

    private  static WebDriver driver;

    @BeforeAll
    static void beforeAll() {

        driver =WebDriverManager.getDriver();
        driver.get("https://digitalschool-front.sandpod.ir/javid");

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

    @Test
    void testLogin() {
        Login login = new Login(WebDriverManager.getDriver());
        login.setUserName("m.fathian");
        login.setPassword("Mm@13661366");
        login.clickLoginBtn();

        try {
            Thread.sleep(2000); // Sleep for 2 second
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testShowPanelPage() {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'خروج از سیستم')]"));
        Assert.isTrue(element.isDisplayed(), "panel page is not displayed");
    }

    @AfterAll
    static void afterAll() {
        WebDriverManager.closeDriver();
    }
}
