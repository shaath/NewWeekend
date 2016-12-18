package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowHandling
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String wId=it.next();
			
			driver.switchTo().window(wId);
			Sleeper.sleepTightInSeconds(5);;
			System.out.println(driver.getTitle()+"------"+wId);
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			} 
			catch (Exception e) 
			{
				System.out.println(e);
				System.out.println("The expected link not available in this page");

			}
			
			
		}
		
		driver.switchTo().window(gmail);
		driver.quit();
		WindowsUtils.killByName("eclipse.exe");
//		driver.findElement(By.linkText("Terms of Service")).click();
		
		
		

	}

}
