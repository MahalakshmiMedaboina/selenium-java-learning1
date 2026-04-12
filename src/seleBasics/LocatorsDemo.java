package seleBasics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\medab\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //loads browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait
		
		//enter url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Maha");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //wrong pass, to see error
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //prints the errpr
		
		driver.findElement(By.linkText("Forgot your password?")).click(); //click on forgot password text link

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Maya");
	}

}
