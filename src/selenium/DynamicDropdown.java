package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chome.driver","E:\\Software and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		//select from city
		driver.findElement(By.xpath("//div[text()='AYJ']")).click();
		//select To city TIR
		driver.findElement(By.xpath("//div[text()='TIR']")).click();
		
		
		
	}

}
