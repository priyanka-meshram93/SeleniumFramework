package sslcertifications;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class TakingScreenShots {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	   File src=      ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   FileUtils.copyFile(src.new File("C://screenshot.png"));
	
	
		
		
		
	}

}
