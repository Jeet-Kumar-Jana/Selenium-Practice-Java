package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_10_11 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Dummy%20Html.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).sendKeys("Admin");
		driver.findElement(By.id("i2")).sendKeys("Admin@123");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("check")).click();
		driver.findElement(By.tagName("a")).click();
		
		
	}

}
