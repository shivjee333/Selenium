package com.abc.shiv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9771936869");
		driver.findElement(By.id("pass")).sendKeys("9771936869Sh");
		driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/div[3]/div/div[1]/div/div/div/div/div/div[4]/ul/li[1]/a/div/div[3]")).click();
	
	}

}
