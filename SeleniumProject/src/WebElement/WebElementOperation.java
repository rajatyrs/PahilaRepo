package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");

		System.out.println(driver.getTitle());

		// Find the address and perform the operation
		// enter the value in Full name field
		// address of the element is called locator
		// different way of finding the locator - 8 ways

		driver.manage().window().maximize();
		WebElement FullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		// to the enter the value in element we use sendkeys method from webelement

		FullName.sendKeys("Rajat Singh");

		WebElement Email = driver.findElement(By.cssSelector("input[id='userEmail']"));
		Email.sendKeys("rajatambani@putin.com");
		FullName.clear(); // It will clear the value

		FullName.sendKeys("Rajat Ambani");

		WebElement Submit = driver.findElement(By.id("submit"));

		System.out.println(Submit.getText());
		System.out.println(FullName.getAttribute("id"));
		Submit.click();

	}

}
