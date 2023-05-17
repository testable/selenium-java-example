package io.testable.example;

import io.testable.selenium.TestableSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNGSampleTest {

    @Test
    public void testLoadGoogle() {
        System.out.println("TestNG test");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = TestableSelenium.newWebDriver(options);
        driver.get("https://www.google.com");
        TestableSelenium.takeScreenshot(driver, "temp.png");
        driver.close();
    }


}
