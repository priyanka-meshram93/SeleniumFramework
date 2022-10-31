package dropDownAndEditBoxes;

import java.lang.reflect.Array;
import java.sql.Driver;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	
	public static void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s = new Select(element);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("USD");
		
		System.out.println(s.getOptions());
		
		
	    s.selectByIndex(1);
	    
	}
	
	public static void dropDown() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		/*
		 * for(int i=1; i<5;i++) {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click(); }
		 */
		
		 int i = 1; 
		
		
		  while(i<5) {
		  
		  driver.findElement(By.id("hrefIncAdt")).click(); 
		  i++;
		 
		
	}
	}
		  
		  public static void  addingItemsToCart() {
			  
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				List <WebElement> productNames = driver.findElements(By.xpath("//div/h4[@class='product-name'] "));
				
				String[] itemsNeeded= { "Cucumber", "Brocolli","Carrot","Tomato","Beans" };
				
				for(int i=0; i<productNames.size();i++) {
					
					String[] nameOfProduct=productNames.get(i).getText().split("-");
					   
					String formattedString = nameOfProduct[0].trim();
					List itemsList =Arrays.asList(itemsNeeded);
					
					if(itemsList.contains(formattedString)) {
						
						
						
						
						driver.findElements(By.xpath("//div/a[@class='increment']")).get(i).click();
						driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
						
					}
					
				}
			}
}
	  
						
						
						
						
	
	

			  
			  
		  

	

	   
		
		
		
	
	
		
		
	


	
	
	
	

