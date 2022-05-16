package Practice_Collection_Lambda_Stream_Automation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//Capture titles of products
//Capture prices of the products
//Create a hashmap with titles and prices
//Print hashmap
//Print product where the prices are greater than 8000

public class Practice4 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> titles = driver.findElements(By.cssSelector("h2.product-title"));
		List<WebElement> prices = driver.findElements(By.cssSelector("div.prices"));
		
		Map<String,Double> products_map = new HashMap<String,Double>();
		
		for(int i = 0; i<titles.size(); i++) 
		{
			products_map.put(titles.get(i).getText(), Double.parseDouble(prices.get(i).getText()));
		}
		
		products_map.forEach((k,v)->System.out.println(k+" "+ v));
	
		products_map.entrySet().stream().filter(e->e.getValue()>8000).forEach(e->System.out.println(e));
		
		driver.quit();
	
	}

}
