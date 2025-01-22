package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleAndRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});	// remove tester page notification	
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(a);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		WebElement doubleclickbtn = a.findElement(By.xpath("//button[starts-with(text(),'Double')]")); // Web Element of double click
		
		action.doubleClick(doubleclickbtn).perform();  // double click on the btn
		Thread.sleep(2000);

		WebElement doubletext = a.findElement(By.id("doubleClickMessage"));
		System.out.println("Display the double click text: "+doubletext.getText());
		
		WebElement rightclickbtn = a.findElement(By.id("rightClickBtn"));
		
		action.contextClick(rightclickbtn).perform();  // right click on the element
		Thread.sleep(2000);

		WebElement righttext = a.findElement(By.id("rightClickMessage"));
		System.out.println("Display the right click text: "+righttext.getText());

		System.out.println();

		System.out.println("Successfully executed double & right click");
		
		a.close();
	}

}
