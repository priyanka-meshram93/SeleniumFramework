package dropDownAndEditBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDOwns1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
	    driver.findElement(By.id("hrefIncAdt")).click();
	    
	    int i= 0;
	    while(i<5) {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	    	 i++;
	    }
	    
	   String ts= driver.findElement(By.id("divpaxinfo")).getText();
	   System.out.println(ts);
	}

}
