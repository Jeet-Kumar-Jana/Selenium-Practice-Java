package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Robot r = new Robot();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		// maximize the browser
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		
		// minimize the browser
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		
		// reopen the browser
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//close the browser
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_F4);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_F4);
		
	}

}
