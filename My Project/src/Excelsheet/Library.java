package Excelsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
			public Library(String filename) {
				try {
					File excel=new File(filename);	
					FileInputStream fis=new FileInputStream(excel);
					wb=new XSSFWorkbook(fis);
					 sheet=	wb.getSheetAt(0);
				} catch (Exception e) {
			System.out.println(e.getMessage());
				}
				
				
			}
	public static String getData(int sheetnumber,int row,int column) {
		
String data	=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
		
		
		
	

}
