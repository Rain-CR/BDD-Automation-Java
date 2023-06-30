package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    private static WebDriver driver;
    private static WebDriverWait wait;
    WebDriverWait explicitWait = new WebDriverWait(driver,10L);

    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10L);
    }

    public static void destroyDriver() {
        if (driver != null) {
            driver.quit();
        } else {
            System.out.println("Driver is null!");
        }

        driver = null;
        wait = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }
    public static String geturl(){return driver.getCurrentUrl();}

}
