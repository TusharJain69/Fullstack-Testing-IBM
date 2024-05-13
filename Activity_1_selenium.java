import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity_1_selenium {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net");

        // Perform testing and assertions
        String title = driver.getTitle(); // Get the title of the webpage

        // Print the title to the console
        System.out.println("Title of the webpage: " + title);

        //about us button using its id
        WebElement button = driver.findElement(By.id("About Us "));

        button.click(); // For clicking the button


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}


