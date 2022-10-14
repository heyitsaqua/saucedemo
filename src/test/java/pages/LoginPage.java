package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "user-name")
    public WebElement userInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    @FindBy(className = "shopping_cart_link")
    public WebElement ShoppingCartButton;
    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement errorText;
}

