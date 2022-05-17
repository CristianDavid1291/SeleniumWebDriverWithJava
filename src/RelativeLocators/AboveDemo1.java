package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class AboveDemo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox = driver.findElement(By.cssSelector("input.form-control[name='name']"));
		
		//capturing web element in relative way -> above of other element
		//Above
		String text =driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
		System.out.println(text);
		
		//Below
		WebElement birthdayLabel = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		String attribute = driver.findElement(with(By.tagName("input")).below(birthdayLabel)).getAttribute("class");
		System.out.println(attribute);

	}

}
