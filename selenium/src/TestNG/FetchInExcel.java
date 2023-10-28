package TestNG;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchInExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		multipleRead("Sheet1");
	}
//	public static void singleRead(String sheetName, int rowNo, int colNo) throws EncryptedDocumentException, IOException {
//		File file = new File("/Users/harshsoni/Desktop/whatever/selenium/ExcelData1/TestData.xlsx");
//		FileInputStream fis= new FileInputStream(file);
//		Workbook workbook =WorkbookFactory.create(fis);
//		Sheet sheet = workbook.getSheet(sheetName);
//		Row row = sheet.getRow(rowNo);
//		Cell cell = row.getCell(colNo);
//		System.out.println(cell.toString());
//	}
	public static void multipleRead(String sheetName) throws EncryptedDocumentException, IOException {
		File file = new File("/Users/harshsoni/Desktop/whatever/selenium/ExcelData1/TestData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		int rowNo = sheet.getPhysicalNumberOfRows();
		int colNo = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowNo);
		System.out.println(colNo);
	}
}
