import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Deriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void setDriver()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/rohinibirari/Downloads/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @BeforeMethod
    public void getURl()
    {
        driver.navigate().to("http://spree-vapasi.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void quitURl()
    {
        driver.quit();
    }

}
