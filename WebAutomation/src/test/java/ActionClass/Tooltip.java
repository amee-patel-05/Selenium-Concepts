package ActionClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(a);
		
		a.get("https://www.google.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchbox= a.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
		String tooltipText = searchbox.getAttribute("title");				// locate the tooltipn using title attribute value
		System.out.println("Tooltip text is here: "+tooltipText);
		Thread.sleep(2000);
			
		WebElement mousehover = a.findElement(By.xpath("//div[@class='XDyW0e']")); 
		
		action.moveToElement(mousehover).build().perform();					// locate the tooltip using action class
		Thread.sleep(2000);

		System.out.println("Successfully executed tooltip");
		
		/*WebElement tooltip= a.findElement(By.xpath("//div[@aria-label='Search by voice']"));
		
		String toolTipText = tooltip.getText();						// To get the tool tip text and assert 
		System.out.println("toolTipText-->"+toolTipText);*/
		
		a.close();
		
	}

}
