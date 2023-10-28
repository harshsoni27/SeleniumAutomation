package FrameworkIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void assertionsTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyz@gmail.co");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed(),"\"User is not logged in\"");
		driver.close();
	}

}
