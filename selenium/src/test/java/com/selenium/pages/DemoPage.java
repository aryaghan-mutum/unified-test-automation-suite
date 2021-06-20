package com.selenium.pages;

import com.selenium.enumerations.LocatorType;
import com.selenium.webdriver.SeleniumWebDriver;
import org.openqa.selenium.WebDriver;

public class DemoPage {

    public static final String myBtnId = "menu-item-89";
    public static final String designTitleXpath = "//h2[text()='Design work']";

    public DemoPage clickBtn(WebDriver driver) {
        SeleniumWebDriver.IMPL.findElement(driver, LocatorType.ID, myBtnId).click();
        return this;
    }

    public String typeInTextBox(WebDriver driver) {
        return SeleniumWebDriver.IMPL.findElement(driver, LocatorType.XPATH, designTitleXpath).getText();
    }
}
