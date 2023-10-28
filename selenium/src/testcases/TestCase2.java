package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		driver.findElement(By.xpath("//button[text()='Shopper Login']")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
