package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    private LoginPage loginpage;

    @Test(testName = "US 301 - Verify standard_user can login with right password")
    public void test01() {
        loginpage.userInput.sendKeys("standard_user");
        loginpage.passwordInput.sendKeys("secret_sauce");
        loginpage.loginButton.click();

        Assert.assertTrue(loginpage.ShoppingCartButton.isDisplayed());
    }

    @Test(testName = "US 302 - Verify message with locked out user")
    public void test02() {
       loginpage.userInput.sendKeys("locked_out_user");
        loginpage.passwordInput.sendKeys("secret_sauce");
        loginpage.loginButton.click();
        String expected = "Epic sadface: Sorry, this user has been locked out.";
        String actual = loginpage.errorText.getText();
        Assert.assertEquals(actual, expected);
    }
}
