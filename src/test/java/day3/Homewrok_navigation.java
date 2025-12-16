package day3;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homewrok_navigation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1️⃣ Enter search text
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("Wikipedia1_wikipedia-search-input")));
        searchBox.sendKeys("selenium");

        // 2️⃣ Click search
        driver.findElement(By.className("wikipedia-search-button")).click();

        // 3️⃣ Wait for results
        List<WebElement> results = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@id='wikipedia-search-result-link']/a")));

        System.out.println("Total results: " + results.size());

        // 4️⃣ Open each result in new tab
        for (WebElement link : results) {
            String href = link.getAttribute("href");
            ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", href);
            System.out.println("Opened: " + href);
        }

        // Optional: store all tabs handles
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println("Total tabs opened: " + tabs.size());
        for (int i = 0; i < tabs.size(); i++) {
            System.out.println("Tab " + (i+1) + " ID: " + tabs.get(i));
        }
    }
}
