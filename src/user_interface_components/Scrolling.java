package user_interface_components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("product")));
		List<WebElement> tableElements = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int sumExpected = 0;
		for(int i=0; i<tableElements.size();i++) {
			System.out.println(tableElements.get(i).getText());
			sumExpected = sumExpected + Integer.parseInt(tableElements.get(i).getText());
			
		}
		String sum = driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
		Assert.assertEquals(String.valueOf(sumExpected), sum);
		System.out.println("Sum Expected: "+sumExpected);
		System.out.println("Sum: "+sum);



	}
	

}
