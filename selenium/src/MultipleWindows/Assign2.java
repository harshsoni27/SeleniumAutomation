 package MultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String Parent_window = driver.getWindowHandle();
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//a[@href='https://twitter.com/nopCommerce']")).click();
		Thread.sleep(1000);
		Set<String> child_windows = driver.getWindowHandles();
		for (String windows : child_windows) {
			driver.switchTo().window(windows);
			if (!(driver.getWindowHandle().equalsIgnoreCase(Parent_window))) {
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(Parent_window);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mobiles");
	}

}
