import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    String userNameTextBoxId="authIdentity-inp";
    String passTextBoxId="authPassword-inp";
    String loginBtnLogin="authLoginBtn";


    public void setUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(userNameTextBoxId)));
        element.sendKeys(username);
        //driver.findElement(By.id(userNameTextBoxId)).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(By.id(passTextBoxId)).sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(By.id(loginBtnLogin)).click();
    }

}
