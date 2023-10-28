package FrameworkIntro;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FrameworkIntro.ListenerImplementation.class)
public class LoginTest extends BaseTest{
	
	@Test(dataProvider ="testDataLogin")
	public void login(String userName, String Password) {
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	@DataProvider(name = "testDataLogin")
	public Object[][] testData(){
		Object[][] data = new Object[2][2];
		data[0][0]="xyz@gmail.co";
		data[0][1]="Password@123";
		data[1][0]="xyzs@gmail.co";
		data[1][1]="Password@123";
		return data;
	}
}
