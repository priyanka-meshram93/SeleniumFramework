package actionsClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		   Set<String>windowHandles=driver.getWindowHandles();
		    Iterator<String>it  = windowHandles.iterator();
		    
		   String parentWindow= it.next();
		   String childWindow=it.next();
		   
		   driver.switchTo().window(childWindow);
		  String t= driver.findElement(By.xpath("//a[@href='mailto:mentor@rahulshettyacademy.com']")).getText();
		  driver.switchTo().window(parentWindow);
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(t);
		  
		  
		         //div[@class='col-md-8']/p[@class='im-para red']
		  
		   
		
		
	}

}
