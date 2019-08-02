package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class excelclass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
		public void readable() throws IOException
		{
		File src= new File("C:\\Selenium\\Book1.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data1" +data0);
		
		String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("data1" +data1);
		
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("fail");
		FileOutputStream fo= new FileOutputStream(src);
		

		String data2= sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("data1" +data2);
		
		String data3= sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("data1" +data3);
		
		String data4= sheet1.getRow(2).getCell(0).getStringCellValue();
		System.out.println("data1" +data4);
		
		String data5= sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println("data1" +data5);
		
		
		wb.write(fo);
		wb.close();
	}
	}


