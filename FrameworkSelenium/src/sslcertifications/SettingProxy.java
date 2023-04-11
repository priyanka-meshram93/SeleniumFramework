package sslcertifications;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SettingProxy {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		
		Proxy proxy = new Proxy();
		
		proxy.setHttpProxy("ipaddress:4444");
		
		option.setCapability("proxy", proxy);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		
	}

}



//Note: Useful url for all kind of pop ups u can handle by selenium
 //https://chromedriver.chromium.org/capabilities