import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class App {

    public static void Execute(WebDriver driver, String userName, String password) throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys(userName);
        System.out.println("Username Entered");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("Password Entered");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Login Successful");

        ItemOne.RandomOne(driver);
        ItemTwo.RandomTwo(driver);
        ItemThree.RandomThree(driver);

        driver.quit();
    }
}
