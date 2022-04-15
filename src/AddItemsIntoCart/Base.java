package AddItemsIntoCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// expected
		String[] itemNames = { "Cucumber", "Brocolli" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

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
