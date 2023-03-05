package pt.com.challenge.core;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	private static WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();

	public Driver() {

	}

	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static WebDriver getDriver() {

		
        // set up windows
		if (isWindows()) {
			System.setProperty("webdriver.chrome.driver",
				    System.getProperty("user.dir") + "/src/main/resources/webdriver/chromedriver.exe");
			System.out.println("This is Windows");
		}
		
		// set up for macbook
		if (isMac()) {
			System.out.println("This is Mac");
			System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		}

		if (driver == null) {
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		return driver;

	}

	public static WebDriver encerraDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

}
