package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTask {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		login(driver);
		addElements(driver);

	}

	public static void login(WebDriver driver) {

		List<WebElement> credentials = driver.findElements(By.xpath("//p[@class='text-center text-white']/b/i"));
		driver.findElement(By.id("username")).sendKeys(credentials.get(0).getText());
		driver.findElement(By.id("password")).sendKeys(credentials.get(1).getText());
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		// driver.switchTo().alert().accept();
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(2));
		w1.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticSelect = driver.findElement(By.cssSelector("select.form-control"));
		Select select = new Select(staticSelect);
		select.selectByIndex(0);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));

	}

	public static void addElements(WebDriver driver) {

		List<WebElement> elements = driver.findElements(By.cssSelector("button.btn.btn-info"));

		for (int i = 0; i < elements.size(); i++) {
			elements.get(i).click();
		}

		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();

	}

}
