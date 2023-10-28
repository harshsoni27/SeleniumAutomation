package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMethod {
	static JavascriptExecutor js;
	static WebDriver driver;
	static WebElement ireland;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		//scrollByJS("0", "1650");
		//scrollToJS("0", "650");
		ireland = driver.findElement(By.xpath("//h5[text()='Ireland']"));
		scrollIntoView(true, ireland);
		Thread.sleep(2000);
		driver.close();
	}

	public static void typeCastingJS() {
		js = (JavascriptExecutor) driver;
	}

	public static void scrollByJS(String x, String y) {
		typeCastingJS();
		js.executeScript("window.scrollBy(" + x + "," + y + ");");
	}
	public static void scrollToJS(String x, String y) {
		typeCastingJS();
		js.executeScript("window.scrollTo(" + x + "," + y + ");");
	}
	public static void scrollIntoView(boolean Boolean, WebElement element) {
		typeCastingJS();
		js.executeScript("arguments[0].scrollIntoView("+Boolean+");", element);
	}
}
