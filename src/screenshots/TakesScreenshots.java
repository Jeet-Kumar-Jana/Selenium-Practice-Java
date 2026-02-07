package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date d = new Date();
		String d1 = d.toString().replace(':', '-');
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// screenshot of the page
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File premanent = new File("./images/"+d1+".png");
//		FileHandler.copy(temp, premanent);
//		
		
		// screenshot of a element
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		File temp = element.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./images/"+d1+".png");
		FileHandler.copy(temp, permanent);
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
