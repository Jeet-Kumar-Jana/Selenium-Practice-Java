package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleData {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./Excel/TestDataFacebook.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.createSheet("AlexData");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Coal Mafia");
		FileOutputStream fos = new FileOutputStream("./Excel/TestDataFacebook.xlsx");
		book.write(fos);
		book.close();
		fis.close();
		fos.close();
	}

}
