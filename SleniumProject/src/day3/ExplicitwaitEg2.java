package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ExplicitwaitEg2
{
	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(40, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
		
		
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[4]/div[2]/div/div[1]/div[2]/div/a"))).click();
		
	}

}
