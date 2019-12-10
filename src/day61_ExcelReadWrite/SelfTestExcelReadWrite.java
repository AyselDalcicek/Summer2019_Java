package day61_ExcelReadWrite;

public class SelfTestExcelReadWrite {
	
		
		public static void main(String[] args) {
			
			String path = "C:\\Users\\aysel\\Desktop\\Excel Sheet2.xlsx";
			String sheetName = "PO";
			
			SelfExcelReadWrite obj = new SelfExcelReadWrite(path, sheetName);
			
			String data1= obj.readData(3, 2);
			System.out.println(data1);
			
			obj.WriteData(3, 2, "180K");
			
			String data2 = obj.readData(3, 2);
			System.out.println(data2);
		}
	}


