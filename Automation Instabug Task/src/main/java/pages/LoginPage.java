package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginBtn;

    @FindBy(css = "h3")
    public WebElement errorMsg;

    public ProductsPage loginBtnClick(){
        loginBtn.click();
        return new ProductsPage(driver);
    }

    public void setUsername(String name) {
        username.clear();
        username.sendKeys(name);
    }

    public void setPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public String readErrorText(){
       return errorMsg.getText();
    }


}
