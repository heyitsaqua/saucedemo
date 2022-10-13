package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    private HomePage homePage;

    @Test(testName = "US 301 - Verify standard_user can login with right password")
    public void test01() {
        homePage.userInput.sendKeys("standard_user");
        homePage.passwordInput.sendKeys("secret_sauce");
        homePage.loginButton.click();

        Assert.assertTrue(homePage.ShoppingCartButton.isDisplayed());
    }

    @Test(testName = "US 302 - Verify message with locked out user")
    public void test02() {
        homePage.userInput.sendKeys("locked_out_user");
        homePage.passwordInput.sendKeys("secret_sauce");
        homePage.loginButton.click();
        String expected = "Epic sadface: Sorry, this user has been locked out.";
        String actual = homePage.errorText.getText();
        Assert.assertEquals(actual, expected);
    }
}
