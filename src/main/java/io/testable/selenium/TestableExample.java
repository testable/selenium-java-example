package io.testable.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.logging.Level;

/**
 * Simple example of loading Google and taking a screenshot in a way that is compatible with the Testable platform.
 */
public class TestableExample {

    public static void main(String[] args) {
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        DesiredCapabilities options = DesiredCapabilities.chrome();
        options.setCapability("goog:loggingPerfs", Collections.singletonMap(LogType.BROWSER, Level.ALL.toString()));
        WebDriver driver = TestableSelenium.newWebDriver(options);
        driver.get("https://www.google.com");
        TestableSelenium.takeScreenshot(driver, "temp.png");

        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(entry.toString());
        }

        driver.close();
    }

}
