package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MethodScreenshot {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/books");
		webPageScreenshot("TestCase1");
		driver.close();

	}

	public static void webPageScreenshot(String filename) {
		String Date = LocalDateTime.now().toString().replaceAll(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("/Users/harshsoni/Desktop/whatever/selenium/src/TakesScreenshot/Screenshots/" + filename
				+ "_" + Date + ".png");
		File temp = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
