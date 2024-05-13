import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Activity_6_selenium {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        WebElement x= driver.findElement(By.xpath("//*[@id=\"wrapD3Cube\"]"));
        new Actions(driver)
                .sendKeys(("T"))
                .keyDown(Keys.COMMAND)
                .sendKeys("a")
                .keyDown(Keys.COMMAND)
                .sendKeys("c")
                .perform();
        driver.quit();
    }
}