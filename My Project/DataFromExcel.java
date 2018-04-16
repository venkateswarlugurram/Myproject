package Sample.pack;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class DataFromExcel {

	
	@Test
	public void getData() throws Exception {
		
		File file=new File("C:\\Users\\ACER\\Desktop\\mydata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.getSheetAt(0);
		String data0 = sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(data0);
		
		
	}
	
	
}
