import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {
	
	
	@Test(priority = 1,description = "To test cricbuzz title",alwaysRun = true)
	public void testAssertion() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.cricbuzz.com");
	}
}
