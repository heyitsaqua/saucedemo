package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckOutClass extends BaseTest {
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }
    @Test(testName = "US 308 - Checkout: Your Information")
    public void test01() {
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();
        Assert.assertTrue(driver.findElement(By.id("first-name")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("last-name")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("postal-code")).isDisplayed());
    }
}
