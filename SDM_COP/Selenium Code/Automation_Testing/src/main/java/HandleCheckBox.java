import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;		

public class HandleCheckBox {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();					

        driver.get("http://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        		
        //Radio Button1 is selected		
        Thread.sleep(2000);
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        Thread.sleep(2000);
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        		
        // Selecting CheckBox		
        Thread.sleep(2000);
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
        		
        		
        //Selecting Checkbox and using isSelected Method		
        Thread.sleep(3000);
        driver.get("http://demo.guru99.com/test/facebook.html");					
        Thread.sleep(3000);
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
        	Thread.sleep(3000);
        	chkFBPersist.click (); 			
        	Thread.sleep(3000);
        	System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		Thread.sleep(2000);
        driver.close();		
        		
    }		
}