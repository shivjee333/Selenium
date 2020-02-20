//This code will fetch the data from a table and also print the no of rows and columns present in table

package com.abc.shiv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandlingDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\shiv\\workspace\\selenium\\table_Handling_Demo\\table.html");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tab']/tbody/tr"));
		int rsize = rows.size();
		System.out.println("Total no rows: " + rsize);
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='tab']/tbody/tr[1]/td"));
		int csize = columns.size();
		System.out.println("Total no of columns: "+ csize);
		
		/*    This will print the value of td1 but this is not a efficent way because of lenghty code
		 * 
		WebElement column1 = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr[1]/td[1]"));
		System.out.println(column1.getText());
		
		WebElement column2 = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr[2]/td[1]"));
		System.out.println(column2.getText());
		
		WebElement column3 = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr[3]/td[1]"));
		System.out.println(column3.getText());
		*/
		
	   for (int i = 1; i <= rsize; i++) {   //this will print value of td1
		   WebElement cname = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr["+i+"]/td[1]"));
		   System.out.println(cname.getText());
		
	}
	   for (int i = 1; i <= rsize; i++) {    //this will print the value of td2
		   WebElement cname = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr["+i+"]/td[2]"));
		   System.out.println(cname.getText());
		
	}
		
		
	}

}
