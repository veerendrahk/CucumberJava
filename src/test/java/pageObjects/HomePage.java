package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Cucumber.VeeruTestngapplicationname.Base;

public class HomePage {                    //Ist Method - we can extend from base class to give life to driver here public class HomePage extend Base
	                                     //And mention the global variable WebDriver driver; here
	public WebDriver driver;   //Now local variable go life of MyStepDefinition driver after constructor invokes in run time through this operator
	public HomePage(WebDriver driver) {  //there should be a mechanism to pass this driver variable from our MystepDefinition to Homepage.java class. First of all we need to To tell our HomePage.java class you need to expect one driver variable into your class
       this.driver=driver;               //To give that expectation we need to define Constructor and clearly define that there is a variable called WebDriver driver which will be passed into your test
	}                                     //For that reason we are creating a Constructor in this page object class. Basically we will ask to pass this driver into this class
	
	//Page object Model is a Pattern not a framework
	By search=By.xpath("//input[@type='search']");            //2)We will assign locator to one variable called search with return type By     
	By add=By.xpath("//button[contains(text(),'ADD TO CART')]");    //object locator should be centralized bcoz this search object locator is used in the multiple positions tomorrow that object locator got changed.
	By result=By.xpath("//h4[@class='product-name']");             //Ex:type='search' due to latest changes in our web app
	By cartbag=By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");  //Now you need to change in all the locations where ever you declared that xpath instead that we could have centralized the xpath using one variable and call that variable whereever we want
	                                               //Now if there is change only change here then automatically it get updated no need to 
	/*driver.findElement(By.xpath("//input[@type='search']"));         //1)we will take one object from MyStepDefinition*/	
	//driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]"))
	//driver.findElement(By.xpath("//h4[@class='product-name']"))
	//driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")
	public WebElement getSearchfromSearchtextbox() {              //3)We will create a method
		return driver.findElement(search);
		//return driver.findElement(By.xpath("//input[@type='search']"));  //we can also return the entire it is not suggestible to declare xpath object inside this method
		                                                                 //object locator should be centralized(why we have not mentioned object locator in the method)
	}
	
       /*public WebElement getSearch1() {             
		     return driver.findElement(By.xpath("//input[@type='search']"));  //Same object in multiple location
            }*/ 
	
	public WebElement verifyResult() {              
		return driver.findElement(result);
   }
	
   public WebElement addToCart() {              
		return driver.findElement(add);
   }
   
   public WebElement clichOnCart() {              
		return driver.findElement(cartbag);
  }

}
