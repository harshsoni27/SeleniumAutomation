package TestNG;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleFetch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file = new File("/Users/harshsoni/Desktop/whatever/selenium/ExcelData1/TestData.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowNo = sheet.getPhysicalNumberOfRows();
		int colNo = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowNo;i++) {
			for(int j=0;j<colNo;j++) {
				System.out.print(sheet.getRow(i).getCell(j).toString()+"   ");
			}
			System.out.println();
		}
	}

}
