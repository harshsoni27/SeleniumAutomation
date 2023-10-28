package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/harshsoni/Desktop/whatever/iframe.html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}

}
