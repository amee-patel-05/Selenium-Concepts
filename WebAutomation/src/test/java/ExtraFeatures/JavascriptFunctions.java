package ExtraFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavascriptFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification

		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor)a;
		
		// Scroll operations using JavascriptExecutor
		
		/*js.executeScript("window.scrollTo(0,250)");	// scrollTo method
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,250)");	// scrollBy method
		Thread.sleep(2000);
		
		WebElement webtable = a.findElement(By.xpath("//h2[contains(text(),'Web Table')]"));  // scroll the page at the WebElement
		js.executeScript("arguments[0].scrollIntoView", webtable);
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");		// scrollTo at the bottom of the page
		Thread.sleep(2000);*/
		
		// Enter text in Text box using JavascriptExecutor
		
		js.executeScript("document.getElementById('name').value='Amee Patel'");   // FindElement(Javascript) + Text (Javascript)
		Thread.sleep(2000);
		
		WebElement email = a.findElement(By.id("email"));
		js.executeScript("arguments[0].value='ameepatel251@gmail.com'", email);	  // FindElement(WebDriver) + Text (Javascript)
		Thread.sleep(2000);
		
		String text = (String) js.executeScript("return document.getElementById('email').value");
		System.out.println(text);
		Thread.sleep(1000);
		
		//  Click operation using JavascriptExecutor
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('female').click()");		// FindElement(Javascript) + Text (Javascript)
		Thread.sleep(2000);
		
		WebElement days = a.findElement(By.id("monday"));			 // FindElement(WebDriver) + Text (Javascript)
		js.executeScript("arguments[0].click()", days);
		Thread.sleep(2000);
		
		// Highlight Web Elements using javascriptExecutor
		
		js.executeScript("window.scrollTo(0,250)");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('textarea').setAttribute('style' , 'border: 3px dotted red ; background: gray');");
		Thread.sleep(2000);
		
		WebElement phone = a.findElement(By.id("phone"));
		js.executeScript("arguments[0].setAttribute('style' , 'border: 3px dotted red ; background: gray');", phone);
		Thread.sleep(2000);

		System.out.println("Successfully executed JavascriptExecutor commands");

		a.close();
	}

}
