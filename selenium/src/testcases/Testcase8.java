package testcases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com/signup");
		if (driver.findElement(By.xpath("(//input[@required=''])[1]")).isDisplayed()) {
			System.out.println("First name is mandatory");
		}
		else {
			System.out.println("First name is not mandatory");
		}
		driver.quit();
	}

}
