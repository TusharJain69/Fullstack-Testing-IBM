import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity_11_selenium {
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

        // Check if the checkbox is selected and print the result
        boolean isCheckboxSelected = checkbox.isSelected();
        System.out.println("Is checkbox selected? " + isCheckboxSelected);

        // Click the checkbox to select it
        checkbox.click();

        // Check if the checkbox is selected again
        boolean isCheckboxSelectedAfterClick = checkbox.isSelected();
        System.out.println("Is checkbox selected after clicking? " + isCheckboxSelectedAfterClick);

        // Close the browser
        driver.quit();
    }
}