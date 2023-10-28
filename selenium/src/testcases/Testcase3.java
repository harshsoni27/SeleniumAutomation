package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		driver.findElement(By.xpath("//button[@name='Create Account']")).click();
		if (driver.findElement(By.xpath("//h1[text()='Create Your Profile']")).isDisplayed()) {
			System.out.println("create Account page is displayed.");
		}
		else {
			System.out.println("Create account page is not displayed.");
		}
		driver.quit();
		
	}

}
