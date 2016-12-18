package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links available in "+driver.getTitle()+" page is "+links.size());

		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			
			if (lText.equalsIgnoreCase("gmail"))
			{
				flag=true;
				break;
			}
			
		}
		if (flag)
		{
			System.out.println("The expected link available in the page");
			
		}
		else
		{
			System.out.println("The expected link not  available in the page");
		}
		

	}

}
