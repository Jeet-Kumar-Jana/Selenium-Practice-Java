package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAllLinksPrint {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=1;
		for(WebElement i : links) {
			System.out.println(count++ +" "+i.getAttribute("href"));
		}
		
//		for(int i=0; i<links.size(); i++) {
//			WebElement link = links.get(i);
//			String linkText = link.getAttribute("href");
//			System.out.println(i+1 +"  "+linkText);
//		}
//		for(int i=links.size()-1; i>=0; i--) {
//			WebElement link = links.get(i);
//			String linkText = link.getAttribute("href");
//			System.out.println(i+1 +"  "+linkText);
//		}
		driver.quit();
	}

}
