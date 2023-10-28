package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action = new Actions(driver);
		WebElement Rome = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement Italy = driver.findElement(By.xpath("//div[text()='Italy']"));
		action.dragAndDrop(Rome, Italy).build().perform();
		
		WebElement Madrid = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		WebElement Spain = driver.findElement(By.xpath("//div[text()='Spain']"));
		action.dragAndDrop(Madrid, Spain).build().perform();
		
		WebElement Oslo = driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		WebElement Norway = driver.findElement(By.xpath("//div[text()='Norway']"));
		action.dragAndDrop(Oslo, Norway).build().perform();
		
		WebElement Copenhagen = driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		WebElement Denmark = driver.findElement(By.xpath("//div[text()='Denmark']"));
		action.dragAndDrop(Copenhagen, Denmark).build().perform();
		
		WebElement Seoul = driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
		WebElement SK = driver.findElement(By.xpath("//div[text()='South Korea']"));
		action.dragAndDrop(Seoul, SK).build().perform();
		
		WebElement SH = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement Sweden = driver.findElement(By.xpath("//div[text()='Sweden']"));
		action.dragAndDrop(SH, Sweden).build().perform();
		
		WebElement Washington = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		WebElement US = driver.findElement(By.xpath("//div[text()='United States']"));
//		action.dragAndDrop(Washington, US).build().perform();
		
		action.clickAndHold(Washington).moveToElement(US).click().build().perform();
	}
}
