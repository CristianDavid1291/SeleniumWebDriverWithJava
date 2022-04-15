package Initial;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		 
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("cristiandavid@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys(getPassword());
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector(".login-container h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector(".login-container h2")).getText(), "Hello cristiandavid@gmail.com,");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();
	}
	
	public static String getPassword() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);//ExplicitWait
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		driver.close();
		String [] passArray = passwordText.split("'");
		return new String (passArray[1].split("'")[0]);
		
		
	}

}
