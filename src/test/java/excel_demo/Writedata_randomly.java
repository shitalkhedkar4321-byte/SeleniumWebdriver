package excel_demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata_randomly {

	public static void main(String[] args) throws IOException {

		//open excel file> workbook>sheet>rows>cell
				FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata_excel\\random_userinput.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook()	;
				XSSFSheet sheet=workbook.createSheet("Sheet1");
				
				XSSFRow row = sheet.createRow(3);
				XSSFCell cell = row.createCell(4);
				cell.setCellValue("hello");
				
				
				
				
				
				
				
				
				
				
				//attach workbook to file
				workbook.write(file);
				workbook.close();
				file.close();
				System.out.println("File is created");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
