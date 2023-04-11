package basicSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Priyanka Meshram\\\\eclipse-workspace\\\\SHLTechRestAssured\\\\FrameworkSelenium\\\\driverExecutables\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("mesh.priyanka@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/following-sibling::button[@type='submit']")).click();
	    Thread.sleep(2000);
       // String text=driver.findElement(By.tagName("p")).getText();
        System.out.println(driver.findElement(By.tagName("p")).getText());
        //System.out.println(text);
        assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        driver.findElement(By.tagName("button")).click();
        driver.close();
        
       
        
       
        
        
	    
	   
	    
	
	     
	}
	
}





