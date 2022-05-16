package Practice_Collection_Lambda_Stream_Automation;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href = '/books'])[1]")).click();

		
		//Click on order to A-Z
		Select select = new Select(driver.findElement(By.id("products-orderby")));
		select.selectByIndex(1);
		
		//List of books
		List<WebElement> books = driver.findElements(By.cssSelector("div.item-box div.details h2 a"));
		List<String> booksOrderByPage = books.stream().map(b->b.getText()).collect(Collectors.toList());
		List<String> booksOrderBySteam = books.stream().map(b->b.getText()).sorted().collect(Collectors.toList());
		
		//Validating order of Web elements
		if(booksOrderByPage.equals(booksOrderBySteam))
			System.out.println("Order");
		else
			System.out.println("Order fail");
		
		driver.close();

	}

}
