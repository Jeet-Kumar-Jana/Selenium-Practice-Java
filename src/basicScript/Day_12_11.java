package basicScript;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_12_11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/jkj60/OneDrive/Desktop/Dhiraj_Sir/Dummy%20Html.html");
		Thread.sleep(2000);
		//To resize the browser
		Dimension d = new Dimension(500, 600);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);

		//To drag the browser
		Point p = new Point(500, 600);
		driver.manage().window().setPosition(p);
		
	}
}
