import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationAPI {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Girish");
		driver.findElement(By.xpath("//*[@alt='Google']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		driver.navigate().forward();
		driver.navigate().back();
	}
}
