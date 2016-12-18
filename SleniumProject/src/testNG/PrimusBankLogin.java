package testNG;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBankLogin 
{
	public static WebDriver driver;
	@BeforeClass
	public void launch()
	{
		driver=new FirefoxDriver();
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	@AfterClass
	public void closeqq()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void LAunchApp()
	{
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
	}

}
