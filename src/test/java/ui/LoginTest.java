package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {

		// 1.step - do the set up of the webdriver (chrome driver)
		WebDriverManager.chromedriver().setup();

		// 2.step - create the object of the chrome driver
		ChromeDriver driver = new ChromeDriver(); // --> if it shows error - import Chrome Driver

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
