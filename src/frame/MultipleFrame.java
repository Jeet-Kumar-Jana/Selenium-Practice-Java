package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/mainMultipleFrame.html");
		Thread.sleep(1000);
		
		WebElement usn = driver.findElement(By.id("i3"));
		usn.sendKeys("Admin");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"innerFrame1.html\"]")));
		WebElement psw = driver.findElement(By.id("i1"));
		psw.sendKeys("Admin@123");
		
		Thread.sleep(1000);
		
		driver.switchTo().defaultContent();
		usn.clear();
		
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"innerFrame2.html\"]")));
		WebElement cnf = driver.findElement(By.id("i2"));
		cnf.sendKeys("Admin@124");
		cnf.sendKeys(Keys.CONTROL+"a");
		cnf.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		cnf.clear();
		
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		usn.sendKeys(Keys.CONTROL+"v");
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
