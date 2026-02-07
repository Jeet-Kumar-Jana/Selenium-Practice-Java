package disabledElement_ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		driver.get("http://127.0.0.1:5500/DummyDisabled.html");
//		driver.manage().window().maximize();
		
		// pass data to disabled text filed
//		WebElement element = driver.findElement(By.id("username"));
//		jse.executeScript("arguments[0].value='Admin'", element);
//		Thread.sleep(2000);
		
//		driver.get("http://127.0.0.1:5500/DummyDisabled.html");
		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.id("username"));
//		Thread.sleep(5000);
		
		//remove data from disabled text field
//		jse.executeScript("arguments[0].value=''", element);
//		Thread.sleep(2000);
		
		// scroll
		driver.get("https://www.flipkart.com/pages/terms?otracker=footer_navlinks");
		WebElement element = driver.findElement(By.xpath("//p[text()='Delivery']"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		//jse.executeScript("scrollBy(0,5000);");
		
		Thread.sleep(50000);
		
		driver.quit();
	}

}
