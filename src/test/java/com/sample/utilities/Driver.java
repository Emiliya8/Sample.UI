package com.sample.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    // create a private constructor to remove access to this object
    private Driver() {
    }


    //  making the WebDriver private, because we want to close access from outside the class
    //  it static because we will use it in a static method.
    private static WebDriver driver; // default value = null


    //Create re-usable utility method which will return the same driver instance once we call it.
    // If driver instance does not exist, it will create first, then it will always return same instance
    public static WebDriver getDriver() {

        if (driver == null) {

            // we are reading browserType from configuration.properties file
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "safari":
                    driver = new SafariDriver();
                    break;
            }
        }

        return driver;
    }


    // create a new Driver.closeDriver() method that will quit browsers, then set the driver value back to null.
    public static void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}