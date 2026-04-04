package seleBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class SelIntro {

	public static void main(String[] args) {
		
		
		// Invoking Browser
		
		// chrome - chromeDriver -> Methods : get(), close()
		// firefox - geckoDriver -> Methods : get(), close()
		
		// WebDriver - close(), get()
		// WebDriver methods + class methods
		
		// to talk with chrome browser we need ChromeDriver.exe file, 
		// selenium manager will automatically download the driver and set the path for us, if we havent downloaded the ChromeDriver.exe, we just need to create an object of the driver class
		
//		chromeDriver driver = new chromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\medab\\Downloads\\chromedriver.exe"); // if this line is not there then selenium manager will automatically download the driver and set the path for us.
//		WebDriver driver = new ChromeDriver();
		
//		for firefox browser we need geckoDriver.exe file,
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\medab\\Downloads\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\medab\\Downloads\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle();
		System.out.println(driver.getTitle()); // print the title of the page
		
		// get the current url of the page
		System.out.println(driver.getCurrentUrl());
		
		// close the browser
		driver.close();
		
		
		
		

	}

}
