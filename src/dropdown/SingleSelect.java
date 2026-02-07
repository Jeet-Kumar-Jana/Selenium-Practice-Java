package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// Facebook Account Creation page
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select s1= new Select(day);
		Select s2= new Select(month);
		Select s3= new Select(year);
		
		// Select Date of birth Day/ Month/ Year
		
//		s.selectByIndex(26);
//		s.selectByValue("27");
		s1.selectByVisibleText("27");
		s2.selectByIndex(11);
		s3.selectByVisibleText("2002");
		
		// Print all the month on the console
		List<WebElement> months = s2.getOptions();
		for(WebElement i : months) {
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		Thread.sleep(10000);
		driver.quit();
	}

}
