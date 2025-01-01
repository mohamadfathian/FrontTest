package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    Locators locators=new Locators();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By txtAuthIdentityInp=By.id("authIdentity-inp");
    private By txtAuthPasswordInp=By.id("authPassword-inp");
    private By txtAuthLoginBtn=By.id("authLoginBtn");

    public PanelsPage performLogin(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("authIdentity-inp")));
        driver.findElement(txtAuthIdentityInp).sendKeys(username);
        driver.findElement(txtAuthPasswordInp).sendKeys(password);
        driver.findElement(txtAuthLoginBtn).click();
        return new PanelsPage(driver);
    }
}
