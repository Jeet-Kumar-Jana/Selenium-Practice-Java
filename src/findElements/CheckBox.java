package findElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/Portfolio/checkbox.html");
		driver.manage().window().maximize();
		List<WebElement> checkBoxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkBoxs.size());
		for(WebElement i : checkBoxs) {
			Thread.sleep(200);
			i.click();
		}
//		for(int i=0; i<checkBoxs.size(); i++) {
//			Thread.sleep(200);
//			checkBoxs.get(i).click();
//		}
		for(int i=checkBoxs.size()-1; i>=0 ; i--) {
			Thread.sleep(200);
			checkBoxs.get(i).click();
		}
		
		driver.quit();
		
	}

}
