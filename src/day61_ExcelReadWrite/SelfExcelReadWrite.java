package day61_ExcelReadWrite;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SelfExcelReadWrite {
	
	String filePath;
	String SheetName;
	FileInputStream file;
	Workbook excelfile;
	Sheet sheet;
	Cell cell;
	
	public SelfExcelReadWrite(String filePath, String SheetName) {
		
		this.filePath=filePath;
		this.SheetName=SheetName;
		try {
			file = new FileInputStream(filePath);
			excelfile=WorkbookFactory.create(file);
			sheet = excelfile.getSheet(SheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String readData(int rowNum, int cellNum) {
		String data ="";
		cell =sheet.getRow(rowNum).getCell(cellNum);
		data = cell.toString();
		return data;
		
	}
	
	
	public void WriteData(int rowNum, int cellNum, String setValue) {
		cell = sheet.getRow(rowNum).getCell(cellNum);
		cell.setCellValue(setValue);
	}
	
}




