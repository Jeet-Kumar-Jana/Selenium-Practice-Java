package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_11_11_Real {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register now!")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Register")).click();
	}
}
