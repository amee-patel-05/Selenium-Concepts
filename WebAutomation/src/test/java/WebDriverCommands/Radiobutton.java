package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		
		WebElement gender = a.findElement(By.xpath("//input[@value='female']"));
		gender.click();
		Thread.sleep(1000);
		
		System.out.println("Radiobutton is selected or not: "+gender.isSelected());
		Thread.sleep(1000);
		System.out.println("Radiobutton is enable or not: "+gender.isEnabled());
		Thread.sleep(1000);
		System.out.println("Radiobutton is display or not: "+gender.isDisplayed());
		Thread.sleep(1000);

		System.out.println("Successfully executed radiobutton");
		
		a.close();

	}

}
