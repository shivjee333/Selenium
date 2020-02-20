package com.abc.shiv;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelunch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FireforDriver();
		driver.manage().window().maximize();
		String url = "https:\\www.gmail.com";
		driver.get(url);
		String etitle = "Gmail";
		String atitle = driver.getTitle();
		//String atitle = driver.getCurrentUrl(); for getting url 
		System.out.println(etitle);
		System.out.println(atitle);
		if(etitle.equalsIgnoreCase(atitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		
		
		

	}

}
