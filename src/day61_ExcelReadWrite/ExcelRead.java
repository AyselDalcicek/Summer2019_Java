package day61_ExcelReadWrite;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws Exception {
		
		 String filePath = "C:\\Users\\aysel\\Desktop\\Excel Sheet.xlsx"; // path of excel file
		 String sheetname = "Sheet1"; // Name of the sheet
		 String sheetname2 = "Kadri";
		 
		 FileInputStream file = new FileInputStream(filePath); // reads a file
		 
		 Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files
		 //XSSFWorkbook excelfile2 = new XSSFWorkbook(file);   // does the same thing
		 
		 Sheet sheet = excelFile.getSheet(sheetname); // gets the specific spread sheet from excelfile
		 // XSSFSheet sheet2 =excelfile2.getSheet(sheetname);
		 
		 Cell cell = sheet.getRow(1).getCell(2); // retrives specific cell from the speardsheet
		 
		 String cellData = cell.getStringCellValue(); // converts the cell' value to STring data type
		 System.out.println(cellData);
		 
		 // Workbook, Sheet, Cell are interfaces.
		 // Workbook is designed for excelfile, reads excel files. Implemented by XSSFWorkbook class
		 // XSSFSheet is a class. it implements Workbook
		 
		 
		Sheet sheet2 = excelFile.getSheet(sheetname2);
		Cell cell2 = sheet2.getRow(0).getCell(0);
		
		String cellData2 = cell2.getStringCellValue();
		System.out.println(cellData2);
		 
}

}
