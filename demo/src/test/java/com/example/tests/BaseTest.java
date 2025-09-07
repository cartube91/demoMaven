    package com.example.tests;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeMethod;

    public class BaseTest {

        
        

        protected WebDriver driver;

        @BeforeMethod
        public void setUp() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless=new");        // run headless
    options.addArguments("--disable-gpu");
    options.addArguments("--no-sandbox");          // required for Linux CI
    options.addArguments("--disable-dev-shm-usage"); // avoid /dev/shm issues
    options.addArguments("--window-size=1920,1080");
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--user-data-dir=/tmp/chrome-" + java.util.UUID.randomUUID()); // unique profile

    driver = new ChromeDriver(options);
    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
}

        @AfterMethod
        public void tearDown() {
            if(driver != null) {
                driver.quit();
            }

            
        }
    }
