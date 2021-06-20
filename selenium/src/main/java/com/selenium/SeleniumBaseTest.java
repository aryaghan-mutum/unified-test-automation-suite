package com.selenium;

import com.selenium.constants.SeleniumConstants;
import com.selenium.webdriver.SeleniumWebDriverImpl;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public abstract class SeleniumBaseTest {

    public SoftAssertions softAssert;
    public WebDriver driver;

    @BeforeEach
    public void setup() throws Exception {
        createDriverInstance(BrowserType.CHROME);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public void createDriverInstance(String browser) throws Exception {
        if (browser.equalsIgnoreCase(BrowserType.FIREFOX)) {
            System.setProperty("webdriver.gecko.driver", SeleniumConstants.FIREFOX_DRIVER_PATH);
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase(BrowserType.CHROME)) {
            System.setProperty("webdriver.chrome.driver", SeleniumConstants.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
        } else {
            throw new Exception("Browser is incorrect");
        }
        SeleniumWebDriverImpl.implicitlyWait(driver, 10);
        SeleniumWebDriverImpl.maximizeWindow(driver);
    }

}
