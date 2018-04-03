package io.testable.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Simple example of loading Google and taking a screenshot in a way that is compatible with the Testable platform.
 */
public class TestableExample {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = TestableSelenium.newWebDriver(options);
        driver.get("https://www.google.com");
        TestableSelenium.takeScreenshot(driver, "temp.png");
        driver.close();
    }

}
