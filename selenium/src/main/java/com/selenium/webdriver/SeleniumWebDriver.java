package com.selenium.webdriver;

import com.selenium.enumerations.BrowserType;
import com.selenium.enumerations.LocatorType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

public interface SeleniumWebDriver {

    SeleniumWebDriver IMPL = SeleniumWebDriverImpl.SINGLETON;

    /**
     * Returns a web element using the configured implicit wait.
     */
    WebElement findElement(WebDriver driver, LocatorType locatorType, String identifier);

    /**
     * Find an element using your own By locator. Useful for the custom Angular locators provided by NgWebDriver.
     * For example: 'ByAngular.partialButtonText()'
     */
    WebElement findElement(WebDriver driver, By byLocator);

    /**
     * Locate element using a configurable FluentWait.
     */
    WebElement findElementWithFluentWait(WebDriver driver, Wait wait, LocatorType locatorType, String identifier);

    /**
     * Returns a list of web elements matching the locator criteria.
     */
    List<WebElement> findElements(WebDriver driver, LocatorType locatorType, String identifier);

    /**
     * Locate an element list using a configurable Fluent Wait.
     */
    List<WebElement> findElementsWithFluentWait(WebDriver driver, Wait wait, LocatorType locatorType, String identifier);

    /**
     * Returns a web element object using the locator type and identifier provider.
     */
    WebElement getElementWhenVisible(WebDriver driver, LocatorType locatorType, String identifier);

    /**
     * Returns a web element object using the locator type and identifier provider.
     * This uses an explicit wait approach
     */
    WebElement getElementWhenClickable(WebDriver driver, LocatorType locatorType, String identifier);

    /**
     * Returns true when the given element is hidden (invisible).
     */
    Boolean isElementInvisible(WebDriver driver, LocatorType locatorType, String identifier);

    /**
     * Resize the browser
     */
    void resizeBrowserWindow(WebDriver driver, Integer horizontalSizeInPixels, Integer verticalSizeInPixels);

    /**
     * Closes and quits the browser process
     */
    void shutdownDriver(WebDriver driver);

    /**
     * Close all open browser tabs except one. Use driver.getWindowHandle() to capture the original tab.
     */
    void closeOtherBrowserTabs(WebDriver driver, String remainingTabHandle);

}
