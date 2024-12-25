//package TestPages;
//
//import dev.failsafe.internal.util.Assert;
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.jupiter.api.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
////import org.junit.jupiter.api.Before;
//
//
//
//
//public class CrashBrowserTest {
//
//    private static final Logger log = LoggerFactory.getLogger(CrashBrowserTest.class);
//    static WebDriver driver;
//
//    @BeforeAll
//    static void setUp() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://digitalschool-front.sandpod.ir/javid");
//    }
//
////    @Test
////   public  void validateTile(){
////       String title = driver.getTitle();
////       Assert.isTrue(title.equals("Podia"), "Title is not correct");
////   }
//
////    @Test
////    public void testAppearLoginPage() {
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
////        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(
////                By.cssSelector("button.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary")));
////
////        element.click();
////
////        String url= driver.getCurrentUrl();
////        System.out.println(url);
////    }
//
//    @Test
//    void validateLogin() {
//        testAppearLoginPage();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement authIdentityinpelement=wait.until(ExpectedConditions.elementToBeClickable(
//                By.id("authIdentity-inp")));
//        authIdentityinpelement.click();
//        driver.findElement(By.id("authIdentity-inp")).clear();
//        driver.findElement(By.id("authIdentity-inp")).sendKeys("m.fathian");
//        driver.findElement(By.id("authPassword-inp")).clear();
//        driver.findElement(By.id("authPassword-inp")).sendKeys("Mm@13661366");
//        driver.findElement(By.id("authLoginBtn")).click();
//    }
//
//    @AfterAll
//    static void afterAll() {
//        driver.quit();
//    }
//}
