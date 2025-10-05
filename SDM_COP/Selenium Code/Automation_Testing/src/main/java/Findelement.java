import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement {
public static void main(String[] args) throws InterruptedException {
	
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GodboleG\\eclipse-workspace\\Automation_Testing\\src\\test\\resources\\chromedriver.exe");
		driver.get("https://www.google.com");
		
		
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.sendKeys("Girish");
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='btnK']"));
		System.out.println(list);
		System.out.println(list.size());
		
		driver.findElement(By.xpath("//*[@alt='Google']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();
}
}
