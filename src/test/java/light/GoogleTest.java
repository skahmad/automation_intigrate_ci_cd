package light;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void validate_google_search_bar() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "c:/apps/drivers/win/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com/");
		WebElement searchbar = driver.findElement(By.name("q"));
		
		searchbar.sendKeys(Keys.chord("apple", Keys.ENTER));
		
		Thread.sleep(10);
	}
}
