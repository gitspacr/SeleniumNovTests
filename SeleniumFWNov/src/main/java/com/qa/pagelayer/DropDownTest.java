package com.qa.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	
	
	String dropDown="//select[@id='course']";
	
	
	
	public void handleDropDown() {
		
		try {
			WebDriver driver =new ChromeDriver();
			
			WebElement ele=driver.findElement(By.xpath(dropDown));
			
			Select slctCourse=new Select(ele);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
