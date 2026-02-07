package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchMultiRowAndCol {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lastRow = sheet.getLastRowNum();
		for(int i=0; i<lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for(int j=0; j<lastCell; j++) {
				XSSFCell cell = row.getCell(j);
				if(j==lastCell-1)
					System.out.print(cell);
				else
					System.out.print(cell+" | ");
			}
			System.out.println();
		}
	}
}
