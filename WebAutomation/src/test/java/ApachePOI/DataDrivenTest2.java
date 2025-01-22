package ApachePOI;

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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

// Generate new test3.xlsx file and use it to read data from this file

public class DataDrivenTest2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		// Create New Excel file 
		
//		XSSFWorkbook workbook = new XSSFWorkbook();
//
//		XSSFSheet sheet = workbook.createSheet("Studentdata");
//
//		XSSFRow row0 = sheet.createRow(0);
//
//		row0.createCell(0).setCellValue(" First Name");
//		row0.createCell(1).setCellValue(" Last Name ");
//		row0.createCell(2).setCellValue(" Email ID");
//		row0.createCell(3).setCellValue(" Gender");
//		row0.createCell(4).setCellValue(" Mobile Number");
//		row0.createCell(5).setCellValue(" Birth Date");
//		row0.createCell(6).setCellValue(" Subject");
//		row0.createCell(7).setCellValue(" Hobbies");
//		row0.createCell(8).setCellValue(" Current Address");
//
//		XSSFRow row1 = sheet.createRow(1);
//
//		row1.createCell(0).setCellValue(" Amee");
//		row1.createCell(1).setCellValue(" Patel");
//		row1.createCell(2).setCellValue(" ameepatel251@gmail.com ");
//		row1.createCell(3).setCellValue(" Female");
//		row1.createCell(4).setCellValue(" 3828855597");
//		row1.createCell(5).setCellValue(" 1997/05/05");
//		row1.createCell(6).setCellValue(" Maths");
//		row1.createCell(7).setCellValue(" Reading");
//		row1.createCell(8).setCellValue(" 148 Breckenridge Dr");
//
//
//		FileOutputStream file = new FileOutputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test3.xlsx");
//
//		workbook.write(file);
//
//		workbook.close();


		// Enter the created excel file data into the web application


		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification

		WebDriver a = new ChromeDriver(options);

		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) a;

		a.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);

		a.manage().window().maximize();
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,150)");
		Thread.sleep(1000);

		FileInputStream fileinput = new FileInputStream("..\\AutomationConcepts\\WebAutomation\\resources\\test3.xlsx");  // getting data from excel file

		XSSFWorkbook workbook = new XSSFWorkbook(fileinput);	// get workbook instance for XLS file

		XSSFSheet sheet = workbook.getSheetAt(0);		// Get first workbook form sheet

		int rows = sheet.getLastRowNum();  	// get first row from sheet

		System.out.println("No of rows in excel sheet : "+rows);

		for (int i = 1 ; i <= rows ; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);

			String FirstName = currentrow.getCell(0).getStringCellValue();
			String LastName = currentrow.getCell(1).getStringCellValue();
			String EmailID = currentrow.getCell(2).getStringCellValue();
			String MobileNumber = currentrow.getCell(3).getStringCellValue();
			String Subject = currentrow.getCell(4).getStringCellValue();
			String CurrentAddress = currentrow.getCell(5).getStringCellValue();


			WebElement firstname = a.findElement(By.id("firstName"));
			firstname.sendKeys(FirstName);
			Thread.sleep(2000);

			WebElement lastname = a.findElement(By.id("lastName"));
			lastname.sendKeys(LastName);
			Thread.sleep(2000);

			WebElement mail = a.findElement(By.id("userEmail"));
			mail.sendKeys(EmailID);
			Thread.sleep(2000);

			WebElement gender = a.findElement(By.id("gender-radio-2"));
			js.executeScript("arguments[0].click()", gender);
			Thread.sleep(2000);

			WebElement number = a.findElement(By.id("userNumber"));
			number.sendKeys(MobileNumber);
			Thread.sleep(2000);

			WebElement date = a.findElement(By.id("dateOfBirthInput"));
			date.click();
			Thread.sleep(1000);

			WebElement year = a.findElement(By.cssSelector(".react-datepicker__year-select"));
			Select select = new Select(year);
			select.selectByVisibleText("1997");
			Thread.sleep(500);

			WebElement month = a.findElement(By.cssSelector(".react-datepicker__month-select"));
			Select select1 = new Select(month);
			select1.selectByVisibleText("May");
			Thread.sleep(500);

			a.findElement(By.xpath("//div[contains(text(),'5')]")).click();
			Thread.sleep(500);

			js.executeScript("window.scrollBy(0,150)");
			Thread.sleep(1000);

			WebElement subject = a.findElement(By.xpath("//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']"));
			subject.sendKeys(Subject);
			Thread.sleep(2000);

			WebElement hobbies =a.findElement(By.id("hobbies-checkbox-2"));
			hobbies.click();
			Thread.sleep(3000);

			WebElement picture = a.findElement(By.id("uploadPicture"));
			picture.click();
			Thread.sleep(1000);

			Runtime.getRuntime().exec("C:\\Users\\ameep\\OneDrive\\Documents\\UploadFile3_x64.exe");
			Thread.sleep(2000);

			WebElement address = a.findElement(By.id("currentAddress"));
			address.sendKeys(CurrentAddress);
			Thread.sleep(2000);

			WebElement btn = a.findElement(By.id("submit"));
			btn.submit();
			Thread.sleep(2000);

			// Clear the webelement for enter next student details

			firstname.clear();
			Thread.sleep(500);

			lastname.clear();
			Thread.sleep(500);

			mail.clear();
			Thread.sleep(500);

			gender.clear();
			Thread.sleep(500);

			number.clear();
			Thread.sleep(500);

			date.clear();
			Thread.sleep(500);

//			subject.clear();
//			Thread.sleep(500);

			hobbies.clear();
			Thread.sleep(500);

			picture.clear();
			Thread.sleep(500);

			address.clear();
			Thread.sleep(500);

		}

		workbook.close();
	}

}
