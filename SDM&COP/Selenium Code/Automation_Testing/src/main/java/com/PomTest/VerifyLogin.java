package com.PomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLogin {

@Test
public void verifyValidLogin()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/");

LoginPage login = new LoginPage(driver);

login.typeUserName();
login.typePassword();
login.ClickOnLoginButton();

}
	
}
