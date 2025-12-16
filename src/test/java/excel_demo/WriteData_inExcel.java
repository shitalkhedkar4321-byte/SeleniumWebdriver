package excel_demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_inExcel {

	public static void main(String[] args) throws IOException {
		//open excel file> workbook>sheet>rows>cell
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata_excel\\myfile2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook()	;
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("WelcomeJAva");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("python");
		row2.createCell(1).setCellValue(12);
		row2.createCell(2).setCellValue("Automation");
		
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(1231);
		row3.createCell(2).setCellValue("Automation");
		
		//attach workbook to file
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");
		
			
		
		
	}

}
