package TaskAsigments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskWindowsHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		pageTask(driver);

	}
	
	public static void pageTask(WebDriver driver) {
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindowId = it.next();
		String firstChildWindowId = it.next();
		driver.switchTo().window(firstChildWindowId);
		System.out.println(driver.findElement(By.xpath("//h3[(text()='New Window')]")).getText());
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		driver.quit();
		
	}

}
