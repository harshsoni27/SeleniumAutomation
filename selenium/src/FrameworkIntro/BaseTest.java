package FrameworkIntro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest{
	WebDriver driver;
	@Parameters("browserName")
	
	@BeforeClass
	public void browserSetup(@Optional("chrome") String browserName) {
		if(browserName.contains("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.contains("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Enter valid browser");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void browserTearDown() {
		driver.quit();
	}
}
