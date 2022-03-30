package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Select obj = new Select(dropdown);
		obj.selectByIndex(5);
		// obj.selectByVisibleText("Aqua");
		// obj.selectByValue("5");

	}

}
