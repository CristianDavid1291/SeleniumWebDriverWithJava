package TaskAsigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		pageTask(driver);
		
	}
	
	public static void pageTask(WebDriver driver) {
		
		driver.get("https://the-internet.herokuapp.com");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Nested Frames"))).click().build().perform();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.quit();

			
	}

}
