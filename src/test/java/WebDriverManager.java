import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
        private static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver == null) {
                // Initialize WebDriver here
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                driver = new ChromeDriver();
            }
            return driver;
        }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }
