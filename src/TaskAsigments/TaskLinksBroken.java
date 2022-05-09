package TaskAsigments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskLinksBroken {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		SoftAssert a = new SoftAssert();
		// Broken Url
		// java methods will call URL's and gets you the status code

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class = 'gf-li'] a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode < 400, "The link is broken");
			
		}
		a.assertAll();

	}

}
