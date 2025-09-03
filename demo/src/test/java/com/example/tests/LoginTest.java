package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.Pages.LoginPage;

public class LoginTest extends BaseTest {



    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("ohn.which@yahoo.com", "John@123");

        // For simplicity, assert that login redirects to the account page
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("route=account/account"), "Login failed or URL mismatch");
    }
}
