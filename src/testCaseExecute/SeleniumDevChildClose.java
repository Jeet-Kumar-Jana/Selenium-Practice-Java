package testCaseExecute;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDevChildClose {
public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		
		String mainPage = driver.getWindowHandle();
		
		List<WebElement> links = driver.findElements(By.xpath("//a[text()='4.39.0 (December 06, 2025)']"));
		links.remove(2);
		
		Actions act = new Actions(driver);
		Robot rb = new Robot();
		
		for(WebElement link:links) {
			act.contextClick(link).perform();
			Thread.sleep(500);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		
		Set<String> tabs = driver.getWindowHandles();
		
		
		for(String tab:tabs) {
			if(!tab.equals(mainPage)) {
				driver.switchTo().window(tab);
				System.out.println(driver.getTitle());
				Thread.sleep(1000);
				driver.close();
			}
		}
		
		
			
	}
}
