package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {

	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("tester");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("One");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyzab@gmail.co");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		driver.close();
	}

}
