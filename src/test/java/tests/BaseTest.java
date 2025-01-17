package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.URL;

public class BaseTest {
    protected AndroidDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:platformVersion", "15");
        caps.setCapability("appium:appPackage", "com.reddit.frontpage");
        caps.setCapability("appium:appActivity", "launcher.default");
        caps.setCapability("appium:noReset", true);
        caps.setCapability("appium:autoGrantPermissions", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}