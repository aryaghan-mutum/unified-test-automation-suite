package com.selenium.tests;

import com.selenium.SeleniumBaseTest;
import com.selenium.constants.SecretsConstants;
import com.selenium.pages.DemoPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPomTests extends SeleniumBaseTest {

    private DemoPage demoPage;


    @Test
    public void testTitleName() {
        driver.get("http://webdev-consulting.com/");
        demoPage.clickBtn(driver);
        String actualDesignText = demoPage.typeInTextBox(driver).toLowerCase();
        Assertions.assertEquals(actualDesignText, "design work");
    }

    @Test
    public void testParameterWithXML() {
        driver.get("http://demo.guru99.com/V4/");
        WebElement userName = driver.findElement(By.name("uid"));
        //SeleniumWebDriver.IMPL.findElement(driver, LocatorType.NAME, "uid");

        userName.sendKeys("guru99");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("guru99");
    }
}
