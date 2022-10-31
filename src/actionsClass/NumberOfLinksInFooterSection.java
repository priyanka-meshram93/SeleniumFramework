package actionsClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksInFooterSection {
	
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://qaclickacademy.com/practice.php");
			driver.manage().window().maximize();
			
			System.out.println(driver.findElements(By.tagName("a")).size());
			
			WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
			System.out.println(footerDriver.findElements(By.tagName("a")).size());
			
			
			//Scenario2: from the footer section click  see how many links present in the first column.
			
			
			WebElement footerColumnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
			 
			
			int countLinks=footerColumnDriver.findElements(By.tagName("a")).size();
			System.out.println(countLinks);
			
			  List <WebElement> w=footerColumnDriver.findElements(By.tagName("a"));
			
			//starting form i=1,as 0 is the 'Discount Link' and it navigates to same page
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		        //Scroll down till the bottom of the page
		        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			for(int i=1; i < countLinks;i++) {
				
				String clikonLinkTabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
				      w.get(i).sendKeys(clikonLinkTabs);
				      Thread.sleep(1000);
				      
				      
			}
			
						
						  Set <String> windowHnadles=driver.getWindowHandles();
						  
						  Iterator<String> it=windowHnadles.iterator();
						  
						  String firstwindow=it.next(); String secondWind=it.next(); String thirdWind
						  =it.next(); String fourthWind=it.next();
						  
						  String f=driver.switchTo().window(firstwindow).getTitle();
						  System.out.println(f);
						  System.out.println(driver.switchTo().window(secondWind).getTitle());
						  System.out.println(driver.switchTo().window(thirdWind).getTitle());
						  System.out.println(driver.switchTo().window(fourthWind).getTitle());
						  
						 
			    
			    
						  //the above code is very lengthy can will show ur less experiencedin automation as ur repeating the lines of code,
						 // to write it in a more optimized/ better way next class is shows [OptimizedCodeForLinks]
			    
			
			

}
}

