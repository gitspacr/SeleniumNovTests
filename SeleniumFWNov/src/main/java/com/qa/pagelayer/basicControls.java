package com.qa.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class basicControls extends TestBase{
	
	
//	String firstName="id=firstName";
//	String lastName="//input[@name='lName']";
	
//	By firstName=By.id("firstName");
//	By lastName=By.xpath("//input[@name='lName']");
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lName']")
	WebElement lastName;
	
	@FindBy(id="femalerb")
	WebElement rdbtnfemale;
	
	@FindBy(id="spanishchbx")
	WebElement chkBoxLanguage;
	
	@FindBy(id="email")
	WebElement txtEmail;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="clearbtn")
	WebElement btnClear;
	
	
	public basicControls(WebDriver ldriver){
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void basicControl(String firstname, String lastname, String emailId, String password) {
		
		try {
			
			firstName.sendKeys(firstname);
			lastName.sendKeys(lastname);
			rdbtnfemale.click();
			chkBoxLanguage.click();
			txtEmail.sendKeys(emailId);
			txtPassword.sendKeys(password);
			screenshot(driver, "register form");
			btnClear.click();
			log.info("register form is clear");
		}catch(Exception e) {
			log.info(e);
		}
		
		
	}
	
	
	
	

}
