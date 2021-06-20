package com.selenium.tests;

import com.selenium.SeleniumBaseTest;
import com.selenium.pages.FacebookLoginPage;
import org.junit.jupiter.api.Test;

public class FacebookLoginTest extends SeleniumBaseTest {

    private FacebookLoginPage facebookLoginPage;

    @Test
    public void validateFacebookLogin() {
        facebookLoginPage = new FacebookLoginPage();
        driver.get("http://facebook.com");
        facebookLoginPage.facebookLogin(driver, "username", "password");

    }

}
