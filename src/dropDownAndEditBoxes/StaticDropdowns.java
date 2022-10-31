package dropDownAndEditBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDpwn=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		dropDpwn.click();
		
		Select  s = new Select(dropDpwn);
		
		s.selectByIndex(0);
		s.selectByValue("INR");
		s.selectByValue("AED");
		s.selectByValue("USD");
		
		
	}

}
