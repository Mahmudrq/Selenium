package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataInExcel {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testdata\\myfile_dynamic.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("DynamicData");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How many rows?");
		int numOfRows = sc.nextInt();

		System.out.println("Enter How many cells?");
		int numOfCells = sc.nextInt();

		for (int r = 0; r <= numOfRows; r++) {

			XSSFRow currnetrow = sheet.createRow(r);

			for (int c = 0; c < numOfCells; c++) {
				XSSFCell cell = currnetrow.createCell(c);

				cell.setCellValue(sc.next());

			}
		}

		workbook.write(file);// attach workbook to the lkfile
		workbook.close();
		file.close();
		System.out.println("File is created...");
	}

}
