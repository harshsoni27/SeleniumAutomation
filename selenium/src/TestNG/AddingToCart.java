package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddingToCart {
	@Test
	public void addingToCart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyza@gmail.co");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Shopping')]")).click();
		driver.close();
	}

}
