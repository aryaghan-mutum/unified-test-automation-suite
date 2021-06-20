package com.selenium.webdriver;

import com.selenium.constants.SeleniumConstants;
import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import com.selenium.enumerations.LocatorType;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public enum SeleniumWebDriverImpl implements SeleniumWebDriver {

    SINGLETON;

    private final Integer DEFAULT_WINDOW_HEIGHT = 1080;
    private final Integer DEFAULT_WINDOW_WIDTH = 1920;

    @Override
    public WebElement findElement(WebDriver driver, LocatorType locatorType, String identifier) {
        return driver.findElement(getByLocator(locatorType, identifier));
    }

    @Override
    public WebElement findElement(WebDriver driver, By byLocator) {
        return (new WebDriverWait(driver, SeleniumConstants.DEFAULT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(byLocator));
    }

    @Override
    public WebElement findElementWithFluentWait(WebDriver driver, Wait wait, LocatorType locatorType, String identifier) {
        return (WebElement) wait.until(webDriver -> driver.findElement(getByLocator(locatorType, identifier)));
    }

    @Override
    public List<WebElement> findElements(WebDriver driver, LocatorType locatorType, String identifier) {
        return driver.findElements(getByLocator(locatorType, identifier));
    }

    @Override
    public List<WebElement> findElementsWithFluentWait(WebDriver driver, Wait wait, LocatorType locatorType, String identifier) {
        return (List<WebElement>) wait.until(webDriver -> driver.findElement(getByLocator(locatorType, identifier)));
    }

    @Override
    public WebElement getElementWhenVisible(WebDriver driver, LocatorType locatorType, String identifier) {
        return (new WebDriverWait(driver, SeleniumConstants.DEFAULT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(getByLocator(locatorType, identifier)));
    }

    @Override
    public WebElement getElementWhenClickable(WebDriver driver, LocatorType locatorType, String identifier) {
        return (new WebDriverWait(driver, SeleniumConstants.DEFAULT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(getByLocator(locatorType, identifier)));
    }

    @Override
    public Boolean isElementInvisible(WebDriver driver, LocatorType locatorType, String identifier) {
        return (new WebDriverWait(driver, SeleniumConstants.DEFAULT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.invisibilityOfElementLocated(getByLocator(locatorType, identifier)));
    }

    @Override
    public void resizeBrowserWindow(WebDriver driver, Integer horizontalSizeInPixels, Integer verticalSizeInPixels) {
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().setSize(new Dimension(horizontalSizeInPixels, verticalSizeInPixels));
    }

    @Override
    public void shutdownDriver(WebDriver driver) {
        System.out.println("Shutting down WebDriver...");
        if(driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Error during shutdown." + e);
            }
        }
    }

    @Override
    public void closeOtherBrowserTabs(WebDriver driver, String remainingTabHandle) {
        driver.getWindowHandles().stream()
                .filter(handle -> !handle.equals(remainingTabHandle))
                .forEach(handle -> driver.switchTo().window(handle).close());
    }

    private By getByLocator(LocatorType locatorType, String identifier) {
        By by = null;
        switch (locatorType) {
            case ID:
                by = By.id(identifier);
                break;
            case XPATH:
                by = By.xpath(identifier);
                break;
            case CLASSNAME:
                by = By.className(identifier);
                break;
            case NAME:
                by = By.name(identifier);
                break;
            case DATA_TARGET:
                by = By.xpath(String.format("//*[@data-target='#%s']", identifier));
                break;
            default:
                System.err.println("Invalid locator type provided!");
        }
        return by;
    }

    @Step("maximize the window")
    public static void maximizeWindow(WebDriver driver) {
        driver.manage().window().maximize();
    }

    @Step("implicitlyWait wait")
    public static void implicitlyWait(WebDriver driver, int var) {
        driver.manage().timeouts().implicitlyWait(var, TimeUnit.SECONDS);
    }

}
