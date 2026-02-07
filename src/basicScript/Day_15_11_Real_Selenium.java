package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_15_11_Real_Selenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.nuget.org/packages/Selenium.WebDriver' and @class='card-link']")).click();
		
		
	}

}
