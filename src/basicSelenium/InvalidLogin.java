package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mesh.priyanka@gmail.com");
			
		    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("1234");
		    driver.findElement(By.xpath("//input[@value='Log in']")).click();
		    Thread.sleep(2000);                                                                                                  //if you dont give thread.sleep it will throw exception for below line of code-try and see
	        String  text=driver.findElement(By.xpath("//div/div[contains(text(),'incorrect')]")).getText();                  // xpath1 and 1 way to print the text
	        System.out.println(text);
	        System.out.println(driver.findElement(By.xpath("//div/h3/following-sibling::div[contains(text(),'incorrect')]")).getText());  //xpath2 and sysout 2nd way to print the text
	        Thread.sleep(2000);  
	        driver.close();
	        
	        
	        //Note you will get WARNING: Connection reset: no need to worry its only warning not any exception-- u can see the output
	        //In the next program you can show hoe you can avoid thread.sleep evrywhere and the importance of waits concepts
		   
		   
					
			
	
	}


		

}
