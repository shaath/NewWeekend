package xlops;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ssssss {

	public static void main(String[] args) throws IOException 
	{
		DateFormat dateformate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		System.out.println(date);
		String s=dateformate.format(date);
		System.out.println(s);
		String d1=s.replace("/", "");
		String d2=d1.replace(" ", "");
		String d3=d2.replace(":", "");
		System.out.println(d3);
//		String xlpath="E:\\NewWeekend\\SleniumProject\\src\\testdata\\Keyword.xlsx";
//		String xlout="E:\\NewWeekend\\SleniumProject\\src\\results\\keyres2.xlsx";
//		FileInputStream fi=new FileInputStream(xlpath);
//		XSSFWorkbook wb=new XSSFWorkbook(fi);
//		
//		XSSFSheet ws=wb.getSheet("Testcase");
//		XSSFSheet ws1=wb.getSheet("Teststeps");
//		XSSFSheet ws2=wb.getSheet("TestData");
//
//		String br=ws2.getRow(1).getCell(9).getStringCellValue();
//		
//		if (br.equalsIgnoreCase("firefox"))
//		{
//			
//		}
	}

}
