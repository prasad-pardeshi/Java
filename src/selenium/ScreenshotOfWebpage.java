package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotOfWebpage {
		public WebDriver driver;
		
		@BeforeMethod
		public void InitializeDriver() {
			System.setProperty("webdriver.chrome.driver", "E:\\\\Software and Apps\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
		}
		
		  @Test public void SendData() {
		  
		   driver.findElement(By.id("name")).sendKeys("Please hire me :)");
		  }
		 
		
		
		  @Test public void Dropdown() { 
		  WebElement dropdown =  driver.findElement(By.id("dropdown-class-example")); Select sel = new
		  Select(dropdown); sel.selectByIndex(5); 
		  }
		 
		
		
		@AfterMethod
		public void TakeScreenshot(ITestResult result) throws IOException {
			
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String testCase = result.getName();
		File destination = new File(testCase + ".png");
		try {
		FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("SS Failed" + e.getMessage());
		}
		
	}
		

}
