package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLoginPF {
	
	WebDriver driver;

	public NewLoginPF (WebDriver driver)
	{
		this.driver=driver;
		}
	

	@FindBy(id="user-name")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.ID,using="login-button")
	WebElement submit_button;
	


public void login(String uid, String pass)
{
	username.sendKeys(uid);
	password.sendKeys(pass);
	submit_button.click();

	}
		
}

	
	

