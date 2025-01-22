package AlertWindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,250)");			// Scroll the main page
		Thread.sleep(1000);
		
		a.findElement(By.id("name")).sendKeys("Main Webpage");			// enter text in text box
		Thread.sleep(1000);
		
		js.executeScript("window.scrollTo(0,500)");			// scroll the page
		Thread.sleep(1000);
		
		a.switchTo().frame("frm1");						// switch the main page to frame 1
		
		WebElement menu = a.findElement(By.id("selectnav1"));			// click on the dropdown menu
		menu.click();
		Thread.sleep(1000);
		
		Select menuitems = new Select(menu);				// select the option from drop down menu
		menuitems.selectByVisibleText("-- Selenium");
		Thread.sleep(1000);
		
		//js.executeScript("window.scrollBy(0,250)");
		//Thread.sleep(1000);
		a.switchTo().parentFrame();						// switch from frame1 to main page
		Thread.sleep(1000);
		
		WebElement frame2 = a.findElement(By.xpath("//h3[text()='Frame2:']"));			// scroll the page
		js.executeScript("arguments[0].scrollIntoView", frame2);
		Thread.sleep(1000);
		
		a.switchTo().frame("frm2");						// switch the main page to frame 2
		
		WebElement firstname = a.findElement(By.id("firstName"));			// enter the first name
		firstname.sendKeys("Amee");
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Patel");		// enter the last name 
		Thread.sleep(1000);
		
		a.findElement(By.id("femalerb")).click();		// click on the radio button
		Thread.sleep(1000);
		
		a.findElement(By.id("englishchbx")).click();	// click on the checkbox 
		Thread.sleep(1000);
		
		a.findElement(By.id("hindichbx")).click();		// click on the checkbox
		Thread.sleep(1000);
		
		a.switchTo().parentFrame();						// switch from frame 2 to main page
		Thread.sleep(1000);
		
		WebElement text = a.findElement(By.id("frm3"));			// switch from main page to frame 3
		a.switchTo().frame(text);
		Thread.sleep(1000);
		
		a.findElement(By.id("name")).sendKeys("Frame 3 text box");		//  enter the text in main page text box
		Thread.sleep(1000);
		
		a.switchTo().defaultContent();			//  switch back to main page
		Thread.sleep(1000);
		
		a.findElement(By.id("name")).clear();		// clear the text box value
		Thread.sleep(2000);
		
		a.findElement(By.id("name")).sendKeys("Back to main webpage");		// enter  new value in text box
		Thread.sleep(1000);

		System.out.println("Successfully executed Frames");
			
		a.close();

	}

}
