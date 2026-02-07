package testCaseExecute;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackDescription {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/34");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		
		Set<String> tabs = driver.getWindowHandles();
		
		for (String tab : tabs) {
			if(!tab.equals(parentWindow)) {
				Thread.sleep(2000);
				driver.switchTo().window(tab);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		System.out.println("Closing parent window");
		driver.quit();
		
	}
}
