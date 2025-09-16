package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSuggestionAndStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chome.driver", "E:\\Software and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Auto suggestion dropdown
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		List<WebElement> countries = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
		for(WebElement country : countries) {
			if(country.getText().equalsIgnoreCase("India")) {
				country.click();
				break;
			}
			
		}
		
		//static dropdown - select tag
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select option = new Select(dropdown);
		option.selectByIndex(2);
		option.selectByValue("option3");
		
		List<WebElement> cities = option.getOptions();
		for(WebElement city : cities) {
			System.out.println(city.getText());
		}
		

		
		
		
	}

}
