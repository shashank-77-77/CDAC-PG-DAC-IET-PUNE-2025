import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.cricbuzz.com");
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor abc=(JavascriptExecutor) driver;
		
		WebElement android=driver.findElement(By.xpath("//*[text()='Android']"));
		abc.executeScript("arguments[0].click()",android);
		
}
}
