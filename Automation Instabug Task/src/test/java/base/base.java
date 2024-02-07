package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

/**
 * Base class for Selenium test automation framework.
 * Responsible for setting up and tearing down the WebDriver instance.
 */
public class base {

    protected WebDriver driver; // WebDriver instance to interact with the browser

    protected LoginPage loginPage; // Object of the LoginPage class to access login page elements

    /**
     * Method to set up the WebDriver instance before executing tests.
     * Initializes WebDriver, navigates to the application URL, and maximizes the browser window.
     */
    @BeforeClass
    public void setup(){

        // Setup WebDriver using WebDriverManager for Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Navigate to the application URL and maximize the window
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Initialize LoginPage object with WebDriver instance
        loginPage = new LoginPage(driver);
    }

    /**
     * Method to tear down the WebDriver instance after executing tests.
     * Quits the WebDriver session.
     */
    @AfterClass
    public void tearDown(){
        // Quit the WebDriver session
        driver.quit();
    }
}
