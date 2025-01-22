package ApachePOI;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

// Generate test4.xlsx file and read the data from the same file


public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// Create New Excel file 
		
//		XSSFWorkbook workbook = new XSSFWorkbook();
//
//		XSSFSheet sheet = workbook.createSheet("Studentdata");
//
//		XSSFRow row0 = sheet.createRow(0);
//
//		row0.createCell(0).setCellValue(" Full Name ");
//		row0.createCell(1).setCellValue(" Email ID");
//		row0.createCell(2).setCellValue(" Current Address");
//		row0.createCell(3).setCellValue(" Permanent Address");
//
//		XSSFRow row1 = sheet.createRow(1);
//
//		row1.createCell(0).setCellValue(" Amee Patel ");
//		row1.createCell(1).setCellValue(" ameepatel251@gmail.com");
//		row1.createCell(2).setCellValue(" 148 Breckenridge Drive");
//		row1.createCell(3).setCellValue(" 148 Breckenridge Drive");
//
//
//		XSSFRow row2 = sheet.createRow(2);
//
//		row2.createCell(0).setCellValue(" Bhavya Patel ");
//		row2.createCell(1).setCellValue(" bhavyapatel251@gmail.com");
//		row2.createCell(2).setCellValue(" 25 King Street");
//		row2.createCell(3).setCellValue(" 25 King Street");
//
//		XSSFRow row3 = sheet.createRow(3);
//
//		row3.createCell(0).setCellValue(" Smit Patel ");
//		row3.createCell(1).setCellValue(" smitpatel2111@gmail.com");
//		row3.createCell(2).setCellValue(" 2 Umiya Society");
//		row3.createCell(3).setCellValue(" 2 Umiya Society");
//
//		FileOutputStream file = new FileOutputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test4.xlsx");
//
//		workbook.write(file);
//
//		workbook.close();


		// Enter the created excel file date into web application



		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification

		WebDriver a = new ChromeDriver(options);

		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		a.get("https://demoqa.com/text-box");
		Thread.sleep(2000);

		a.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) a;
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);

		FileInputStream fileinput = new FileInputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test4.xlsx");  // getting data from excel file

		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);	// get workbook instance for XLS file

		XSSFSheet sheet = workbook.getSheetAt(0);		// Get first sheet form workbook

		int rows = sheet.getLastRowNum();  	// get first row from sheet

		System.out.println("No of rows in excel sheet : "+rows);

		for (int i = 1 ; i <= rows ; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);

			String FullName = currentrow.getCell(0).getStringCellValue();
			String Email = currentrow.getCell(1).getStringCellValue();
			String CurrentAddress = currentrow.getCell(2).getStringCellValue();
			String PermanentAddress = currentrow.getCell(3).getStringCellValue();


			// Enter the data on web page text fields

			WebElement name = a.findElement(By.id("userName"));
			name.sendKeys(FullName);
			Thread.sleep(1000);

			WebElement mail = a.findElement(By.id("userEmail"));
			mail.sendKeys(Email);
			Thread.sleep(1000);

			WebElement address = a.findElement(By.id("currentAddress"));
			address.sendKeys(CurrentAddress);
			Thread.sleep(1000);

			WebElement address1 =a.findElement(By.id("permanentAddress"));
			address1.sendKeys(PermanentAddress);
			Thread.sleep(1000);

			// Click on the button

			a.findElement(By.id("submit")).click();

			name.clear();
			Thread.sleep(500);

			mail.clear();
			Thread.sleep(500);

			address.clear();
			Thread.sleep(500);

			address1.clear();
			Thread.sleep(500);

		}

		workbook.close();

		//a.close();
	}

}
