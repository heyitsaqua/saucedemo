package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

public class ProblemUserClass extends BaseTest {
    HomePage page;


    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    @Test(testName = "US 303- When problem_user logs in all items on homepage should display same images")
    public void test01() {

        List<WebElement> itemsPic = driver.findElements(By.
                xpath("//img[@class='inventory_item_img']"));
        itemsPic.forEach(buttons -> buttons.isDisplayed());


    }
}
