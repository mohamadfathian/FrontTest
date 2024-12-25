package TestPages;

import Page.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import Page.*;




public class LoginTest {

    private static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver = WebDriverManager.getDriver();
    }

    @Test
    void testLogin() {
        PreLogin preLogin = new PreLogin(WebDriverManager.getDriver());
        preLogin.validateTile();
        preLogin.testLoginBtn();
        Login login = new Login(WebDriverManager.getDriver());
        login.setUserName("m.fathian");
        login.setPassword("Mm@13661366");
        login.clickLoginBtn();
        Panels panels = new Panels(WebDriverManager.getDriver());
        panels.checkPanel();
    }

    static void afterAll() {
        driver.quit();
    }
}
