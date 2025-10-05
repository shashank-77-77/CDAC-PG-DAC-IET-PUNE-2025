package com.PomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.NewLoginPF;

import Helper.BrowerFactory;

public class VerifyLoginPF {

	
	@Test
	public void checkValidUser()
	{
		//Launch specific Browser and url
		WebDriver driver = BrowerFactory.startBrowser("crome","https://www.saucedemo.com/");
		//Create Page Object Using Page Factory
	NewLoginPF login_page = PageFactory.initElements(driver, NewLoginPF.class);
		//Call the method
		login_page.login("standard_user", "secret_sauce");
	}
}
