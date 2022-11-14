import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemTwo {
    public static void RandomTwo(WebDriver driver) throws InterruptedException {
        List<WebElement> allProducts = driver.findElements(By.className("inventory_item_name"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        driver.findElement(By.id("back-to-products")).click();
    }
}
