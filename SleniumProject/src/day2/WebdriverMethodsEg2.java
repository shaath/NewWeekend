package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverMethodsEg2 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//getting the title
//		System.out.println(driver.getTitle());
		
		//getting the url
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		//click privacy link
		
		driver.findElement(By.linkText("Privacy")).click();
		//clicking on the terms link
		driver.findElement(By.linkText("Terms")).click();

		
		driver.quit();		
	}

}
