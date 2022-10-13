package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage page;
    @BeforeMethod
    public void setUp(){
       page = new HomePage(driver);

    }
    @Test(testName = "US 303- When problem_user logs in all items on homepage should display same images")
    public void test02(){
        page.userInput.sendKeys("problem_user");
        page.passwordInput.sendKeys("secret_sauce");
        page.loginButton.click();
    }
}
