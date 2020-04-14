package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Cucumber.VeeruTestngapplicationname.Base;

public class ProductPage extends Base {
	//public WebDriver driver;
	By prodname=By.xpath("//p[@class='product-name']");
	
	
	//driver.findElement(By.xpath("//p[@class='product-name']")
	
	public WebElement verifyproductName() {
		return driver.findElement(prodname);
		
	}
	
	
	
	
	
	

}
