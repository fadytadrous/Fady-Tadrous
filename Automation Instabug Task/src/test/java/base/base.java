package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;


public class base {

    protected WebDriver driver;

    protected LoginPage loginPage;

    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
