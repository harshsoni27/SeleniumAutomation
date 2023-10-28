package MultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/harshsoni/Desktop/whatever/MultipleWindow.html");
		String Parent_window = driver.getWindowHandle();
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);
		Set<String> child_windows = driver.getWindowHandles();
		for (String windows : child_windows) {
			driver.switchTo().window(windows);
			System.out.println(driver.getTitle());
		}

	}

}
