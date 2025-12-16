package excel_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dynamic_write_excel {

	public static void main(String[] args) throws IOException {

		//open excel file> workbook>sheet>rows>cell
				FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata_excel\\dynamic.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook()	;
				XSSFSheet sheet=workbook.createSheet("Sheet1");
		
				try (//user data insertion
				Scanner sc = new Scanner(System.in)) {
					System.out.println("How many rows? ");
					int noOfrows = sc.nextInt();
					System.out.println("How many cells? ");
					int noOfcells= sc.nextInt();
					for(int r=0;r<=noOfrows;r++)
					{
						//create row 
						XSSFRow currentrow = sheet.createRow(r);
						
						for(int c=0;c<noOfcells;c++)
						{
							XSSFCell cell = currentrow.createCell(c);
							cell.setCellValue(sc.next());
						}
					}
				}
				//attach workbook to file
				workbook.write(file);
				workbook.close();
				file.close();
				System.out.println("File is created");
				
					
		
		
		
		
		
		
		
		
		
		
		
	}

}
