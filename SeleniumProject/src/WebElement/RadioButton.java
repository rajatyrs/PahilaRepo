package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/radio-button");

		WebElement Radio = driver.findElement(By.xpath("//label[@for='yesRadio']"));

		Radio.click();
		driver.get("https://demoqa.com/webtables");

	}

}
