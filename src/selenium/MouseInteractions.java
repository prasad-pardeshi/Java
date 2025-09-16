package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("nav-link-accountLis"))).build().perform();
		
		
	}

}
