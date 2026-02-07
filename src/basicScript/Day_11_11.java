package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_11_11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Dummy%20Html.html");
		driver.manage().window().maximize();
		WebElement usn = driver.findElement(By.id("i1"));
		Thread.sleep(1000);
		usn.clear();
		Thread.sleep(1000);
		usn.sendKeys("Admin123");
		
	}
}
