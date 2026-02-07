package testCaseExecute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTripDaySelect {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/flights.html");

        driver.findElement(By.id("dvfarecal")).click();

        boolean monthFound = false;

        while (!monthFound) {
            try {
                WebElement month = driver.findElement(By.xpath("//div[text()='Dec 2026']"));
                if (month.isDisplayed()) {
                    monthFound = true;
                }
            } catch (Exception e) {
            	Thread.sleep(500);
                driver.findElement(By.xpath("//img[@onclick=\"NextPrevClick('nxtMnt')\"]")).click();
                Thread.sleep(500);
            }
        }
        
        driver.findElement(By.xpath("//li[@id=\"fiv_0_27/12/2026\"]")).click();

        
        Thread.sleep(5000);
        driver.quit();
    }
}
