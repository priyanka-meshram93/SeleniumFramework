package sslcertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeletingCookies {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
	    WebDriver driver = new  ChromeDriver(); 
	    driver.manage().deleteAllCookies();
	    driver.manage().deleteCookieNamed("session-id");
	    
	    driver.get("https://www.amazon.com");
	    
	    //Scenario is to delete the sesssion id to login fresh with security
	    
	    
		
	}
}
