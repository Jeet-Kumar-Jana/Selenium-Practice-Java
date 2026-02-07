package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DayFirst14_12_2025_GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@Test(priority = 1)
	public void googleTitleTest() {
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 3)
	public void googleLogoTest() {
		System.out.println(driver.findElement(By.id("LS8OJ")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void googleGmailTest() {
		System.out.println(driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed());
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
