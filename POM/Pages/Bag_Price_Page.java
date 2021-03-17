package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class    Bag_Price_Page extends Base_Page{

    public Bag_Price_Page(){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void search_bag_price_spree()
    {

        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Bags")));
        driver.findElement(By.partialLinkText("Bags")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("Price_Range_$15.00_-_$18.00")));

        String priceText =  driver.findElement(By.id("Price_Range_$15.00_-_$18.00")).getText();

        System.out.println("Text on price list:"+priceText);

        driver.findElement(By.id("Price_Range_$15.00_-_$18.00")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='btn btn-primary']")));
        driver.findElement(By.cssSelector("input[class='btn btn-primary']")).click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='products']")));
        WebElement productlist = driver.findElement(By.xpath("//div[@id='products']"));

        List<WebElement> list1 = productlist.findElements(By.xpath("//div[contains(@id,'product_')]"));

        for(int i=0; i< list1.size(); i++) {
            String text = list1.get(i).getText();
            String temp = text.trim().replace("$","");

            System.out.println(temp);

            double d = Double.parseDouble(text);
            System.out.println(d);
            Assert.assertTrue(d>=15 && d<=18);
        }
    }

}
