package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/harshsoni/Desktop/whatever/iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		driver.close();
	}
}