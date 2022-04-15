package Synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			// expected
			String[] itemNames = { "Cucumber", "Brocolli","Beetroot" };
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			addItems(driver,itemNames);
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED ')]")).click();
			driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			
			//implicit wait
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
			//
			String succesMessage = driver.findElement(By.cssSelector("span.promoInfo")).getText();			
			Assert.assertEquals(succesMessage, "Code applied ..!");
			


		}
		
		
		
		public static void addItems(WebDriver driver, String[] itemNames) {

			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			
			// convert array into arraylist for easier search
			List listNames = Arrays.asList(itemNames);

			for (int i = 0; i < products.size(); i++) {

				String[] productName = products.get(i).getText().split("-");

				if (listNames.contains(productName[0].trim())) {

					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
				}

			}
		}

	}


