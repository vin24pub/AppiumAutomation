package com.test.cucumber.stepdefinitions;

import io.appium.java_client.AppiumDriver;

public class DriverManager {

    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void setWebDriver(AppiumDriver driver_) {
        driver.set(driver_);
    }
}
