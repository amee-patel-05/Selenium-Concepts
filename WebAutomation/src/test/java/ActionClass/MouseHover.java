package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver();
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(a);
		
		a.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement tutorials = a.findElement(By.xpath("//a[text()='Tutorials']"));	// mouse hover element
		action.moveToElement(tutorials).perform();
		Thread.sleep(2000);
		
		WebElement testing = a.findElement(By.linkText("Testing"));			// mouse hover element 
		action.moveToElement(testing).perform();
		Thread.sleep(2000);
		
		WebElement automationtesting = a.findElement(By.partialLinkText("Automation "));	// mouse hover element and click it 
		action.moveToElement(automationtesting).click().perform();
		Thread.sleep(2000);

		System.out.println("Successfully executed mousehover");

		a.close();

	}

}
