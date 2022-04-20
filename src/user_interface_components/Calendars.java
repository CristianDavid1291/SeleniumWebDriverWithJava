package user_interface_components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();

		WebElement datepicker = driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']"));

		
		List<WebElement> months = driver.findElements(By.className("month"));
		

		 //Looking for month
		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("September")) {

			driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='next']")).click();
		}

		// Looking for day
		// Find common attribute
		List<WebElement> days = driver.findElements(By.className("day"));

		for (int i = 0; i < days.size(); i++) {

			if (days.get(i).getText().equals("23")) {
				days.get(i).click();
				break;
			}

		}

	}

}