package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_28_11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@ type='submit' and @value='Log in']"));
		login.click();
		Thread.sleep(2000);
		String s = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		Thread.sleep(2000);
		System.out.println(s);
	}

}
