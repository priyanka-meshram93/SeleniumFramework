package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		
		//C:\Users\Priyanka Meshram\eclipse-workspace\SHLTechRestAssured\FrameworkSelenium\driverExecutables
		
		//ChromeDriver driver = new ChromeDriver(); //invoking chrome browser only
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // generic where u can invoke webdriver as well as chrome driver class methods
		
		driver.get("https://www.rahulshettyacademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//Thread.sleep(2000);
		//driver.close();
		
	}
}
