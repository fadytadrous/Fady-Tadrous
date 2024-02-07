package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object Model (POM) class representing the Login Page of the application.
 * Contains methods and elements to interact with the login page.
 */
public class LoginPage {

    private WebDriver driver; // WebDriver instance to interact with the browser

    /**
     * Constructor to initialize the LoginPage object with WebDriver instance.
     * @param driver WebDriver instance
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement username; // Username input field element

    @FindBy(id = "password")
    public WebElement password; // Password input field element

    @FindBy(id = "login-button")
    public WebElement loginBtn; // Login button element

    @FindBy(css = "h3")
    public WebElement errorMsg; // Error message element

    /**
     * Method to perform a login by clicking the login button.
     * @return ProductsPage object representing the page after successful login
     */
    public ProductsPage loginBtnClick(){
        loginBtn.click();
        return new ProductsPage(driver);
    }

    /**
     * Method to set the username in the username input field.
     * @param name Username value
     */
    public void setUsername(String name) {
        username.clear();
        username.sendKeys(name);
    }

    /**
     * Method to set the password in the password input field.
     * @param pass Password value
     */
    public void setPassword(String pass) {
        //using ctrl+a+del instead of clear since it was more efficient
        // and there was a caching issue in the field
        password.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        password.sendKeys(pass);
    }

    /**
     * Method to read the error message displayed on the login page.
     * @return Error message text
     */
    public String readErrorText(){
        return errorMsg.getText();
    }
}
