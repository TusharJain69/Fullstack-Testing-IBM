import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity_12_selenium {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

// Create the Wait object

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // Print the title of the page
        System.out.println("Home page title: 11" + driver.getTitle());

        // Find the text field
        WebElement textField = driver.findElement(By.xpath("//*[@id=\"input-text\"]" ));

        // Check if the text field is enabled and print it
        boolean isTextFieldEnabled = textField.isEnabled();
        System.out.println("Is Text Field Enabled: " + isTextFieldEnabled);

        // Click the "Enable Input" button
        WebElement enableButton = driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
        enableButton.click();

        // Check if the text field is enabled again and print it
        isTextFieldEnabled = textField.isEnabled();
        System.out.println("Is Text Field Enabled after clicking Enable Input button: " + isTextFieldEnabled);

        // Close the browser
        driver.quit();

    }
}