package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readingExcel {

	public static void main(String[] args) throws Exception {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\Excel\\data.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fi);
		
		Sheet sheet = wb.getSheet("MySheet");
		
//		Row r1 = sheet.getRow(0);
//		
//		Cell c0 = r1.getCell(0);
//		Cell c1 = r1.getCell(1);
//		
//		System.out.println(c0);
//		System.out.println(c1);
		
		
		
		for(Row r : sheet) {
			
			for(Cell cell:r) {
				
				
				switch(cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case BLANK:
					System.out.print(""+"\t");
				break;
				
									
				}
				
			}
			System.out.println();
		}
		
		
		System.out.println("File Read successfully !!!");
		
		
	}

}
