package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement w= driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select s=new Select(w);
		s.selectByValue("https://demowebshop.tricentis.com/books?pagesize=4");
		s.selectByIndex(2);

	}

}
