package Initial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TaskDrop {
	
public static void main(String[] args) throws InterruptedException {
		
		//Invoking Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Cristian");
		driver.findElement(By.name("email")).sendKeys("cristian@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("cristian91");
		driver.findElement(By.id("exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		WebElement webSelect = driver.findElement(By.id("exampleFormControlSelect1"));
		Select select = new Select(webSelect);
		select.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("2022-04-16");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		String succes = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
		String[] msg = succes.split("\n");
		Assert.assertEquals(msg[1], "Success! The Form has been submitted successfully!.");
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
		
		

	}


}
