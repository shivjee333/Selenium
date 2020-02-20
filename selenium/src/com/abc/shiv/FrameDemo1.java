package com.abc.shiv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shiv/Desktop/Middle.html");
		WebElement middle =driver.findElement(By.id("manme"));
		middle.sendKeys("abc");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("newname");
		
		
		
		WebElement first = driver.findElement(By.id("newname"));
		first.sendKeys("shiv");

	}

}
