package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class EffectiveXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification

		WebDriver a = new ChromeDriver(options);
		
		JavascriptExecutor js = (JavascriptExecutor) a;
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		/*a.findElement(By.xpath("//input[@id = 'userName' and @placeholder = 'Full Name']")).sendKeys("ameepatel");  // And function
		Thread.sleep(2000);*/
		
		a.findElement(By.xpath("//input[@id = 'userName' or @placeholder = 'Full Name']")).sendKeys("ameepatel");		// Or function
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[starts-with(@id ,'userE')]")).sendKeys("ameepatel251@gmail.com");		//  starts with function
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//textarea[contains(@id , 'current')]")).sendKeys("Canada");		// contains function
		Thread.sleep(2000);

		/*js.executeScript("arguments[0].scrollIntoView();", submit);
		Thread.sleep(2000);*/

		a.findElement(By.xpath("//textarea[contains(@id ,'per')]")).sendKeys("India");
		Thread.sleep(2000);

		WebElement submit = a.findElement(By.xpath("//button[text() = 'Submit']"));			// text function
		submit.click();
		Thread.sleep(2000);

		System.out.println("Successfully executed effectivexpath");
		
		a.close();
	}

}
