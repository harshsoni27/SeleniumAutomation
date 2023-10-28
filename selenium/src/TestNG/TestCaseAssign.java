package TestNG;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCaseAssign {
	@Test(dataProvider = "logindata")
	public void login(String userName,String password) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
        driver.findElement(By.id("Email")).sendKeys(userName);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        driver.close();
	}
	@DataProvider(name="logindata",parallel = true)
	public Object[][] logindata() throws EncryptedDocumentException, IOException{
//		Object[][] data=new Object[2][2];
//		data[0][0]="xyz@gmail.co";
//		data[0][1]="Password@123";
//		data[1][0]="xyza@gmail.co";
//		data[1][1]="Password@123";
		return ExcelMultiple.multipleRead("Sheet1");
	}
}

 