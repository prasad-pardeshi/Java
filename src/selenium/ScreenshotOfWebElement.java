package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\\\Software and Apps\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Enter Text
		driver.findElement(By.id("name")).sendKeys("Please hire me :)");
		//Scroll Page
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 400)");
		
		//Take Webelement screenshot
		WebElement element = driver.findElement(By.id("name"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("Webelement.png");
		FileUtils.copyFile(source, destination);
	}

}
