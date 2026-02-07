package testCaseExecute;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResultClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Shoes");
		List<WebElement> results = driver.findElements(By.xpath("//ul/li"));
		
		
		for(WebElement result:results) {
			if(result.getText().contains("shoes for men")) {
				result.click();
			}
			break;
		}


	}
}
