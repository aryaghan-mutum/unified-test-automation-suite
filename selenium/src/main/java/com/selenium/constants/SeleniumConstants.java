package com.selenium.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SeleniumConstants {
    public static final Integer DEFAULT_TIMEOUT_SECONDS = 5;
    public static final String BROWSER_STACK_ENABLED_PROP_NAME = "browserStackEnabled";
    public static final String SELENIUM_GRID_ENABLED_PROP_NAME = "seleniumGridEnabled";

    public static final String CHROME_DRIVER_PATH = "drivers/chromedriver";
    public static final String FIREFOX_DRIVER_PATH = "drivers/geckodriver";

}
