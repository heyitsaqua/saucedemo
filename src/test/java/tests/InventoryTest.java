package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class InventoryTest extends BaseTest {


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(testName = "US306: Filter options", description = "validate that given options appear when you go to apply filters")
    public void test01() {
        String[] expectedOptions = new String[] {"Name (A to Z)", "Name (Z to A)", "Price (low to high)", "Price (high to low)"};
        List<WebElement> options = driver.findElements(By.tagName("option"));
        for (int i = 0; i < options.size()-1; i++) {
            Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
        }
    }
}
