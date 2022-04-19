package TaskAsigments;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeTask {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		pageSteps(driver);

	}
	
	
	public static void pageSteps(WebDriver driver) {
		
		driver.get("http://qaclickacademy.com/practice.php");
		//Capturing checkdiv and options 
		WebElement checkDiv = driver.findElement(By.id("checkbox-example"));
		List<WebElement> radioOptions = checkDiv.findElements(By.tagName("input"));
		
		//Generating a option randomly and choosing one
		Random random = new Random();
		int value = random.nextInt(radioOptions.size());
		radioOptions.get(value).click();
		
		//creating and choosing select
		WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(selectElement);
		select.selectByValue(radioOptions.get(value).getAttribute("value"));
		
		//Writing on alert
		driver.findElement(By.id("name")).sendKeys(radioOptions.get(value).getAttribute("value"));
		driver.findElement(By.id("alertbtn")).click();
		
		//getting text from alert
		System.out.println(driver.switchTo().alert().getText().split(",")[0].split(" ")[1]);
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		

		
	}

}
