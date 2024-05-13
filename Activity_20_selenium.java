import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity_20_selenium {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("Home page title:" + driver.getTitle());
        WebElement promptButton = driver.findElement(By.cssSelector("button#prompt")); // Find the button to open a prompt alert and click it
        promptButton.click();
        // Switch focus from the main window to the alert box
        Alert alert = driver.switchTo().alert();
        // Get the text in the alert and print it
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        // Type "awesome" into the prompt
        alert.sendKeys("awesome");
        // Close the alert with OK
        alert.accept();
        System.out.println("Prompt alert closed with OK");
        // Close the browser
        driver.quit();
    }
}
