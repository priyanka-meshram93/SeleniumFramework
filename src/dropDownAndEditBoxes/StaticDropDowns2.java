package dropDownAndEditBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Meshram\\eclipse-workspace\\SHLTechRestAssured\\FrameworkSelenium\\driverExecutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		//s.selectByValue("USD");
		String t=s.getFirstSelectedOption().getText();
		System.out.println(t);
		
	
		
		
		
	}
}
