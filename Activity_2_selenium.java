import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity_2_selenium {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");

        // Perform testing and assertions
        String title = driver.getTitle(); // Get the title of the webpage

        // Print the title to the console
        System.out.println("Title of the webpage: " + title);

        //finding username field
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));

        // Enter  into the username field
       System.out.println("username of the user:" + usernameField);

        //find password
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        //enter password
        passwordField.sendKeys("123");

        //FIND LOGIN
        WebElement button = driver.findElement(By.xpath("/*[@id=\"dynamic-attributes-form\"]/div/button"));

        button.click();
        driver.quit();


    }
}
