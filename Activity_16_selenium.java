import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Activity_16_selenium {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title: " + driver.getTitle());

        WebElement UsernameInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
        WebElement PasswordInput = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
        WebElement password2Input = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input"));
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[4]/input"));
        UsernameInput.sendKeys("TusharJain");
        PasswordInput.sendKeys("Tushar123");
        password2Input.sendKeys("Tushar123");
        emailInput.sendKeys("tushar1801jain@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();//signup button

        // Wait for the login message to appear
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SignupMessage = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));

        // Print the login message to the console
        System.out.println("Signup message: " + SignupMessage.getText());

        // Close the browser
        driver.quit();
    }
}


