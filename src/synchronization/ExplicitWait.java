package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean value = ew.until(ExpectedConditions.titleContains("Facebook"));
		if(value) {
			WebElement ele = driver.findElement(By.id("email"));
			ele.sendKeys("Admin");
		}
		Thread.sleep(2000);
		driver.quit();
		

	}

}
