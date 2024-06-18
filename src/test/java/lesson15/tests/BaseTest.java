package lesson15.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson15.pages.ReplenishmentPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    ReplenishmentPage replenishmentPage;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        replenishmentPage = new ReplenishmentPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
