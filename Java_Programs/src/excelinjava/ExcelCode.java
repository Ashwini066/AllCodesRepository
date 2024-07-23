package excelinjava;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String readStringData (int row, int col) throws IOException
	{
		f = new FileInputStream("//Users//chelsamariakalapurayil//Desktop//JavaSample.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");   //method
		XSSFRow r= sh.getRow(row);
		XSSFCell c = r.getCell(col);
		return c.getStringCellValue();   //method
	}
	
	public static String readIntegerData (int row, int col) throws IOException{
	f = new FileInputStream("//Users//chelsamariakalapurayil//Desktop//JavaSample.xlsx");
	w = new XSSFWorkbook(f);
	sh = w.getSheet("Sheet1");   //method
	XSSFRow r= sh.getRow(row);   //XSSFRow class access row
	XSSFCell c = r.getCell(col);
	int val = (int) c.getNumericCellValue();
	return String.valueOf(val);  
	
	}
	

}
