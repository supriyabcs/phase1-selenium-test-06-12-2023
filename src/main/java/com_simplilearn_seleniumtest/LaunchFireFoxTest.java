package com_simplilearn_seleniumtest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class demonstrate Launch Fire Fox Test.
 * Selenium Webdriver
 * @author supriya
 *
 */

public class LaunchFireFoxTest {
public static void main(String[] args) throws InterruptedException {
		
		// step1: formulate a test domain url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/windows/geckodriver.exe";
		
		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.geckodriver.driver", driverPath);
		
		// step3: instantiate selenium webdriver
		WebDriver driver = new FirefoxDriver();
		
		// step4: launch browser
		driver.get(siteUrl);
		
		// steps5: Evaluate Test
		
		// step6: close driver
		driver.close();
		
		
	}

}
