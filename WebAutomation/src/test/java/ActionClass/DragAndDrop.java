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

public class DragAndDrop {

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
		
		js.executeScript("window.scrollTo(0,400)");
		Thread.sleep(2000);
		
		WebElement drag = a.findElement(By.id("draggable"));
		WebElement drop = a.findElement(By.id("droppable"));
		
		// use anyone method for grag and drop element 

		action.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
				
		/*action.dragAndDropBy(drag, 140, 30).build().perform();
		Thread.sleep(2000);*/
				
		/*action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		Thread.sleep(2000);*/

		System.out.println("Successfully executed drag and drop");

		a.close();

	}

}
