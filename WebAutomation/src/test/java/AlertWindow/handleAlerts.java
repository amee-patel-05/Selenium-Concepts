package AlertWindow;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleAlerts {

	private static Logger logger = LogManager.getLogger(handleAlerts.class);

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});	// remove tester page notification
		Thread.sleep(1000);
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		// Simple Alert
		
		a.findElement(By.xpath("//button[text()='Alert']")).click();
		Alert simpleAlert = a.switchTo().alert();
		System.out.println("Simple Alert text is here:  "+simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();
		Thread.sleep(2000);
		
		// Confirmation Alert      // Accept
		
		a.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert confirmationAlert = a.switchTo().alert();
		System.out.println("Confirmation Alert text is here:  "+confirmationAlert.getText());
		Thread.sleep(2000);
		confirmationAlert.accept();
		Thread.sleep(2000);
		System.out.println(a.findElement(By.id("demo")).getText());
		Thread.sleep(1000);
		
		// Confirmation Alert      // Dismiss
		
		/*a.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert confirmationAlert = a.switchTo().alert();
		System.out.println("Confirmation Alert text is here:  "+confirmationAlert.getText());
		Thread.sleep(2000);
		confirmationAlert.dismiss();
		Thread.sleep(2000);
		System.out.println(a.findElement(By.id("demo")).getText());
		Thread.sleep(2000);*/
		
		// Prompt Alert    Accept
		
		a.findElement(By.xpath("//button[text()='Prompt']")).click();
		Alert promptAlert = a.switchTo().alert();
		System.out.println("Prompt ALert text is here:  "+promptAlert.getText());
		Thread.sleep(2000);
		promptAlert.sendKeys("Amee Patel");
		Thread.sleep(2000);
		promptAlert.accept();
		Thread.sleep(2000);
		System.out.println(a.findElement(By.id("demo")).getText());
		Thread.sleep(1000);
		
		// Prompt Alert    Dismiss
		
		/*a.findElement(By.xpath("//button[text()='Prompt']")).click();
		Alert promptAlert = a.switchTo().alert();
		System.out.println("Prompt ALert text is here:  "+promptAlert.getText());
		Thread.sleep(2000);
		promptAlert.sendKeys("Amee Patel");
		Thread.sleep(3000);
		promptAlert.dismiss();
		Thread.sleep(2000);
		System.out.println(a.findElement(By.id("demo")).getText());
		Thread.sleep(2000);*/

		System.out.println("Successfully executed Alerts");
		
		a.close();

	}

}
