package com.abc.shiv;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxpopupdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.echoecho.com/javascript4.htm");
        //WebElement alert=driver.findElement(By.name("B1"));
        //WebElement alert=driver.findElement(By.name("B2"));
        WebElement alert=driver.findElement(By.name("B3"));
        alert.click();
        Alert a =driver.switchTo().alert();
        Thread.sleep(2000);
        //a.accept();
        //a.dismiss();
        a.sendKeys("abcgf");
        System.out.println(a.getText());
        		
	
	
	}

}
