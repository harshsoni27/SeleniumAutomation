package Alerts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts_assign2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(element).perform();
		List <WebElement> elements = driver.findElements(By.xpath("//ul/li/span"));
		for(WebElement a:elements) {
			a.click();
			Alert alerts = driver.switchTo().alert();
			System.out.println(alerts.getText());
			alerts.accept();
			action.contextClick(element).perform();
		}
	}

}
