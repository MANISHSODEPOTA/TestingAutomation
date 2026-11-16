
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class SeleniumDemo {

    @Test
    public void testWebForm() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            WebElement textBox = driver.findElement(By.name("my-text"));
            textBox.sendKeys("Hello Selenium");

            driver.findElement(By.cssSelector("button")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("message"))
            );

            Assert.assertEquals(message.getText(), "Received!");

            System.out.println("Selenium Test Passed!");

        } finally {
            driver.quit();
        }
    }
}
