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

public class WriteAllLinksIn2Cell {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("Links Flipkart");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int a = 0;
		for(int i=0; i<links.size()-1; i++) {
			XSSFRow row = sheet.createRow(a);
			XSSFCell cell1 = row.createCell(0);
			XSSFCell cell2 = row.createCell(1);
			String link1 = links.get(i).getAttribute("href");
			String link2 = links.get(i+1).getAttribute("href");
			cell1.setCellValue(link1);
			cell2.setCellValue(link2);
			i++;
			a++;
		}
		FileOutputStream fos = new FileOutputStream("./Excel/TestDataFacebook.xlsx");
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
		driver.quit();
	}
}
