import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertyFile {
	private static Properties properties;
	private final String propertyFilePath= "config.properties";
	
	public ReadPropertyFile(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public static void main(String[] args) {
		ReadPropertyFile file=new ReadPropertyFile();
		System.out.println(file.getApplicationUrl());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String url=properties.getProperty("url");
		System.out.println(url);
		driver.get(url);
	}
	
	

}
