package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.xpath("//a[text()='Cart']"));
		Actions act = new Actions(driver);
//		Thread.sleep(2000);
		
//		// Right click
//		act.contextClick(element).perform();
		
		// Double click
//		driver.get("https://unixpapa.com/js/testmouse.html");
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
//		WebElement element1 = driver.findElement(By.xpath("//a[text()='click here to test']"));
//		act.doubleClick(element1).perform();
		
		// Drag & Drop
//		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement src = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
//		WebElement dest = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
//		act.dragAndDrop(src, dest).perform();
		
		// Mouse Hovering
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//li[@class='Women p-4 relative']"));
		act.moveToElement(element).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
