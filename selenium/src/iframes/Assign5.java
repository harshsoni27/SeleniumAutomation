package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/harshsoni/Desktop/whatever/iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
	}
}
