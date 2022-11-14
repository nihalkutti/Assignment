import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "/Users/nihal/eclipse-workspace/Assignment/Test/src/drivers/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.saucedemo.com/");
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    App.Execute(driver, "standard_user", "secret_sauce");
    
    }
}
