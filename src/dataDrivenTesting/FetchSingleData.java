package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchSingleData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataFAcebook.xlsx");
		
		// Access the workbook
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		// Access the sheet with sheet name inside workbook
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		// Access the the row with index inside sheet
		XSSFRow row = sheet.getRow(1);
		
		// Access the cell / column with inside row
		XSSFCell cell = row.getCell(0);
		
		// Fetch the value from cell
		String value = cell.getStringCellValue();
		
		System.out.println(value);
		
		// close the workbook
		book.close();
		
		// close the inputStream
		fis.close();
		
	}

}

