package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_demo {

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.irctctourism.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".Nav-icons.Flights")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".Nav-icons.Flights")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".Nav-icons.BusTickets")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".Nav-icons.RetiringRoom")).click();
        Thread.sleep(2000);

        // Get window IDs
        Set<String> windowIds = driver.getWindowHandles();
        System.out.println("Window Ids are: " + windowIds);

        // Convert Set to List for indexed access
        List<String> winList = new ArrayList<>(windowIds);
        System.out.println("Window IDs in list: " + winList);

        // -----------------------------
        // Switch to 2nd window (index 1)
        // -----------------------------
        if (winList.size() > 1) {
            driver.switchTo().window(winList.get(1));
            System.out.println("Switched to 2nd window: " + driver.getTitle());
        } else {
            System.out.println("2nd window not available.");
        }

        Thread.sleep(2000);

        // -----------------------------
        // Switch to 4th window (index 3)
        // -----------------------------
        if (winList.size() > 3) {
            driver.switchTo().window(winList.get(3));
            System.out.println("Switched to 4th window: " + driver.getTitle());
        } else {
            System.out.println("4th window not available.");
        }
    }

}
