package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebelementScreenshot {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/books");
		//WebElement element = driver.findElement(By.id("small-searchterms"));
		WebElement element = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		//element.sendKeys("Mobiles");
		elementScreenshot(element, "Logo");
		driver.close();

	}

	public static void elementScreenshot(WebElement element, String ename) {
		String Date = LocalDateTime.now().toString().replaceAll(":", "-");
		File dest = new File("/Users/harshsoni/Desktop/whatever/selenium/src/TakesScreenshot/Screenshots/" + ename
				+ "_" + Date + ".png");
		File temp = element.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
