package Alerts;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts_assign {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		action.doubleClick(element).perform();
		Alert alerts = driver.switchTo().alert();
		System.out.println(alerts.getText());
		alerts.accept();
		alerts.accept();
		
		driver.quit();
		
	}

}
