package Excelsheet;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellAddress;
public class ReadingData {

	public static void main(String[] args) throws Exception {

		File excel=new File("C:\\Users\\ACER\\Desktop\\Cps Project\\TestCase For Sprint1.xls");	
		
		FileInputStream fis=new FileInputStream(excel);
		
		//XSSFWorkbook workbook=new XSSFWorkbook(fis);
		HSSFWorkbook workbook=new HSSFWorkbook(fis);
		
		HSSFSheet sheet1	=workbook.getSheetAt(0);
int number=		sheet1.getLastRowNum();
System.out.println(number);
/*		
String data0=		sheet1.getRow(17).getCell(6).getStringCellValue();
System.out.println(data0);


   CellAddress cell  =sheet1.getActiveCell();
		System.out.println(cell);
		workbook.close();
*/	}

}
