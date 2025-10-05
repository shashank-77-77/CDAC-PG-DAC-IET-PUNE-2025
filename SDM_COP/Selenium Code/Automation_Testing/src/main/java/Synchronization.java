import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {
			public static void main(String[] args) throws InterruptedException {
		 	WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com.au/");
			driver.manage().window().maximize();
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
			
			/*Explicit Wait
				
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.qaautomated.com.");
			driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait (driver, 10);
			WebElement aboutMe;
			aboutMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("About_me")));
			aboutMe.click();
			driver.quit();
			*/
			}
}
			