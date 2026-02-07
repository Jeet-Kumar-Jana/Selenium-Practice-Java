package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchOneSet {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		System.out.println("UserName :- "+row.getCell(0));
		System.out.println("Password :- "+row.getCell(1));
		
		book.close();
		fis.close();
	}
}

