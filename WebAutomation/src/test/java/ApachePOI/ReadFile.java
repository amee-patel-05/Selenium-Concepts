package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		// Read a specific cell value 
		
		
//		FileInputStream fileinput = new FileInputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test2.xlsx");
//
//		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
//
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		//XSSFSheet sheet = workbook.getSheet("Studentdata");
//
//		XSSFRow row3 = sheet.getRow(3);
//
//		XSSFCell cell8 = row3.getCell(8);
//
//		boolean active = cell8.getBooleanCellValue();
//		System.out.println(active);
//
//		XSSFCell cell6 = row3.getCell(6);
//
//		String address = cell6.getStringCellValue();
//		System.out.println(address);
//
//		fileinput.close();
//
//		workbook.close();
//
		
		// Read the data of whole Excel file
		
		
//		FileInputStream fileinput = new FileInputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test2.xlsx");
//
//		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
//
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		//XSSFSheet sheet = workbook.getSheet("Studentdata");
//
//		int rowCount = sheet.getLastRowNum();
//
//		int columCount = sheet.getRow(0).getLastCellNum();
//
//		for(int i=0 ; i<rowCount ; i++)
//		{
//			XSSFRow currentrow = sheet.getRow(i);
//
//			for (int j=0 ; j<columCount ; j++)
//			{
//				String currentcell = currentrow.getCell(j).toString();
//				System.out.println("   "+currentcell);
//			}
//			System.out.println();
//		}
//		fileinput.close();
//
//		workbook.close();

		
		// Read all the data from Excel file with define cell type
		
		
		FileInputStream fileinput = new FileInputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test2.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);

		XSSFSheet sheet = workbook.getSheet("Studentdata");

		int rowCount = sheet.getPhysicalNumberOfRows();

		for(int i=0 ; i<rowCount ; i++)
		{
			XSSFRow row =sheet.getRow(i);

			int colCount = row.getPhysicalNumberOfCells();
			for(int j=0 ; j<colCount ; j++)
			{
				XSSFCell cell = row.getCell(j);

				String cellValue = getCellValue(cell);

				System.out.println(cellValue);
			}
			System.out.println( );

		}
		fileinput.close();

		workbook.close();

	}

	public static String getCellValue(XSSFCell cell)
	{
		switch(cell.getCellType())
		{
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());

		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());

		case STRING:
			return cell.getStringCellValue();

		default:
			return cell.getStringCellValue();
		}
	}

}
