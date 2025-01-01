package TestPages;

import Page.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import Page.*;

public class SeleniumTest {

    private static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver = WebDriverManager.getDriver();
        driver.get("https://digitalschool-front.sandpod.ir/javid");
    }

    @Test
    void testSelenium() {
        PreLoginPage preLoginPage = new PreLoginPage(driver);
        preLoginPage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin("mo.fathian","Mm@13661366");
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}