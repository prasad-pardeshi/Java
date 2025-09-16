package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetChildWindowsTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		System.out.println(driver.switchTo().window(childid).getTitle());
		
	}

}
