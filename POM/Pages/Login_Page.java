package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login_Page extends Base_Page {

        public Login_Page(WebDriver webDriver) {
            this.webDriver = webDriver;
            PageFactory.initElements(webDriver, this);
        }

        public void login_Spree(String user_name, String user_pass)
        {
            wait.until(ExpectedConditions.elementToBeClickable(By.className("nav-link")));
            driver.findElement(By.className("nav-link")).click();
            driver.findElement(By.cssSelector("input[id='spree_user_email']")).sendKeys(user_name);
            driver.findElement(By.cssSelector("input[id='spree_user_password']")).sendKeys(user_pass);
            driver.findElement(By.cssSelector("input[name='commit']")).click();

        }
}

