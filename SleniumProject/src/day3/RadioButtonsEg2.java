package day3;

import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		//Method 1
//		List<WebElement> radios=block.findElements(By.tagName("input"));
//		
//		for (int i = 0; i < radios.size(); i++)
//		{
//			String rText=radios.get(i).getAttribute("value");
//			if (rText.equalsIgnoreCase("milk")) 
//			{
//				radios.get(i).click();
//			}
//			else if (rText.equalsIgnoreCase("beer"))
//			{
//				radios.get(i).click();
//			}
//		}
		
		//Section 1
		List<WebElement> group1=block.findElements(By.name("group1"));
		for (int i = 0; i < group1.size(); i++)
		{
			String r1=group1.get(i).getAttribute("value");
			if (r1.equalsIgnoreCase("milk")) 
			{
				group1.get(i).click();
				break;
			}
			
		}

	}

}
