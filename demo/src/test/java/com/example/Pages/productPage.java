package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class productPage {
    
    private WebDriver driver;
    private By searchInput = By.cssSelector("input[type='text'][name='search'].form-control.input-lg"); 
    // Constructor
    public productPage(WebDriver driver) {
        this.driver = driver;       

    }
    public void enterSearchText(String text) {
        driver.findElement(searchInput).sendKeys(text);
    }   

    public void clickSearchButton() {
        driver.findElement(searchInput).submit();
    }   

    public void searchProduct(String text) {
        enterSearchText(text);
        clickSearchButton();
    }       


}
