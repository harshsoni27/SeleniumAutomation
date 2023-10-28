package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		driver.findElement(By.xpath("//button[@name='Create Account']")).click();
		driver.findElement(By.xpath("//a[@name='signIn']")).click();
		if (driver.findElement(By.xpath("//strong[text()='Shopper']")).isEnabled()) {
			System.out.println("Login Page is Enabled");
		}
		else {
			System.out.println("Login page is not Enabled");
		}
		driver.quit();
	}

}
