package findElements;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthAsceOrder {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(month);
		List<WebElement> months = s.getOptions();
		TreeSet<String> m = new TreeSet<String>();
		for(WebElement i:months) {
			m.add(i.getText());
		}
		for(String i : m) {
			System.out.println(i);
		}
		System.out.println("########################");
		
		ArrayList<String> arr = new ArrayList<String>();
		for(String i:m) {
			arr.add(i);
		}
		for(int i=arr.size()-1; i>=0; i--) {
			System.out.println(arr.get(i));
		}
		
		
		driver.quit();
	}

}
