package Initial;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scope {

	public static void main(String[] args) {
		// 1. Count of the links on the page
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. Count footer links
		// limit web driver scope
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		// 3. Count links of the first column of footer
		WebElement elementFooter = driver.findElement(By.xpath("//div[@id='gf-BIG'] //td[1]"));
	List<WebElement> column = elementFooter.findElements(By.tagName("a"));
		System.out.println(column.size());

		// 4. click on each link in the column an verify if those links work properly
		// Actions a = new Actions(driver);
		String clickOnNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 1; i < column.size(); i++) {

			 //a.moveToElement(column.get(i)).keyDown(Keys.CONTROL).click().build().perform();
			column.get(i).sendKeys(clickOnNewTab);

		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		

	}

}
