package ExtraFeatures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

public class Screenshot {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification

        WebDriver a = new ChromeDriver(options);

        a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        a.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);

        a.manage().window().maximize();
        Thread.sleep(2000);

        a.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);

        a.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);

        WebElement login = a.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        login.submit();
        Thread.sleep(2000);

        TakesScreenshot ts = (TakesScreenshot) a;

        //File

        a.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[6]")).click();  // Info tab
        Thread.sleep(4000);

        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("..\\AutomationConcepts\\WebAutomation\\screenshots\\Image1.png"));
        a.close();

        //Base64

//        a.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();   // admin tab
//        Thread.sleep(3000);
//
//        String base64 = ts.getScreenshotAs(OutputType.BASE64);
//        byte[] byteArr = Base64.getDecoder().decode(base64);
//        FileOutputStream fos = new FileOutputStream(new File("..\\AutomationConcepts\\WebAutomation\\screenshots\\Image2.jpg"));
//        fos.write(byteArr);
//        fos.close();
//        a.close();

        //byte

//        a.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[3]")).click();   // admin tab
//        Thread.sleep(3000);
//
//        byte[] bytArr = ts.getScreenshotAs(OutputType.BYTES);
//        FileOutputStream fos1 = new FileOutputStream(new File("..\\AutomationConcepts\\WebAutomation\\screenshots\\Image3.jpg"));
//        fos1.write(bytArr);
//        fos1.close();
//        a.close();

    }


}
