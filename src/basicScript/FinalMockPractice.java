package basicScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FinalMockPractice {
/*	// WAS to fetch multiple data from excel sheet
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("sheet1");
		int rowNum = sheet.getLastRowNum();
		for(int i=0; i<=rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			int colNum = row.getLastCellNum();
			for(int j=0; j<colNum; j++) {
				XSSFCell col = row.getCell(j);
				System.out.println(col);
			}
		}
		fis.close();
		book.close();
	}
*/

/*	
	// WAS to scroll up to a element and take screenshot of that element
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("URL");
		
		WebElement ele = driver.findElement(By.id("enter id"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollToView();",ele);
		
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm = new File("address to store scresnshot");
		FileHandler.copy(temp, perm);
		
	}
*/

	
/*
	// WAS to handle child tabs and close parent tab
	public static void main(String[] args) throws AWTException, InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.selenium.dev/downloads/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 String parent = driver.getWindowHandle();
		 List<WebElement> eles = driver.findElements(By.xpath("//a[text()='4.39.0 (December 06, 2025)']"));
		 eles.remove(2);
		 Robot rb = new Robot();
		 Actions act = new Actions(driver);
		 
		 for(WebElement ele : eles) {
			 act.contextClick(ele).perform();
			 rb.keyPress(KeyEvent.VK_DOWN);
			 rb.keyRelease(KeyEvent.VK_DOWN);
			 rb.keyPress(KeyEvent.VK_ENTER);
			 rb.keyRelease(KeyEvent.VK_ENTER);
		 }
		 
		 Set<String> tabs = driver.getWindowHandles();
		 
		 for(String tab : tabs) {
			 if(!tab.equals(parent)) {
				 driver.switchTo().window(tab);
				 
			 }
		 }
		 
		 driver.switchTo().window(parent);
		 Thread.sleep(2000);
		 driver.close();
		 
	}
*/

	
/*
	// WAS to perform drag and drop
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("URL");
		WebElement source = driver.findElement(By.id(null));
		WebElement destination = driver.findElement(By.id(null));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		
	}
*/
	
	// WAS to fetch multiple options from a drop down and print
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebElement dd = driver.findElement(By.id(null));
		Select s = new Select(dd);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(4);
		
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement ele : selected) {
			System.out.println(ele.getText());
		}
	}
	
}





















