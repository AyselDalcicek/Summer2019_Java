package day61_ExcelReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;

public class SelfExcelRead {
	
	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\aysel\\Desktop\\Excel Sheet2.xlsx";
		String sheetName1 = "SDET";
		String sheetName2 = "DEV";
		String sheetName3 = "PO";
		

				FileInputStream file = new FileInputStream(filePath);
				Workbook excelFile = WorkbookFactory.create(file);
		
		Sheet sheet1 = excelFile.getSheet(sheetName1);
		Sheet sheet2 = excelFile.getSheet(sheetName2);
		
		Cell cell1 = sheet1.getRow(1).getCell(2);   
		Cell cell2 = sheet2.getRow(1).getCell(2);	
		
				String cellData1 =cell1.getStringCellValue();
				System.out.println(cellData1); //SDET2
				
				String cellData2 = cell2.getStringCellValue();
				System.out.println(cellData2);  // Dev2
		
		
		Sheet sheet3 = excelFile.getSheet(sheetName3);
		Cell cell3 = sheet3.getRow(3).getCell(3);
		String cellData3 = cell3.getStringCellValue();
		System.out.println(cellData3);  // Requirement3
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
