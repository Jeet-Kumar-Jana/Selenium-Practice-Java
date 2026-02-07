package basicScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	public static void main(String[] args) throws InterruptedException, IOException {
//		WebDriver d = new ChromeDriver();
//		d.get("https://www.flipkart.com");
//		List<WebElement> elements = d.findElements(By.xpath("//a"));
//
//
//		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
//		XSSFWorkbook book = new XSSFWorkbook(fis);
//		XSSFSheet sheet = book.createSheet("Ami Je ke Tomar");
//		int r = -1;
//		for(WebElement i:elements){
//			String link = i.getAttribute("href");
//			XSSFRow row = sheet.createRow(++r);
//			XSSFCell cell = row.createCell(0);
//			cell.setCellValue(link);
//			
//		}
//		FileOutputStream fos = new FileOutputStream("./Excel/TestDataFacebook.xlsx");
//		book.write(fos);
//		book.close();
//		fis.close();
//		fos.close();
//		d.quit();
		
//		Date d = new Date();
//		String date = d.toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		WebDriverWait exw = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean value = exw.until(ExpectedConditions.titleIs(title));
		if(value) {
			System.out.println("Found");
		}
		
		
		
		
		
//		driver.get("file:///C:/Users/jkj60/OneDrive/Desktop/Dhiraj_Sir/mainPage.html");
//		String title = driver.getTitle();
//		WebDriverWait exw = new WebDriverWait(driver, Duration.ofSeconds(10));
//		boolean value = exw.until(ExpectedConditions.titleContains(title));
//		if(value) {
//			driver.findElement(By.id("i1")).sendKeys("Admin");
//			driver.switchTo().frame(0);
//			Thread.sleep(2000);
//			driver.findElement(By.id("i2")).sendKeys("Admin@123");
//			driver.switchTo().frame(0);
//			Thread.sleep(2000);
//			driver.findElement(By.id("i3")).sendKeys("Admin@123");
//			
//			Thread.sleep(2000);
//			
//			driver.findElement(By.id("i3")).clear();
//			driver.switchTo().parentFrame();
//			Thread.sleep(2000);
//			driver.findElement(By.id("i2")).clear();
//			driver.switchTo().defaultContent();
//			Thread.sleep(2000);
//			driver.findElement(By.id("i1")).clear();
//		}
//		else {
//			System.out.println("Title not matching");
//		}
//		Thread.sleep(2000);
//		//driver.quit();
		
		
		
		
		
		
//		WebElement ele = driver.findElement(By.id("username"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		Thread.sleep(3000);
//
//		jse.executeScript("scrollBy(0,500);");
////		jse.executeScript("arguments[0].value='Jeet'",ele);
//	
//		Thread.sleep(3000);
//		driver.quit();
		
//		driver.get("https://www.facebook.com");
//		WebElement ele = driver.findElement(By.name("login"));
//		
//		
//		//TakesScreenshot ts = (TakesScreenshot) driver;
//		File temp = ele.getScreenshotAs(OutputType.FILE);
//		File perm = new File("./images/"+date+".png");
//		FileHandler.copy(temp, perm);
//		driver.quit();
		
		
//		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(10));
//		boolean value = ew.until(ExpectedConditions.titleContains("facebook"));
//		if(value) {
//			WebElement ele = driver.findElement(By.id("email"));
//			ele.sendKeys("Admin");
//		}
//		else {
//			System.out.println("title not matching");
//		}
//		
		
//		WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
//		Rectangle r = element.getRect();
//		System.out.println("Size : "+r.getDimension());
//		System.out.println("Location : "+r.getPoint());
//		System.out.println(element.isSelected());
//		System.out.println(element.isDisplayed());
//		System.out.println(element.isEnabled());
//		
//		driver.quit();
		
//		Dimension d = new Dimension(200,300);
//		driver.manage().window().setSize(d);
//		Thread.sleep(3000);
//		Point p = new Point(200,300);
//		driver.manage().window().setPosition(p);
		
//		driver.get("http://127.0.0.1:5500/DropDown.html");
//		WebElement element = driver.findElement(By.name("Food Menu"));
//		Select s = new Select(element);
//		boolean multiple = s.isMultiple();
//		if(multiple) {
//			List<WebElement> options = s.getOptions();
//			for(WebElement i : options) {
//				System.out.println(i.getAttribute("value")+" : " +i.getText());
//			}
//			s.selectByVisibleText("Kebaab");
//			s.selectByContainsVisibleText("Litti");
//			
//			Thread.sleep(3000);
//			
//			s.deselectAll();
//		}
//		else {
//			System.out.println("this is single select drop down");
//		}
//		
//		Thread.sleep(6000);
//		driver.quit();
		
		
//		driver.get("https://youtube.com");
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("bargad song");
//		driver.findElement(By.xpath("//button[@title='Search']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//yt-formatted-string[text()='sufr ft Arpit Bala, toorjo dey - bargad (official lyric video)']")).click();
//		
//		ArrayList<Integer> arr = new ArrayList<>();
//		Stack<Integer> stack = new Stack<>();
//		driver.get("https://www.flipkart.com");
//		List<WebElement> links = driver.findElements(By.xpath("//a"));
//		System.out.println(links.size());
//		int n=1;
//		for(WebElement i : links) {
//			System.out.println(n++ +" "+i.getAttribute("href"));
//		}
		
//		for(int i=links.size()-1; i>=0; i--) {
//			WebElement link = links.get(i);
//			System.out.println(i+1 + " "+link.getAttribute("href"));
//		}

//		driver.get("http://127.0.0.1:5500/DummyDisabled.html");
//		WebElement element = driver.findElement(By.id("username"));
//		System.out.println(element.isDisplayed());
//		System.out.println(element.isEnabled());
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		Thread.sleep(3000);
//		jse.executeScript("arguments[0].value=''", element);
//		Thread.sleep(2000);
		
		
//		Dimension d = new Dimension(100, 300);
//		driver.manage().window().setSize(d);
//		Thread.sleep(5000);
//		Point p = new Point(300, 500);
//		driver.manage().window().setPosition(p);		//System.out.println(driver.getPageSource());
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("kya baat hai");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@title=\'Search\']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@aria-label='Harrdy Sandhu - Kya Baat Ay | Jaani | B Praak | Arvindr Khaira | Official Music Video 3 minutes, 11 seconds']")).click();
//		
//		//To launch chatGPT, and search
//		driver.get("https://chatgpt.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.className("placeholder")).sendKeys("give me 20 adhoc scenarios"+
//		" in proper format like To check that in all the fields when user enters all the "+
//				"valid values, and then click on login and suddenly turn off the internet"+
//		"for 'instagram'");
//		Thread.sleep(2000);
//		driver.findElement(By.id("composer-submit-button")).click();
		
		
		
//		//first tab
//		driver.get("http://www.facebook.com");
//		String firstTab = driver.getWindowHandle();
//		driver.manage().window().maximize();
////		driver.manage().window().fullscreen();
//		
//		//new tab
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.flipkart.com");
//		
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.switchTo().window(firstTab);
//		
//		driver.quit();
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
	}
}
