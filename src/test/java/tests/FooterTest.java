package test;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FooterTest extends BaseTest {

 @BeforeMethod(alwaysRun = true)
         public void setUp() {
     driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
     driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
 }

    @Test(testName ="US 305 - Footer of the page")
    public void test01(){

        String expected = "© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actual = driver.findElement(By.xpath("//div[@class='footer_copy']")).getText();

        Assert.assertEquals(actual, expected);

    }


}
