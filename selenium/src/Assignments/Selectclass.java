package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement w= driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Select s=new Select(w);
		s.selectByIndex(1);
		Thread.sleep(1000);
		WebElement w1= driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Select s1=new Select(w1);
		s1.selectByVisibleText("Name: Z to A");
		Thread.sleep(1000);
		WebElement w2= driver.findElement(By.xpath("//select[@name='products-orderby']"));
		Select s2=new Select(w2);
		s2.selectByValue("https://demowebshop.tricentis.com/books?orderby=15");
		Thread.sleep(1000);
		driver.close();
	}
}