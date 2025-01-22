package AlertWindow;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,250)");					// scroll the page
		Thread.sleep(2000);
		
		String mainHandle = a.getWindowHandle();					// get the main window ID
		System.out.println("Main window is: "+mainHandle);
		
		a.findElement(By.id("newWindowBtn")).click();			// Click on the New window button
		Thread.sleep(2000);
		
		Set<String> handles = a.getWindowHandles();			// get the Id of both main and child window
		System.out.println("Multiple window is: "+handles);
		
		Iterator<String> iterator = handles.iterator();			// iterator point the first window to next window
		String parentwindow = iterator.next();
		System.out.println("Parent window : "+parentwindow);		// Display the parent window ID
		String childwindow = iterator.next();
		System.out.println("Child window : "+childwindow);			// Display the child window ID
		
		a.switchTo().window(childwindow);			// Switch to child window
		Thread.sleep(2000);
		
		a.manage().window().maximize();			// maximize it
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,700)");			// Scroll it			
		Thread.sleep(2000);
		
		a.findElement(By.id("firstName")).sendKeys("Amee");		// enter first name
		Thread.sleep(2000);
		
		a.findElement(By.name("lName")).sendKeys("Patel");		// enter last name
		Thread.sleep(2000);
		
		a.close();					// close the child window
		Thread.sleep(2000);
		
		a.switchTo().window(parentwindow);		// switch to parent window
		Thread.sleep(2000);
		
		a.findElement(By.cssSelector(".whTextBox")).sendKeys("Get back to main window");		// enter the text in main window
		Thread.sleep(2000);

		System.out.println("Successfully executed Windows");
		
		a.close();

	}

}
