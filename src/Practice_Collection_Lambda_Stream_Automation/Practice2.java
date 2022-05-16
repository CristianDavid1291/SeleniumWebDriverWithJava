package Practice_Collection_Lambda_Stream_Automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Set<String> windowsId = driver.getWindowHandles();
		windowsId.stream().forEach(s->System.out.println(driver.switchTo().window(s).getTitle()));
		driver.quit();

	}

}
