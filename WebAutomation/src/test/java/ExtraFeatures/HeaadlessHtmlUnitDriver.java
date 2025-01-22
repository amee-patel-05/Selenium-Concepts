package ExtraFeatures;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

// Use Html Unit dependencies

public class HeaadlessHtmlUnitDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		HtmlUnitDriver a = new HtmlUnitDriver();

		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		System.out.println("Title of the page :  "+a.getTitle());
		Thread.sleep(1000);
		
		System.out.println("URL of the page :  "+a.getCurrentUrl());
		Thread.sleep(1000);
		
		a.close();
		
	}

}
