package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_18_11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1:5500/table.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[text()='50']/../td[2]"));
		
		
	}
}
