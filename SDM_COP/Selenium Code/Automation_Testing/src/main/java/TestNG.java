import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	@Test(priority = 1,description = "To test cricbuzz title",alwaysRun = true)
	public void testAssertion() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.cricbuzz.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Cricbuzz");
		//Assert.assertTrue(false)

		
		
	}
	
	@Test(priority = 2,description ="To test google title")
	public void testAssertionsssss() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		
	}

}
