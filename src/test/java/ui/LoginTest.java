package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("firefox")) {

			// 1.step - do the set up of the webdriver (chrome driver)
			WebDriverManager.firefoxdriver().setup();

			// 2.step - create the object of the chrome driver
			driver = new FirefoxDriver();

		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		// 3. step - open the browser
		driver.get("https://www.saucedemo.com/v1/");

		// 4.step - enter the username and password in the username and password field
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// 5.step - click on the "Login" button
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]")).click();

		// 6.step - close the browser
		driver.close();
	}

}
