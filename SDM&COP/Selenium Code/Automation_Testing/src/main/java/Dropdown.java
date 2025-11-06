import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class Dropdown {
 public static void main(String[] args) throws InterruptedException { 
	 WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();					

     driver.get("http://demo.guru99.com/test/newtours/register.php");	
   
		Thread.sleep(3000);
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		Thread.sleep(3000);
		drpCountry.selectByVisibleText("ANTARCTICA");
		Thread.sleep(3000);
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Thread.sleep(3000);
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(3000);
		fruits.selectByVisibleText("Banana");
		Thread.sleep(3000);
		fruits.selectByIndex(1);
		Thread.sleep(3000);
		driver.close();
 }
 
}