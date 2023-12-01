package com.qa.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.TestData.DataDriventest;
import com.qa.pagelayer.basicControls;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_BasicControl extends TestBase{
	
	

	@Test(dataProvider="passDataFromExcel", dataProviderClass=DataDriventest.class)
	public void validateForm(String FirstName, String LastName, String emailID, String password) {
		
		basicControls bc=new basicControls(driver);
		bc.basicControl(FirstName,LastName,emailID,password);
		screenshot(driver, "register clear form");
		log.info("register form is cleared");
		
	}
	
	
	
	

}
