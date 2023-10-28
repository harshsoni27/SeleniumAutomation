package FrameworkIntro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderLogin {
		@Test(dataProvider ="testData")
		public void dataDrivenTesting(String userName, String Password) {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		}
		@DataProvider(name = "testData")
		public Object[][] testData(){
			Object[][] data = new Object[2][2];
			data[0][0]="xyz@gmail.co";
			data[0][1]="Password@123";
			data[1][0]="xyzs@gmail.co";
			data[1][1]="Password@123";
			return data;
		}

	}
