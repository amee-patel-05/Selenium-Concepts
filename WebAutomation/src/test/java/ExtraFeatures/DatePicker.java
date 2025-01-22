package ExtraFeatures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		Actions action = new Actions(a);
		
		/*a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		WebElement frame1 = a.findElement(By.id("frame-one796456169"));
		a.switchTo().frame(frame1);
		Thread.sleep(1000);
		
		WebElement calenderbtn =  a.findElement(By.xpath("//span[@class='icon_calendar']"));
		calenderbtn.click();
		Thread.sleep(2000);
		
		WebElement yearbtn = a.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		yearbtn.click();
		Thread.sleep(2000);
		
		Select year = new Select(yearbtn);
		year.selectByValue("1997");
		Thread.sleep(2000);
		
		for(int i=0; i < 5; i++) {
			a.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			Thread.sleep(1000);	
		}
		
		a.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a[contains(text(),'13')]")).click();
		Thread.sleep(2000);
		
		WebElement jobbtn = a.findElement(By.id("RESULT_RadioButton-3"));
		jobbtn.click();
		Thread.sleep(1000);
		
		Select job = new Select(jobbtn);
		job.selectByIndex(2);
		Thread.sleep(2000);*/
	
		a.get("https://www.airindia.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);

		a.findElement(By.id("onetrust-accept-btn-handler")).click();  // Click on the All cookies button
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@class='btn bi bi-calendar3']")).click();	// Click on the Deptaure Date button
		Thread.sleep(2000);
		
		for (int i=0 ;i < 3 ;i++)
		{
			a.findElement(By.xpath("//button[@aria-label='Next month']")).click();   // Click on the Next button
			Thread.sleep(1000);
		}
		
		a.findElement(By.xpath("//div[@aria-label='Thursday, June 6, 2024']")).click();   // Click on the Date
		Thread.sleep(2000);

		/*a.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		Thread.sleep(2000);
		
		a.findElement(By.xpath("(//input[@class='btn bi bi-calendar3'])[2]")).click();  // Click on the Return Date
		Thread.sleep(2000);*/

		for (int i=0 ;i < 2 ;i++)
		{
			a.findElement(By.xpath("//button[@aria-label='Next month']")).click();   // Click on the Next button
			Thread.sleep(1000);
		}
		
		a.findElement(By.xpath("//div[@aria-label='Thursday, September 12, 2024']")).click();  // Select the Date
		Thread.sleep(2000);
		
		a.close();
	}

}
