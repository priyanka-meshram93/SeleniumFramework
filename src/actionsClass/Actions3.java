package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		//String t=driver.findElement(By.xpath("//div[@class='col-md-8']/*[contains(@class,'im-para red')]")).getText();
		//System.out.println(t);
		
		////div[@class='col-md-8']/p[contains(@class,'im-para red')]
		
		String s= driver.findElement(By.cssSelector(".im-para red")).getText();
	
		
		
		
		
		
		
	}

}
