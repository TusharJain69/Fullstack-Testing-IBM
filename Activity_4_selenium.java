import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_4_selenium {

    public static void main(String[] args) {
        // Set the path to geckodriver.exe
        System.setProperty("webdriver.gecko.driver", "path_to_geckodriver.exe");

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the URL
        driver.get("https://v1.training-support.net/selenium/input-events");

        // Get and print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);

        // Perform left click and print the value of the side in the front
        WebElement cube = driver.findElement(By.id("cube"));
        String frontSideValue = cube.getAttribute("value");
        System.out.println("Value of the side in the front before left click: " + frontSideValue);
        cube.click();

        // Perform double click to show a random side and print the number
        Actions action = new Actions(driver);
        action.doubleClick(cube).perform();
        frontSideValue = cube.getAttribute("value");
        System.out.println("Value of the side in the front after double click: " + frontSideValue);

        // Perform right click and print the value shown on the front of the cube
        action.contextClick(cube).perform();
        frontSideValue = cube.getAttribute("value");
        System.out.println("Value of the side in the front after right click: " + frontSideValue);

        // Close the browser
        driver.quit();
    }
}

