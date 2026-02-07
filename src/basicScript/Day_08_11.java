package basicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_08_11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
