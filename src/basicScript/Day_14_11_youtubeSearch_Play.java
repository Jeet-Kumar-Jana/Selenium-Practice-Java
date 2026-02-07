package basicScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_14_11_youtubeSearch_Play {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("zara zara behekta hai");
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='video-title' and @title='Zara Zara Bahekta Hai | JalRaj | RHTDM | Male Version | Latest Hindi Cover 2020']")).click();		
		
	}

}
