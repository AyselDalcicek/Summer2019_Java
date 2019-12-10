package day61_ExcelReadWrite;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelfExcelWrite {
	
public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\aysel\\Desktop\\Excel Sheet2.xlsx";
		String sheetName1 = "SDET";
		String sheetName2 = "DEV";
		String sheetName3 = "PO";
		

				FileInputStream file = new FileInputStream(filePath);
				Workbook excelFile = WorkbookFactory.create(file);
		
		Sheet sheet1 = excelFile.getSheet(sheetName1);
		Sheet sheet2 = excelFile.getSheet(sheetName2);
		Sheet sheet3 = excelFile.getSheet(sheetName3);
		
		Cell  cell1 = sheet1.getRow(2).getCell(2);
		cell1.setCellValue("500K");
		String cellData1 = cell1.toString();
		System.out.println(cellData1);
		
}

}
