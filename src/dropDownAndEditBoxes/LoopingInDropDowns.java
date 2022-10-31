package dropDownAndEditBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopingInDropDowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		
		for(int i= 0; i<5; i++) {
			 driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		String text=driver.findElement(By.id("divpaxinfo")).getText();
		
		System.out.println(text);
		

		
		
		
		
		/*
		 * int i= 1; while(i<5) {
		 * 
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
				
		
	}

}
                                     