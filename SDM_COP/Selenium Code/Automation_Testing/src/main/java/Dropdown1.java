	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Dropdown1 {
	 public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.sugarcrm.com/au/request-demo/");
			driver.manage().window().maximize();
			WebElement ddown = driver.findElement(By.name("employees_c"));
			driver.findElement(By.xpath("//*[@class='select2-results']//li[2]")).click();
			Select select = new Select(ddown);
			select.selectByValue("level1");
			Thread.sleep(2000);
			select.deselectByVisibleText("51 -100 employees");
			Thread.sleep(3000);
			select.deselectByIndex(5);
			Thread.sleep(3000);
						
	}
	}

