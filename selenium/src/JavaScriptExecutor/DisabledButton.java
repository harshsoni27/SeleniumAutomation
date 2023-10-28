package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u381-linux-x64.tar.gz")).click();
		WebElement disabledButton = driver.findElement(By.xpath("//a[@class='download-file icn-lock']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabledButton);

	}

}
