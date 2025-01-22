package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

// Generate new test1.xls and test2.xlsx files in resources folder

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Create the Old Excel File and Enter the student details

//		HSSFWorkbook workbook = new HSSFWorkbook();
//
//		HSSFSheet sheet = workbook.createSheet("StudentData");
//
//		HSSFRow row0 =sheet.createRow(0);
//
//		row0.createCell(0).setCellValue("No");
//		row0.createCell(1).setCellValue(" First Name");
//		row0.createCell(2).setCellValue("Second Name");
//		row0.createCell(3).setCellValue("Email ID");
//		row0.createCell(4).setCellValue("Mobile Number");
//		row0.createCell(5).setCellValue("Gender");
//		row0.createCell(6).setCellValue("Address");
//
//		HSSFRow row1 = sheet.createRow(1);
//
//		row1.createCell(0).setCellValue(1);
//		row1.createCell(1).setCellValue(" Amee");
//		row1.createCell(2).setCellValue(" Patel ");
//		row1.createCell(3).setCellValue(" ameepatel251@gmail.com");
//		row1.createCell(4).setCellValue(" 3828855597");
//		row1.createCell(5).setCellValue(" Female");
//		row1.createCell(6).setCellValue(" 148 Breckenridge Dr");
//
//		HSSFRow row2 = sheet.createRow(2);
//
//		row2.createCell(0).setCellValue(2);
//		row2.createCell(1).setCellValue(" Bhavya");
//		row2.createCell(2).setCellValue(" Patel ");
//		row2.createCell(3).setCellValue(" patelbhavya.cs@gmail.com");
//		row2.createCell(4).setCellValue(" 5195804427");
//		row2.createCell(5).setCellValue(" Male");
//		row2.createCell(6).setCellValue(" 75 King Street");
//
//		File file = new File("..\\AutomationConcepts\\WebAutomation\\resources\\test1.xls");
//
//		FileOutputStream outputstream = new FileOutputStream(file);
//
//		workbook.write(outputstream);
//
//		workbook.close();

		/*File file = new File("..\\AutomationConcepts\\WebAutomation\\resources\\test1.xls");

		FileOutputStream outputstream = new FileOutputStream(file);

		workbook.write(outputstream);

		workbook.close(); */

		// Create  New excel file using new method XSSF and file extention is xlsx
		
//		XSSFWorkbook workbook = new XSSFWorkbook();
//
//		XSSFSheet sheet = workbook.createSheet("Studentdata");
//
//		XSSFRow row0 = sheet.createRow(0);
//
//		row0.createCell(0).setCellValue("No");
//		row0.createCell(1).setCellValue(" First Name");
//		row0.createCell(2).setCellValue("Second Name");
//		row0.createCell(3).setCellValue("Email ID");
//		row0.createCell(4).setCellValue("Mobile Number");
//		row0.createCell(5).setCellValue("Gender");
//		row0.createCell(6).setCellValue("Address");
//		row0.createCell(7).setCellValue("Birth Date");
//		row0.createCell(8).setCellValue("Active");
//
//		XSSFRow row1 = sheet.createRow(1);
//
//		row1.createCell(0).setCellValue(1);
//		row1.createCell(1).setCellValue(" Amee");
//		row1.createCell(2).setCellValue(" Patel ");
//		row1.createCell(3).setCellValue(" ameepatel251@gmail.com");
//		row1.createCell(4).setCellValue(" 3828855597");
//		row1.createCell(5).setCellValue(" Female");
//		row1.createCell(6).setCellValue(" 148 Breckenridge Dr");
//		row1.createCell(7).setCellValue(" 1997/05/05");
//		row1.createCell(8).setCellValue(true);
//
//		XSSFRow row2 = sheet.createRow(2);
//
//		row2.createCell(0).setCellValue(2);
//		row2.createCell(1).setCellValue(" Bhavya");
//		row2.createCell(2).setCellValue(" Patel ");
//		row2.createCell(3).setCellValue(" patelbhavya.cs@gmail.com");
//		row2.createCell(4).setCellValue(" 5195804427");
//		row2.createCell(5).setCellValue(" Male");
//		row2.createCell(6).setCellValue(" 75 King Street");
//		row2.createCell(7).setCellValue(" 1998/01/25");
//		row2.createCell(8).setCellValue(false);
//
//		XSSFRow row3 = sheet.createRow(3);
//
//		row3.createCell(0).setCellValue(3);
//		row3.createCell(1).setCellValue(" Smit");
//		row3.createCell(2).setCellValue(" Patel ");
//		row3.createCell(3).setCellValue(" smitpatel2111@gmail.com");
//		row3.createCell(4).setCellValue(" 7698753110");
//		row3.createCell(5).setCellValue(" Male");
//		row3.createCell(6).setCellValue(" 2 Umiya Society ");
//		row3.createCell(7).setCellValue(" 2004/11/21");
//		row3.createCell(8).setCellValue(true);
//
//
//
//		FileOutputStream file = new FileOutputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test2.xlsx");
//
//		workbook.write(file);
//
//		workbook.close();
		

		// Create new row in exciting file


		File file1 = new File("..\\AutomationConcepts\\WebAutomation\\resources\\test2.xlsx");   // give the path of the file

		FileInputStream fileinput = new FileInputStream(file1);   // read the file

		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);		// open new workbook

		XSSFSheet sheet = workbook.getSheet("Studentdata");			// get the sheet from workbook

		XSSFRow row5 = sheet.createRow(4);			// create new row in sheet

		row5.createCell(0).setCellValue(4);					// create new cells in 1 row
		row5.createCell(1).setCellValue(" Arth");
		row5.createCell(2).setCellValue(" Patel");
		row5.createCell(3).setCellValue(" arthpatel2105@gmail.com");
		row5.createCell(4).setCellValue(" 5197169459");
		row5.createCell(5).setCellValue(" Male");
		row5.createCell(6).setCellValue(" 125 Weber Street ");
		row5.createCell(7).setCellValue(" 2001/05/21");
		row5.createCell(8).setCellValue(true);

		FileOutputStream fileoutput = new FileOutputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test2.xlsx");

		workbook.write(fileoutput);

		workbook.close();

	}

}
