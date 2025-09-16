package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextboxText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chome.driver", "E:\\Software and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("Prasad");
		
		WebElement textbox = driver.findElement(By.id("name"));
		
		String text = textbox.getAttribute("value");
		
		System.out.println(text);
		
		
		
		
	}

}
