package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Software and Apps\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection con= (HttpURLConnection)new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int response = con.getResponseCode();
			System.out.println(response);
			Assert.assertTrue(response<400, link.getText());
			//a.assertTrue(response<400, link.getText());
		}
		
		
	}

}
