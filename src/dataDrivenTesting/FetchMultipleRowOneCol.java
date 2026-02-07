package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchMultipleRowOneCol {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Flipkart Links");
		int lastRow = sheet.getLastRowNum();
		for (int i = 0; i <= lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell = row.getCell(0);
			System.out.println(i+1+" : "+cell);
		}
		book.close();
		fis.close();
	}

}
