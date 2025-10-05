import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {
public static void main(String[] args) throws InterruptedException {									
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();				
	            driver.get("http://demo.guru99.com/popup.php");	
	            Thread.sleep(3000);
	        driver.manage().window().maximize();		
	                		
	driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();	
	Thread.sleep(3000);
	        		
	        String MainWindow=driver.getWindowHandle();		
	        		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(By.name("emailid"))
	                    .sendKeys("gaurav.3n@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);				
	    }		
}
