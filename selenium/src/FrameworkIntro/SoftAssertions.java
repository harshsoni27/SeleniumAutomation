//package FrameworkIntro;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class SoftAssertions {
//	@Test
//	public void assertionstest() {
//		WebDriver driver = new ChromeDriver();
//		SoftAssert ast = new SoftAssert();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://demowebshop.tricentis.com/");
//		ast.assertEquals(driver.getTitle(), "Demo web shop");
//		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyza@gmail.co");
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//		driver.close();
//		ast.assertAll();
//	}
//
//}
