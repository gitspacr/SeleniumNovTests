package com.qa.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pagelayer.DropDownTest;
import com.qa.pagelayer.basicControls;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002_Dropdowns {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
					
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void validatedropdown() {
		
		
		DropDownTest dd=new DropDownTest();
		
		dd.handleDropDown();
		
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}

}
