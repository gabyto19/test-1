package tests;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RedditTest extends BaseTest {
    @Test
    public void testRedditWelcome() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(
                By.id("com.reddit.frontpage:id/login_button"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 