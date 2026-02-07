package findElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintMonthDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(month);
		List<WebElement> months = s.getOptions();
		for(WebElement i:months) {
			System.out.println(i.getText());
		}
		driver.quit();
	}

}
