package Excelsheet;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData1 {

	public static void main(String[] args) throws Exception {

		
		File file=new File("E:\\Exceldata\\data.xlsx");
		FileInputStream fileIS= new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fileIS);
        XSSFSheet sheet1=		wb.getSheetAt(0);
		
	String data0=	sheet1.getRow(4).getCell(0).getStringCellValue();
		
		System.out.println(data0);
		
		
	String data1=	sheet1.getRow(4).getCell(1).getStringCellValue();
	System.out.println(data1);
		
int totalrows=		sheet1.getLastRowNum();
System.out.println(totalrows);
for(int i=0;i<totalrows;i++) {
String cell=	sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println(cell);
	
	String cell1=	sheet1.getRow(i).getCell(1).getStringCellValue();
	System.out.println(cell1);
	
		
	
	
}	
		wb.close();
	}

}
