import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity_8_selenium {
    public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();

// Create the Wait object

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Open the page

driver.get("https://v1.training-support.net/selenium/dynamic-controls");

// Print the title of the page
System.out.println("Home page title: 11" + driver.getTitle());

// Find the toggle button and click it

WebElement checkbox = driver.findElement(By.id("toggleCheckbox"));
checkbox.click();

// Wait for the checkbox to disappear

wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
System.out.println(checkbox.isDisplayed());

// Click the button again
checkbox.click();



wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("dynamicCheckbox")));
System.out.println(checkbox.isDisplayed());

    }
}