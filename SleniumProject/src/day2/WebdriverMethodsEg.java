package day2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebdriverMethodsEg {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		//navigating to the facebook page
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTightInSeconds(5);
		//clicking on back button
		
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		//clicking forward button
		
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		//Refresh the page 
		
		driver.navigate().refresh();;
		//close the browser
		
		driver.close();

	}

}
