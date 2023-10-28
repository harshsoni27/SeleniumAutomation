package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRegister {
//	@Test(dataProvider = "testData")
//	public void register(String fName, String lName, String eMail, String pwd, String cPwd) {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
//		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(fName);
//		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lName);
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(eMail);
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(cPwd);
//		driver.findElement(By.xpath("//input[@id='register-button']")).click();
//		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
//		driver.close();
//	}
	@DataProvider(name = "testData")
	public Object[][] testdata()
	{
		Object[][] data = new Object[2][5];
		data[0][0]="Harsh";
		data[0][1]="Soni";
		data[0][2]="fg@gmail.co";
		data[0][3]="Password@123";
		data[0][4]="Password@123";
		data[1][0]="Dev";
		data[1][1]="Soni";
		data[1][2]="fgj@gmail.co";
		data[1][3]="Password@123";
		data[1][4]="Password@123";
		return data;
	}
}