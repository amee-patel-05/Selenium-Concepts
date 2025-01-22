package ExtraFeatures;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSLCertificate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		// Global Profile
		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setAcceptInsecureCerts(true);
		//dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions options = new ChromeOptions();
		//options.merge(dc);
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		options.setAcceptInsecureCerts(true);

		WebDriver a = new ChromeDriver(options);
		
		a.get("https://expired.badssl.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(4000);
		
		System.out.println("Page title is : "+a.getTitle());
		
		a.close();
	}
}
