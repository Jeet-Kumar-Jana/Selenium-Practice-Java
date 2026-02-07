package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/mainPage.html");
		WebElement usn = driver.findElement(By.id("i1"));
		Thread.sleep(1000);
		usn.sendKeys("Admin");
		
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.id("i2"));
		psw.sendKeys("Admin@123");
		
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement cnf = driver.findElement(By.id("i3"));
		cnf.sendKeys("Admin@123");
		Thread.sleep(1000);
		cnf.clear();
		
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		psw.clear();
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		usn.clear();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
