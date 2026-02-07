package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_12_11_Real {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Jeet");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Jeet@123");
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("button[name='login']")).click();
	}
}
