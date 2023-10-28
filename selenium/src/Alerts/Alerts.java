package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		Alert alert = driver.switchTo().alert();
		//driver.switchTo().alert().accept();
		System.out.println(alert.getText());
		alert.accept();

	}

}
