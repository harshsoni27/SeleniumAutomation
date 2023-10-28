package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[@href=\"/cell-phones\"])[1]"))).click().perform();

		action.moveToElement(driver.findElement(By.xpath("//input[@id='small-searchterms']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("mobiles").perform();

	}
}
