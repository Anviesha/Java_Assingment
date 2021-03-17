package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Driver_Resource {
        public static WebDriver driver;
        public static WebDriverWait wait;


        @BeforeClass
        public void setDriver() {
            System.setProperty("webdriver.chrome.driver", "/Users/rohinibirari/Downloads/chromedriver");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
        }

        @BeforeMethod
        public void setURL() {
            driver.manage().deleteAllCookies();
            driver.navigate().to("https://spree-vapasi.herokuapp.com");
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
}


