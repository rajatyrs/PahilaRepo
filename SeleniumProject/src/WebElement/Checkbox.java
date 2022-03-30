package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/checkbox");

		WebElement Check = driver.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']"));

		if (!Check.isSelected()) {
			Check.click();
		}

		WebElement WhatIsResult = driver.findElement(By.id("result"));

		if (WhatIsResult.isDisplayed()) {
			System.out.println(WhatIsResult.getText());
		}
		driver.quit();

	}

}
