package ExtraFeatures;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification

		WebDriver a = new ChromeDriver(options);

		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Robot robot = new Robot();

		

		// methods KeyPress, KeyRelease, mousePress, mouseRelease, mouseMove,
		// mouseWheel, delay, createScreenCapture
		// popup , upload and download file handle mouse and keyboard events

		/*a.get("https://demoqa.com/text-box"); 
		 Thread.sleep(2000);
		 
		 a.manage().window().maximize(); 
		 Thread.sleep(2000);
		 
		 robot.mouseWheel(30); 
		 Thread.sleep(1000);
		 
		 WebElement fullname = a.findElement(By.id("userName")); 
		 fullname.click();
		 
		 robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_M);
		 robot.keyPress(KeyEvent.VK_E); Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_E); robot.keyPress(KeyEvent.VK_SPACE);
		 
		 robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_P);
		 robot.keyRelease(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_A);
		 robot.keyPress(KeyEvent.VK_T); robot.keyPress(KeyEvent.VK_E);
		 robot.keyPress(KeyEvent.VK_L); Thread.sleep(2000);
		  
		 robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB); */

		// upload file

	/*	a.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);

		a.manage().window().maximize();
		Thread.sleep(2000);

		robot.mouseWheel(5);
		robot.delay(2000);
		
		Actions action = new Actions(a);/*
		
		// Download File
		
		/*WebElement downbtn = a.findElement(By.xpath("//a[@id='downloadButton']"));
		action.moveToElement(downbtn).click().perform();
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000);*/
		

		/*WebElement btn = a.findElement(By.xpath("//input[@id='uploadFile']"));
		action.moveToElement(btn).click().perform();
		Thread.sleep(2000);

		// 8 tab 5 down 1 enter 1 tab 1 enter

		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);		*/

		/*robot.keyPress(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_A);
		 robot.keyRelease(KeyEvent.VK_SHIFT); robot.keyPress(KeyEvent.VK_M);
		 robot.keyPress(KeyEvent.VK_E); Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_E); robot.keyPress(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_P); robot.keyRelease(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_A); robot.keyPress(KeyEvent.VK_T);
		 robot.keyPress(KeyEvent.VK_E); robot.keyPress(KeyEvent.VK_L);
		 Thread.sleep(2000); robot.keyPress(KeyEvent.VK_UNDERSCORE);
		 Thread.sleep(500); robot.keyPress(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_R); robot.keyRelease(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_E); robot.keyPress(KeyEvent.VK_S);
		 robot.keyPress(KeyEvent.VK_U); robot.keyPress(KeyEvent.VK_M);
		 robot.keyPress(KeyEvent.VK_E); Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_PERIOD); robot.keyPress(KeyEvent.VK_1);
		 Thread.sleep(3000); robot.keyPress(KeyEvent.VK_ENTER); Thread.sleep(3000); */
		
		a.get("https://www.hyrtutorials.com/search/label/Selenium");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		robot.mouseMove(416, 350);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(1000);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(1000);
		 
		/*robot.mouseMove(500, 500);
		robot.delay(2000);*/
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		robot.delay(2000);
		
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		robot.delay(2000);
		
		
		
		//framer market waterloo
		
		

		/*java.awt.Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(d);
		BufferedImage srcFile =robot.createScreenCapture(rectangle);
		String formatName;
		ImageIO.write(srcFile, formatName, null);
		ImageIO.write(srcFile, formatName:"PNG", new File(pathname: "./Screenshot/robot1.png"));*/

		a.close();

	}

}
