package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedditTest extends BaseTest {
    @Test
    public void testRedditWelcome() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            
            // Click login button and verify it was clicked
            wait.until(ExpectedConditions.elementToBeClickable(
                By.id("com.reddit.frontpage:id/login_button"))).click();
            
            // Optional: Add verification that login screen appears
            boolean loginScreenAppears = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.id("com.reddit.frontpage:id/login_username_field"))).isDisplayed();
            Assert.assertTrue(loginScreenAppears, "Login screen should appear after clicking login button");
            
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
        }
    }
} 