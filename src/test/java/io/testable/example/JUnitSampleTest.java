package io.testable.example;

import io.testable.selenium.TestableSelenium;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JUnitSampleTest {

    @Test
    public void testLoadGoogle() {
        System.out.println("JUnit test");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = TestableSelenium.newWebDriver(options);
        driver.get("https://www.google.com");
        TestableSelenium.takeScreenshot(driver, "temp.png");
        driver.close();
    }

}
