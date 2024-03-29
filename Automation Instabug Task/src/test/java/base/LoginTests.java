package base;

import org.testng.annotations.Test;
import pages.ProductsPage;

import static org.testng.Assert.*;

/**
 * Test class for validating login functionality of the application.
 * Inherits common setup and teardown methods from the Base class.
 */
public class LoginTests extends base{


    @Test(priority = 8)
    public void testSuccessfullLogin(){

        // Set username and password
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");

        //if user is logged in products page is loaded
        ProductsPage productsPage = loginPage.loginBtnClick();
        //assert on presence of products in the title
        assertTrue(productsPage.pageSecondaryTitle.getText().equals("Products"),"User is logged in");
    }

    @Test(priority=7)
    public void testInvalidUsernameAndInvalidPassLogin(){

        loginPage.setUsername("asd");
        loginPage.setPassword("123");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username and password do not match any user in this service"),
                "Error message for invalid username and password is correct");
    }
    @Test(priority=1)
    public void testEmptyUsernameAndEmptyPassLogin(){

        loginPage.setUsername("");
        loginPage.setPassword("");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username is required"),
                "Error message for invalid username and password is correct");
    }
    @Test(priority=3)
    public void testFilledUsernameAndEmptyPassLogin(){

        loginPage.setUsername("asd");
        loginPage.setPassword("");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Password is required"),
                "Error message for invalid username and password is correct");
    }
    @Test(priority=2)
    public void testEmptyUsernameAndValidPassLogin(){

        loginPage.setPassword("secret_sauce");
        loginPage.setUsername("");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username is required"),
                "Error message for invalid username and password is correct");
    }

    @Test(priority = 4)
    public void testInvalidUsernameAndValidPassLogin(){

        loginPage.setUsername("asd");
        loginPage.setPassword("secret_sauce");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username and password do not match any user in this service"),
                "Error message for invalid username and password is correct");
    }

    @Test(priority=5)
    public void testValidUsernameAndInvalidPassLogin(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("123");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username and password do not match any user in this service"),
                "Error message for invalid username and password is correct");
    }

    @Test(priority=6)
    public void testLockedoutUser(){
        loginPage.setUsername("locked_out_user");
        loginPage.setPassword("secret_sauce");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Sorry, this user has been locked out."),
                "Error message for locked out user is correct");
    }
}
