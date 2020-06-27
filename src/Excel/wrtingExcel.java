package Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wrtingExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet =wb.createSheet("MySheet");
		
//		Row r = sheet.createRow(0);
//		
//		Cell cell0 = r.createCell(0);
//		Cell cell1 = r.createCell(1);
//		
//		
//		cell0.setCellValue("First Cell");
//		cell1.setCellValue("Second Cell");
		
		
		
		for(int rows=0;rows<10;rows++) {
			Row r = sheet.createRow(rows);
			
			for(int cols=0;cols<10;cols++) {
				Cell cell = r.createCell(cols);
				
				cell.setCellValue((int) (Math.random()*100));
			}
			
		}
			
			
		
		
		
		
		File f = new File(System.getProperty("user.dir")+"\\src\\Excel\\data.xlsx");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		fo.close();
		
		System.out.println("File Created !!!");
		
		
		
	}

}
