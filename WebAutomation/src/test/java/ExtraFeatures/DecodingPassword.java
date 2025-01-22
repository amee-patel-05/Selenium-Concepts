package ExtraFeatures;

import java.time.Duration;

import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DecodingPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String str = "admin123";
		
		byte[] encodedString = Base64.encodeBase64(str.getBytes());
		System.out.println("Encoded String : "+new String(encodedString));
		
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("Decoded String : "+new String(decodedString));
		
		/*WebDriverManager.chromedriver().setup();
		
		WebDriver a = new ChromeDriver();
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		a.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		
		a.findElement(By.name("password")).sendKeys(decodedString("YWRtaW4xMjM="));
		Thread.sleep(1000);
		
		a.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(1000);
		
		
		static String decodedString(String password)
		{
			byte[] decodedString = Base64.decodeBase64(password);
			return(new String(decodedString));
		}*/
			

	}

}
