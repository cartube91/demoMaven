package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


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
    public boolean isProductDisplayed(String productName) {
    // Example using Selenium
    try {
        WebElement product = driver.findElement(By.xpath("//h2[text()='" + productName + "']"));
        return product.isDisplayed();
    } catch (NoSuchElementException e) {
        return false;
    }
}



}
