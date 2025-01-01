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
        PreLoginPage preLogin = new PreLoginPage(WebDriverManager.getDriver());
        preLogin.validateTile();
        preLogin.testLoginBtn();
        LoginPage loginPage = new LoginPage(WebDriverManager.getDriver());
        loginPage.setUserName("m.fathian");
        loginPage.setPassword("Mm@13661366");
        loginPage.clickLoginBtn();
        PanelsPage panelsPage = new PanelsPage(WebDriverManager.getDriver());
        panelsPage.checkPanel();
    }

    @AfterAll
    static void afterAll() {
        driver.quit();
    }
}