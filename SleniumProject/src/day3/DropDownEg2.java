package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();

		WebElement fDrop=driver.findElement(By.id("fromCity"));
		
		Select f=new Select(fDrop);
		
		List<WebElement> flist=f.getOptions();
		
		System.out.println("From Drop down Size "+flist.size());
		
		WebElement tDrop=driver.findElement(By.id("toCity"));
		
		Select t=new Select(tDrop);
		
		
		for (int i = 0; i < flist.size(); i++)
		{
			f.selectByIndex(i);
			String fCity=flist.get(i).getText();
			System.out.println(fCity);
			
			List<WebElement> tlist=t.getOptions();
			for (int j = 0; j < tlist.size(); j++)
			{
				t.selectByIndex(j);
				String tCity=tlist.get(j).getText();
				
				if (fCity.equalsIgnoreCase(tCity))
				{
					flag=true;
					break;
				}
			}
			if (flag==true)
			{
				break;
			}
			
		}
		
		if (flag)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		
	}

}
