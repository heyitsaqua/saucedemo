package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();

    }

    @Test(testName = "US 309 - Add to cart")
    public void test01(){

        driver.findElement(By.id("item_4_title_link")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();


       Assert.assertTrue(driver.findElement(By.xpath("//div[@class='cart_item_label']")).isDisplayed());


    }
    @Test(testName = "US 310 - Remove from cart")
    public void test02(){
        driver.findElement(By.id("item_4_title_link")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='removed_cart_item']")).isEnabled());

    }
}
