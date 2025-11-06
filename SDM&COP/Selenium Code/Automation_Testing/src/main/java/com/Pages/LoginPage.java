package com.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;

By username = By.id("user-name");
By password = By.id("password");
By loginButton = By.xpath("//*[@id=\\\"login-button\\\"]");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	}

public void typeUserName() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

}

public void typePassword() {
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
}

public void ClickOnLoginButton() {
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

}

}