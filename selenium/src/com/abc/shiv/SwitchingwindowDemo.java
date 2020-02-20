//their are some problem in this code
/*package com.abc.shiv;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingwindowDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("C:\\Users\\shiv\\workspace\\selenium\\switching\\page1.html");
		WebElement link1 = driver.findElement(By.linkText("gotopage2"));
		char[] parentid;
		System.out.println(parentid);
		Thread.sleep(2000);
		link1.click();
	
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		link1.click();
		Set<String> allids=
		
		WebElement link2 = driver.findElement(By.linkText("gotopage3"));
		link2.click();
		ArrayList<String> al= new ArrayList<String>(allids);
		
		}

}
*/