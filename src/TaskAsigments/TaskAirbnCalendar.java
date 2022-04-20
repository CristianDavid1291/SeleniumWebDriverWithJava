package TaskAsigments;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskAirbnCalendar {
	
	public static void main(String[] args) throws InterruptedException {
		 
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 driver.get("https://www.airbnb.com.co/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[contains(text(),'Llegada')]")).click();
	 
	 driver.findElement(By.xpath("(//div[@data-visible='true'] //h2)[1]"));
	
	while(!driver.findElement(By.xpath("(//div[@data-visible='true'] //h2)[1]")).getText().contains("septiembre")) {
		driver.findElement(By.xpath("(//button[@aria-label='Siguiente'])[1]")).click();
	}
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(@data-testid,'09-12')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(@data-testid,'09-13')]")).click();
	
	}

}
