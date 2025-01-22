package WebDriverCommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		
		WebDriver a = new ChromeDriver(options	);
		
		JavascriptExecutor js = (JavascriptExecutor)a;
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		// Single Selection
		
		WebElement gender = a.findElement(By.xpath("//label[text()='Gender:']"));
		js.executeScript("arguments[0].scrollIntoView()", gender);
		Thread.sleep(3000);
		
		WebElement country = a.findElement(By.xpath("//select[@id='country']"));
		country.click();
		Thread.sleep(2000);
		
		Select countryname = new Select(country);
		countryname.selectByIndex(9);					// selectByIndex option
		Thread.sleep(2000);
		
		countryname.selectByValue("australia");			// selectByValue option
		Thread.sleep(2000);
		
		countryname.selectByVisibleText("Canada");		// selectByVisibleText option
		Thread.sleep(2000);
		
		// click on the option without using Select class
		
		/*a.findElement(By.xpath("//option[starts-with(@value,'ind')]")).click(); 
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//option[contains(@value,'stral')]")).click();
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//option[text()='Canada']")).click();
		Thread.sleep(2000);*/
		
		// Multiple Selection 
		
		WebElement colors = a.findElement(By.id("colors"));
		Select colors_ID = new Select(colors);
		colors_ID.selectByIndex(0);
		Thread.sleep(2000);
		
		colors_ID.selectByValue("green");
		Thread.sleep(2000);
		
		WebElement yellow = a.findElement(By.xpath("//option[@value='yellow']"));
		js.executeScript("arguments[0].scrollIntoView", yellow);
		Thread.sleep(2000);
		
		colors_ID.selectByVisibleText("White");
		Thread.sleep(2000);
		
		// deselect options
		
		/*colors_ID.deselectAll();
		Thread.sleep(2000);*/
		
		/*colors_ID.deselectByIndex(0);
		Thread.sleep(2000);
		
		colors_ID.deselectByValue("green");
		Thread.sleep(2000);
		
		colors_ID.deselectByVisibleText("White");
		Thread.sleep(2000);*/
		
		
		// get options method
		
		List <WebElement> countrynameAvailable = countryname.getOptions();   // get all the options
		System.out.println("Display list of countryname : ");
		for(WebElement webElement : countrynameAvailable){
			System.out.println(webElement.getText());
		}
		
		List <WebElement> multiselectedoptions = colors_ID.getAllSelectedOptions();		// get multiselected options
		System.out.println("Display list of colorsname : ");
		for(WebElement webElement : multiselectedoptions){
			System.out.println(webElement.getText());
		}
		
		System.out.println("Display the first selected country name :  ");			// get the first selected option  display the last selected option
		System.out.println(countryname.getFirstSelectedOption().getText());

		System.out.println("Succesfully executed dropdown");

	//	a.close();
	}

}
