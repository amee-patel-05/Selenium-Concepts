package ExtraFeatures;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

//  Use AutoIT info and ScITE app for select the image from window page

public class AutoIT {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) a;
		
		/*Actions action = new Actions(a);
		a.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		WebElement upload = a.findElement(By.id("uploadPicture"));
		action.moveToElement(upload).click().perform();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\ameep\\OneDrive\\Documents\\UploadFile2_x64.exe");
		Thread.sleep(7000);*/
		
		/*Actions action = new Actions(a);
		a.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);
		
		WebElement upload = a.findElement(By.id("uploadFile"));  // Click on the upload button 
		action.moveToElement(upload).click().perform();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\ameep\\OneDrive\\Documents\\UploadFile2_x64.exe");  
		Thread.sleep(7000);*/
		
		// AutoIT script 
		/*ControlFocus("Open","","Edit1");
		Sleep(2000)
		ControlSetText("Open","","Edit1","D:\Resume\Ameepatel_Resume.docx");
		Sleep(2000)
		ControlClick("Open","","Button1");
		Sleep(2000)*/
		
		a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		a.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		
		a.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		
		WebElement login = a.findElement(By.xpath("//button[@type='submit']"));
		login.submit();
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		Thread.sleep(1000);
		 
		a.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(1000);
		
		WebElement upload = a.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"));
		upload.click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\ameep\\OneDrive\\Documents\\UploadFile3_x64.exe");  
		Thread.sleep(7000);
		
		// AutoIT Script
		/*ControlFocus("Open","","Edit1");
		Sleep(2000)
		ControlSetText("Open","","Edit1","C:\Users\ameep\Downloads\IMG-20240127-WA0079.jpg");
		Sleep(2000)
		ControlClick("Open","","Button1");
		Sleep(2000)*/
		
		a.close();
	}

}
