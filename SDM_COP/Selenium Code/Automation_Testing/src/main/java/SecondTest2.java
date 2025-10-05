import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest2 {

	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Girish");
		//driver.findElement(By.className("gLFyf gsfi")).sendKeys("Godbole");
		//driver.findElement(By.xpath("//input[@data-ved='0ahUKEwi8zfPplYT2AhUXs1YBHewiAWkQ4dUDCAs']")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]//input[@data-ved='0ahUKEwi8zfPplYT2AhUXs1YBHewiAWkQ4dUDCAs']")).click();


	}
}
