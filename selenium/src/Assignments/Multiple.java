package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		List<WebElement> w=driver.findElements(By.xpath("//span[@class=\"PriceRange\"]"));
		for (int i = 0; i < w.size(); i++) {
			w.get(i).click();
			driver.findElement(By.xpath("//a[text()='Remove Filter']")).click();
			Thread.sleep(1000);
		}
	}

}
