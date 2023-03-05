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

	//set up driver
	public static WebDriver getDriver() {

		
               // set up for windows
		if (isWindows()) {
			System.setProperty("webdriver.chrome.driver",
				    System.getProperty("user.dir") + "/src/main/resources/webdriver/chromedriver.exe");
		}
		
		// set up for macbook
		if (isMac()){
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
	
        // quit driver
	public static WebDriver encerraDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

}
