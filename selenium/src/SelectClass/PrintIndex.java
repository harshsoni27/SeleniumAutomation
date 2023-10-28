package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement elements =  driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select s=new Select(elements);
		List<WebElement> options = s.getOptions();
		for(WebElement a:options) {
			if(a.getText().equalsIgnoreCase("Created on")) {
				System.out.println("The Index of 'Created on' option is - "+ options.indexOf(a));
			}
		}
		driver.close();
	}

}
