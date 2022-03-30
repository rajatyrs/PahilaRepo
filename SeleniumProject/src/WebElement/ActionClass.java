package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/tool-tips");

		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("toolTipButton"))).perform();
		Thread.sleep(2000);
	}
}
