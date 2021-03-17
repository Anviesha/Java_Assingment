package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.util.List;

public class Search_Page extends Base_Page
{
    public Search_Page(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void searchAllElements(String brandName)
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(brandName)));
        webDriver.findElement(By.partialLinkText(brandName)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("#products"))));
        WebElement product = webDriver.findElement(By.cssSelector("#products"));

        List<WebElement> listOfElement = product.findElements(By.xpath("//div[contains(@id,'products_')]"));

        for (int i = 0; i < listOfElement.size(); i++) {
            String text = listOfElement.get(i).getText();
            System.out.println(text);
            Assert.assertTrue(text.contains(brandName), brandName);
        }
    }
}

