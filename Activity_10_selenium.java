import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity_10_selenium {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

// Create the Wait object

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Open the page

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

// Print the title of the page
        System.out.println("Home page title: 11" + driver.getTitle());

        // Find the checkbox input element
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));

        // Check if the checkbox is visible on the page
        boolean isCheckboxVisible = checkbox.isDisplayed();
        System.out.println("Is checkbox visible on the page? " + isCheckboxVisible);

        // Find the "remove checkbox" button and click it
        WebElement removeButton = driver.findElement(By.id("toggleCheckbox"));
        removeButton.click();

        // Check if the checkbox is visible again
        boolean isCheckboxVisibleAfterClick = checkbox.isDisplayed();
        System.out.println("Is checkbox visible after clicking 'Remove Checkbox' button? " + isCheckboxVisibleAfterClick);

        // Close the browser
        driver.quit();
    }
}

