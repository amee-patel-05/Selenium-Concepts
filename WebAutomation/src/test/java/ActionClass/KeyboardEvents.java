package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver();
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(a);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement fullname = a.findElement(By.id("userName"));
		
		action.keyDown(fullname, Keys.SHIFT)
		.sendKeys("a")
		.keyUp(Keys.SHIFT)
		.sendKeys("mee")
		.build().perform();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.SPACE).perform();
		Thread.sleep(1000);
		
		action.keyDown(fullname, Keys.SHIFT)
		.sendKeys("p")
		.keyUp(Keys.SHIFT)
		.sendKeys("atel")
		.build().perform();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		
		WebElement email = a.findElement(By.id("userEmail"));
		email.sendKeys("ameepatel251@gmail.com");
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		
		WebElement currentaddress = a.findElement(By.id("currentAddress"));
		//currentaddress.sendKeys("148 Breckenridge Drive Kitchener ");
		
		action.sendKeys(currentaddress, "148").perform();
		Thread.sleep(500);
		
		action.sendKeys(Keys.SPACE).perform();
		
		action.keyDown(currentaddress, Keys.SHIFT)
		.sendKeys("b")
		.keyUp( Keys.SHIFT)
		.sendKeys("reckenridge")
		.build().perform();
		
		action.sendKeys(Keys.SPACE).perform();
		Thread.sleep(500);
		
		action.keyDown(currentaddress, Keys.SHIFT)
		.sendKeys("d")
		.keyUp(Keys.SHIFT)
		.sendKeys("rive")
		.build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build().perform();
		Thread.sleep(1000);
		
		action.keyDown(Keys.CONTROL)
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build().perform();
		Thread.sleep(1000);
		
		WebElement permanentaddress = a.findElement(By.id("permanentAddress"));
		//action.sendKeys(Keys.TAB).perform();
		Thread.sleep(500);
		
		action.keyDown(permanentaddress, Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL)
		.build().perform();
		Thread.sleep(1000);		
		
		WebElement btn = a.findElement(By.id("submit"));
		btn.submit();

		System.out.println("Successfully excuted keyboardevents");

		a.close();

	}

}
