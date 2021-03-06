package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import functions.FunctionMaster;

public class EmpregTest {

	public static void main(String[] args) throws IOException 
	{
		String xlpath="E:\\NewWeekend\\SleniumProject\\src\\testdata\\EmpRegData.xlsx";
		String xlout="E:\\NewWeekend\\SleniumProject\\src\\results\\Empfontcolour.xlsx";
		
		FunctionMaster fm=new FunctionMaster();
		FileInputStream fi=new FileInputStream(xlpath);
		

		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
//		XSSFRow r=ws.getRow(9);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		
		fm.org_Launch("http://opensource.demo.orangehrmlive.com");
		fm.org_Login("Admin", "admin");
		
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		for (int i = 1; i <= Rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			//Columns operations
//			System.out.println(r.getLastCellNum());
//			
//			for (int j = 0; j < r.getLastCellNum(); j++)
//			{
//				XSSFCell c=r.getCell(j);
//				System.out.println(c.getStringCellValue());
//			}
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"----------"+l);
			
			String res=fm.org_Empreg(f, l);
		
			c2.setCellValue(res);
			//Background colour
//			if (res.equalsIgnoreCase("Pass"))
//			{
//				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			}
//			else
//			{
//				style.setFillForegroundColor(IndexedColors.RED.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			}
			
			//Font colour
			
			if (res.equalsIgnoreCase("Pass")) 
			{
				font.setColor(IndexedColors.GREEN.getIndex());
				style.setFont(font);
			}
			else
			{
				font.setColor(IndexedColors.RED.getIndex());
				style.setFont(font);
			}
			
			
			
			c2.setCellStyle(style);
			
			
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		fm.org_Logout();
		fm.org_Close();
	}

}
