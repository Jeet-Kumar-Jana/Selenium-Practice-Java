package navigateHeadlessIncognito;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions act = new ChromeOptions();
		act.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(act);
		driver.manage().window().maximize();
		System.out.println("Headless");
		Thread.sleep(4000);
		driver.quit();

	}

}
