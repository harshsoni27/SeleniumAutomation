package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		List <WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
			Thread.sleep(1000);
		}
		driver.close();
	}

}
