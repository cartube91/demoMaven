package com.example.tests;

import org.testng.annotations.Test;

import com.example.Pages.LoginPage;
import com.example.Pages.productPage;

public class searchProduct extends BaseTest     {

        @Test
            public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("john.which@yahoo.com", "1234");
            }

        
        public void searchProductTest() {
            productPage productPageObj = new productPage(driver);
            productPageObj.searchProduct("MacBook");
        }           
    
}
