package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_10_11_Real {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin@123");
		driver.findElement(By.name("login")).click();
	}

}
