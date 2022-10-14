package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }

    @Test(testName = "US307: Social media buttons. Verify there are 3 social media buttons are present: twitter, facebook and linkedIn")
    public void test01(){
        if(driver.findElement(By.xpath
                ("//li[@class='social_twitter']")).isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        if(driver.findElement(By.xpath
                ("//li[@class='social_facebook']")).isDisplayed()){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        if(driver.findElement(By.xpath
                ("//li[@class='social_linkedin']")).isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");


        }
    }
}