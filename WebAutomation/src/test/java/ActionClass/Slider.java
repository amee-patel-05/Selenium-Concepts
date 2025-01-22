package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver();
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(a);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		
		WebElement slider = a.findElement(By.id("slider"));		// move to element using coordinates
		action.moveToElement(slider,50,0).click().perform();
		Thread.sleep(2000);

		System.out.println("Successfully executed slider");
		
		a.close();

	}

}
