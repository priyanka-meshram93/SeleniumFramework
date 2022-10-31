package actionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		  driver.switchTo().frame(driver.findElement(By.xpath(
		  "//iframe[@class='demo-frame']")));
		  
		  WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		  
		  WebElement
		  destination=driver.findElement(By.xpath("//div[@id='droppable']"));
		  
		  Actions ac = new Actions(driver); ac.dragAndDrop(source, destination);
		 
		
		int h=driver.findElements(By.tagName("iframe")).size();
		System.out.println(h);
		
		
	}

}

