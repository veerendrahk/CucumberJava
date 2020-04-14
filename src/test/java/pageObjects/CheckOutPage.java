package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Cucumber.VeeruTestngapplicationname.Base;

public class CheckOutPage extends Base {
	//public WebDriver driver;
	By clickProceedbutton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	
	
	//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"))
	
	public WebElement clickProceedToCheckout() {
		return driver.findElement(clickProceedbutton);
	}

}
