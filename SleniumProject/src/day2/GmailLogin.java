package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		//Launching the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		//Launching the application
		driver.get("http://gmail.com");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email text box
		
		WebElement email=driver.findElement(By.id("Email"));
		
		//Entering the text into the email text box
		
		email.sendKeys("sharathqedge449");
		//
//		Sleeper.sleepTightInSeconds(5);
		//Clear the text in the text box
//		email.clear();
		
		//Clicking on next button
		driver.findElement(By.name("signIn")).click();
//		Sleeper.sleepTightInSeconds(5);
		//Entering the text into the password field
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		//Clicking on sign in button
		
		driver.findElement(By.cssSelector("#signIn")).click();
		

	}

}
