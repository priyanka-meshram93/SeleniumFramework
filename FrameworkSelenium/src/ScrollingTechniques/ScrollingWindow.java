package ScrollingTechniques;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollingWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy(0,500)");// 0- denotes x axis scroll and 900 denotes y axis scroll
		 
		 Thread.sleep(3000);
		 js.executeScript("document.querySelector('//div[@class='tableFixHead']')).scrollTop=5000");
		 
		 
		 
	}

}
