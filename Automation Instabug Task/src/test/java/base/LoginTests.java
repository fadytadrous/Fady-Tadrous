package base;


import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import static org.testng.Assert.*;

public class LoginTests extends base{

    //create page object for login page

    @Test(priority = 10)
    public void testSuccessfullLogin(){
 
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");

        //if user is logged in products page is loaded
        ProductsPage productsPage = loginPage.loginBtnClick();
        //assert on presence of products in the title
        assertTrue(productsPage.pageSecondaryTitle.getText().equals("Products"),"User is logged in");
    }

    @Test(priority=1)
    public void testInvalidUsernameAndInvalidPassLogin(){
 
        loginPage.setUsername("asd");
        loginPage.setPassword("123");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username and password do not match any user in this service"),
                "Error message for invalid username and password is correct");
    }

    @Test(priority = 3)
    public void testInvalidUsernameAndValidPassLogin(){
        loginPage.setUsername("asd");
        loginPage.setPassword("secret_sauce");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username and password do not match any user in this service"),
                "Error message for invalid username and password is correct");
    }

    @Test(priority=2)
    public void testValidUsernameAndInvalidPassLogin(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("123");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Username and password do not match any user in this service"),
                "Error message for invalid username and password is correct");
    }

    @Test(priority=4)
    public void testLockedoutUser(){
        loginPage.setUsername("locked_out_user");
        loginPage.setPassword("secret_sauce");
        loginPage.loginBtn.click();
        assertTrue(loginPage.readErrorText().contains("Sorry, this user has been locked out."),
                "Error message for locked out user is correct");
    }
}
