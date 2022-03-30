import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "WebDrivers//chromedriver.exe");

		ChromeDriver hello = new ChromeDriver();
		hello.get("https://www.amazon.in/");

		System.out.println(hello.getTitle());

	}

}
