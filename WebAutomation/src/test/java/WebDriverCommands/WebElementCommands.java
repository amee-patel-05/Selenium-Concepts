package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		boolean d= a.findElement(By.id("name")).isDisplayed();    // isDisplay method
		System.out.println("Element is display on page : "+d);
		Thread.sleep(1000);
		
		boolean e= a.findElement(By.id("name")).isEnabled();		// isEnable method
		System.out.println("Element is enable on page: "+e);
		Thread.sleep(1000);

		boolean s=a.findElement(By.id("name")).isSelected();		// is Select method
		System.out.println("Element is select on page: "+s);
		Thread.sleep(1000);
		
		String text= a.findElement(By.linkText("orange HRM")).getText();		// getText method
		System.out.println("Print the text: "+text);
		Thread.sleep(1000);
		
		String attribute = a.findElement(By.id("email")).getAttribute("id");	// getAttribute method
		System.out.println("Get the attribute value: "+attribute);
		Thread.sleep(1000);
			
		WebElement email = a.findElement(By.id("email"));						//  getSize method
		org.openqa.selenium.Dimension dimensions = email.getSize();
		System.out.println("Height :"+ dimensions.height + "  Width : " + dimensions.width);
		Thread.sleep(1000);		
		
		org.openqa.selenium.Point point = email.getLocation();					//  getLocation method 
		System.out.println("X cordinate: " + point.x  +  " Y cordinate: " + point.y);
		Thread.sleep(1000);

		System.out.println("Successfully executed webelements");
		a.close();

	}

}
