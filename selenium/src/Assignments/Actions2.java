package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement element1 = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions action = new Actions(driver);
//		action.doubleClick(element1).build().perform();

		action.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")))
				.contextClick().build().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().build().perform();
	}

}
