package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/harshsoni/Desktop/whatever/iframe.html");
		driver.switchTo().frame("FR1");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();

	}

}
