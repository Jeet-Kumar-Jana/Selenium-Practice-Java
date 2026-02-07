package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_29_11{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://baskinrobbinsindia.com/");
		WebElement button = driver.findElement(By.xpath("//a[@href='https://baskinrobbins.dotpe.in/' and @class='btn button button--bgpink shop-btn-mobile']"));
		
		System.out.println(button.getAttribute("class"));
		Thread.sleep(2000);
		System.out.println(button.getTagName());
		System.out.println(button.getCssValue("background-color"));
		System.out.println(button.getSize());
		Dimension d = button.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		
		
		driver.quit();
	}

}
