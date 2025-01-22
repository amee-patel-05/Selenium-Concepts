package WebDriverCommands;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

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
		
		JavascriptExecutor js = (JavascriptExecutor) a;
		
		/*js.executeScript("window.scrollTo(0, 1000)");
		Thread.sleep(2000);
		
		System.out.println("Web Table");
		System.out.println();
		
		List<WebElement> rowelements = a.findElements(By.xpath("//*[@name='BookTable']/tbody/tr"));
		System.out.println("Total number of rows : "+rowelements.size());
		Thread.sleep(1000);
		int rowsize = rowelements.size();
		
		List<WebElement> columelements = a.findElements(By.xpath("//*[@name='BookTable']/tbody/tr[2]/td"));
		System.out.println("Total number of colums : "+columelements.size());
		Thread.sleep(1000);
		int colsize = columelements.size();
		
		for(int i=1; i<=rowsize; i++)
		{
			for(int j=1;j<=colsize; j++)
			{
					System.out.println(a.findElement(By.xpath("//*[@name='BookTable']/tbody/tr["+ i +"]/td["+ j +"]")).getText());	
			}
			System.out.println();
		}*/
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		System.out.println("Pagination Table");
		System.out.println();
		
		List<WebElement> rowelements1 = a.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr"));
		System.out.println("Total number of rows : "+rowelements1.size());
		Thread.sleep(1000);
		int rowsize1 = rowelements1.size();
		
		List<WebElement> columelements1 = a.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td"));
		System.out.println("Total number of colums : "+columelements1.size());
		Thread.sleep(1000);
		int colsize1 = columelements1.size();
		
		for(int i=1; i<=rowsize1; i++)
		{
			for(int j=1;j<=colsize1; j++)
			{
					System.out.println(a.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText());	
			}
			System.out.println();
		}
		a.close();


	}

}
