package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/harshsoni/Desktop/whatever/iframe.html");
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		WebElement element = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		element.sendKeys("Books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

}
