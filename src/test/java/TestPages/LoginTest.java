package TestPages;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginTest {

    private  static WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver =WebDriverManager.getDriver();
        driver.get("https://digitalschool-front.sandpod.ir/javid");
    }

    @Test
    void testLogin() {
        Login login=new Login();
        System.err.println(login);
    }



}
