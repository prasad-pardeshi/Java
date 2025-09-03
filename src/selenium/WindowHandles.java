package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class=\"blinkingText\"][1]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		String childTitle = driver.switchTo().window(childId).getTitle();
		System.out.println("Child Title is "+ childTitle);
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"col-md-8\"]/p[2]/strong/a")).getText());
		
		
		
		
		
	}

}
