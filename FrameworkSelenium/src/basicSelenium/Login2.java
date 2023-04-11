package basicSelenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Priyanka Meshram\\\\eclipse-workspace\\\\SHLTechRestAssured\\\\FrameworkSelenium\\\\driverExecutables\\\\chromedriver.exe");
		
		WebDriver driver= new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));  //when fails give this ,as after clicking on sign in it takes time to show error msg
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("mesh.priyanka@gmail.com");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("ddf");
		
		driver.findElement(By.xpath(" //button[text()='Sign In']  ")).click();
		
		//String text=driver.findElement(By.xpath("//form/h1[text()='Sign in']/following-sibling::p")).getText();
		System.out.println(driver.findElement(By.xpath("//form/h1[text()='Sign in']/following-sibling::p")).getText());
		//System.out.println(text);
		driver .close();
		


	}

}
