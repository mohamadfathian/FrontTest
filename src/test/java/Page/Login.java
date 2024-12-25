package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login {

    private WebDriver driver;
    Locators locators=new Locators();

    public Login(WebDriver driver) {
        this.driver = driver;
    }


    public void setUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(locators.getUserNameTextBoxId())));
        element.sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(By.id(locators.getPassTextBoxId())).sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(By.id(locators.getLoginBtnLogin())).click();
    }

}
