package Practice_Collection_Lambda_Stream_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Get the number of links of the page 
//text links
//the number of links broken
public class Practice1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.stream().count());
		links.stream().forEach(l->System.out.println(l.getText()));
		System.out.println(links.stream().filter(w->(w.getAttribute("href")!=null)).count());
		driver.quit();
		
		
	}

}
