package TaskAsigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTablesAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		pageTask(driver);
		
	}
	
	
	public static void pageTask(WebDriver driver) {
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Number of rows: "+driver.findElements(By.cssSelector("div[class='left-align'] table[id=product] tr")).size());
		System.out.println("Number of columns: "+driver.findElements(By.cssSelector("div[class='left-align'] table[id=product] th")).size());
		List<WebElement> thirdRow = driver.findElements(By.cssSelector("div[class='left-align'] table[id=product] tr:nth-child(4) td"));
		String text = "";
		
		for(int i = 0; i<thirdRow.size(); i++) {
			text = text + thirdRow.get(i).getText()+" ";
		}
		System.out.println(text);
		
		
	}

}
