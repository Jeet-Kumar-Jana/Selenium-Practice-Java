package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteAllLinksOfFlipkart {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("Flipkart Linksss");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0; i<links.size()-1; i++) {
			
			XSSFRow row = sheet.createRow(i);
			XSSFCell cell = row.createCell(0);
			WebElement link = links.get(i);
			String value = link.getAttribute("href");
			cell.setCellValue(value);
		}
		FileOutputStream fos = new FileOutputStream("./Excel/TestDataFacebook.xlsx");
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
		driver.quit();
	}

}

