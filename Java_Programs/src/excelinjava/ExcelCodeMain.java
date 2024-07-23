package excelinjava;

import java.io.IOException;

public class ExcelCodeMain {

	public static void main(String[] args) throws IOException {

		String s = ExcelCode.readStringData(2,1);  //static method classname.methodname
		System.out.println(s);
		String s1 = ExcelCode.readIntegerData(2,2);
		System.out.println(s1);

	}

}
