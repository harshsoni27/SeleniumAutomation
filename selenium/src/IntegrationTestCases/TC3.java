package IntegrationTestCases;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) throws InterruptedException {
		String url="https://shoppersstack.com/";
		String email="abcde@gmail.com";
		String password="Password@123";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com");
		Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
			driver.findElement(By.id("vertical-tab-2")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]")).click();
			driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
			driver.findElement(By.xpath("(//li[@role='menuitem'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='gender']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='Submit']")).click();
			driver.findElement(By.cssSelector(".Toastify__close-button.Toastify__close-button--light")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//li[@role='menuitem'])[1]")).click();
			Thread.sleep(1000);
			driver.close();

	}

}
