package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReadingDataFromExecl {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		
		int totalrows=sheet.getLastRowNum();
		
		int  totalcells=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of Rows :"+totalrows);
		System.out.println("Number of Cell :"+totalcells);
		
		for(int r=0;r<=totalrows;r++) {
			
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++) {
				 
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	
	}

}
