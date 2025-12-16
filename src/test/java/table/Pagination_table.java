package table;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagination_table {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://datatables.net/");

        // Get total columns dynamically
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='example']//thead//th"));
        int totalCols = headers.size();
        System.out.println("Total columns: " + totalCols);

        int currentPageNo = 1;

        while (true) {

            System.out.println("\n===== PAGE " + currentPageNo + " =====");

            // Wait for table rows to be present
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='example']//tbody//tr")));

            // Get all rows on current page
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
            System.out.println("Rows on current page: " + rows.size());

            // Loop through rows and columns
            for (int r = 1; r <= rows.size(); r++) {
                for (int c = 1; c <= totalCols; c++) {
                    WebElement cell = driver.findElement(By.xpath(
                            "//table[@id='example']//tbody//tr[" + r + "]//td[" + c + "]"
                    ));
                    System.out.print(cell.getText() + "\t");
                }
                System.out.println();
            }

            // Locate NEXT button dynamically
            WebElement next = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//button[@data-dt-idx='next']")
            ));

            // Stop if NEXT button is disabled → last page reached
            if (next.getAttribute("class").contains("disabled")) {
                System.out.println("\nReached last page.");
                break;
            }

            // Click NEXT and wait until table refreshes
            wait.until(ExpectedConditions.elementToBeClickable(next)).click();
            wait.until(ExpectedConditions.stalenessOf(rows.get(0))); // wait until table refreshes

            currentPageNo++;
        }

        driver.quit();
    }
}
