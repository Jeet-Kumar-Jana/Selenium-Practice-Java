package navigateHeadlessIncognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions act = new ChromeOptions();
		act.addArguments("--headless");
		WebDriver driver = new ChromeDriver(act);
		System.out.println("Headless");
		driver.quit();
		
		

	}

}
