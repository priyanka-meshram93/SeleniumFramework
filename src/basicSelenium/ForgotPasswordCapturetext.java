package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordCapturetext {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String finalPassword=getPassword(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[text()='Go to Login']")).click();
	
		
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("mesh.priyanka@gmail.com");
		driver.findElement(By.xpath(" //form/h2[text()='Forgot password']/following-sibling::input[@placeholder='Email']")).sendKeys(finalPassword);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		System.out.println("ran successfully");
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		String passwordT=driver.findElement(By.xpath("//div[@class='form-container sign-up-container']/form/p")).getText();
		// passwordT= Please use temporary password 'rahulshettyacademy' to Login.
		
		
		String[] passwordTarray = passwordT.split("'");
		//0th index=  Please use temporary password
		//1st index =  rahulshettyacademy' to Login.
		String passwordTarray2 = passwordTarray[1].split("'")[0];
		//0th index:  rahulshettyacademy
		//1st index: to Login
		//now in (passwordTarray2) we have=   rahulshettyacademy
		System.out.println(passwordTarray2);
		
		return passwordTarray2 ;
		
		   
		
		
	}

}
	
	
	
	
	
	
	
	
	
	
	

	

