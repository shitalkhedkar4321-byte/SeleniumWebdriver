package excel_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utils {

	//create variable 
	public static  FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static  XSSFRow row;
	public static  XSSFCell cell;
	public static CellStyle style; //apply style on cell like colour
	
	//static methods no need to create object to access the method. user can access method using method name
	public static int getrowcount(String xlfile, String xlsheet) throws IOException
	{
		fi= new FileInputStream(xlfile); //open file in reading mode
		wb= new XSSFWorkbook(fi); //getting workbook
		ws=wb.getSheet(xlsheet);//getting sheet
		int rowcount = ws.getLastRowNum();//finding row count
		wb.close();//close workbook
		fi.close();//close file
		return rowcount;//return integer row count
	}
	
	
	public static int getcellcount(String xlfile,String xlsheet, int rownum) throws IOException
	{
		fi= new FileInputStream(xlfile); //open file in reading mode
		wb= new XSSFWorkbook(fi); //getting workbook
		ws=wb.getSheet(xlsheet);//getting sheet]
		row=ws.getRow(rownum);
		int cellcount = row.getLastCellNum();//finding cell count
		wb.close();//close workbook
		fi.close();//close file
		return cellcount;//return integer row count
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
