import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class SpreeTesting extends Deriver{

    @Test
    public void login_Spree()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("nav-link")));
        driver.findElement(By.className("nav-link")).click();
        driver.findElement(By.cssSelector("input[id='spree_user_email']")).sendKeys("vapasi@gmail.com");
        driver.findElement(By.cssSelector("input[id='spree_user_password']")).sendKeys("Movies@25");
        driver.findElement(By.cssSelector("input[name='commit']")).click();

    }

    @Test
    public void search_Ruby_Spree()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Ruby")));
        driver.findElement(By.partialLinkText("Ruby")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("#products"))));
        WebElement product = driver.findElement(By.cssSelector("#products"));

        List<WebElement> listOfElement = product.findElements(By.xpath("//div[contains(@id,'products_')]"));

        for(int i=0; i<listOfElement.size();i++)
        {
            String text = listOfElement.get(i).getText();
            Assert.assertTrue(text.contains("Ruby"),"Ruby");
        }
    }

    @Test
    public void search_Apache_Spree()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Apache")));
        driver.findElement(By.partialLinkText("Apache")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("#products"))));

        WebElement product = driver.findElement(By.cssSelector("#products"));

        List<WebElement> list = product.findElements(By.xpath("//div[contains(@id,'products_')]"));
        System.out.println(list.size());

        for (int i=0; i<list.size();i++)
        {
            String text = list.get(i).getText();

            Assert.assertTrue(text.contains("Apache"),"Apache");
        }
    }



    @Test
    public void logout_Spree()
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Logout")));
        driver.findElement(By.partialLinkText("Logout")).click();
    }
}
