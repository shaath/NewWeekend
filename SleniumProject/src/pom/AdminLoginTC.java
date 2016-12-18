package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdminLoginTC extends Constants
{
	@Test
	public void lTest()
	{
		
		driver.get(lp.url);
		
		driver.manage().window().maximize();
		
		lp.org_Login(lp.u, lp.p);
		Sleeper.sleepTightInSeconds(5);
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
				
	}

}
