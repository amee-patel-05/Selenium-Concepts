package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});	// remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		
		WebElement days = a.findElement(By.id("tuesday"));
		days.click();
		Thread.sleep(1000);
		
		System.out.println("Checkbox is selected or not: "+days.isSelected());
		Thread.sleep(1000);
		System.out.println("Checkbox is enable or not: "+days.isEnabled());
		Thread.sleep(1000);
		System.out.println("Checkbox is display or not: "+days.isDisplayed());
		Thread.sleep(1000);

		System.out.println("Successfully executed checkbox");
		
		a.close();
	}

}
