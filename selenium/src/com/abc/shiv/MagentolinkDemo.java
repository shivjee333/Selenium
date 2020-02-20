package com.abc.shiv;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentolinkDemo {
	public static void main(String[] args)
	{


			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.magento.com");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
		    int size=links.size();
			System.out.println(size);
			
			for (WebElement link : links)
			{
			String text=link.getText();
			System.out.println(text);
			if(text.equals("My Account"))
			{
			link.click();
		break;	}
			}
			
		
	}

}
